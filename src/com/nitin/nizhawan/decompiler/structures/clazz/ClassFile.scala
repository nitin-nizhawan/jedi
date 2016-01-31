package com.nitin.nizhawan.decompiler.structures.clazz

import com.nitin.nizhawan.decompiler.main.ByteReader
import com.nitin.nizhawan.decompiler.method.MethodInfos
import com.nitin.nizhawan.decompiler.structures.constantpool.ConstantPool
import com.nitin.nizhawan.decompiler.structures.field.{AttributeInfos, FieldInfos}
import com.nitin.nizhawan.decompiler.structures.AttributeInfo

/**
 * Created by nitin on 13/12/15.
 */
class ClassFile(br:ByteReader,bytes:Array[Byte]) {
  val magic = toInt(br.read(4))
  val minorVer = toInt(br.read(2))
  val majorVer = toInt(br.read(2))
  val constPoolCount = toInt(br.read(2))
  val cp_info = new ConstantPool(br, constPoolCount)
  val access_flags = new ClassAccessFlag(br.readChar())
  val this_class = new ClassObj(toInt(br.read(2)), cp_info)
  val super_class = new ClassObj(toInt(br.read(2)), cp_info)
  val interfaces_count = toInt(br.read(2))
  val interface_info = readInterfaceInfo(interfaces_count)
  val fields_count = toInt(br.read(2))
  val field_info = new FieldInfos(fields_count,br,cp_info)
  val methods_count = toInt(br.read(2))
  val method_info = new MethodInfos(methods_count,br,cp_info)
  val attr_count = toInt(br.read(2))
  val attr_info = new AttributeInfos(attr_count,br,cp_info)


  def toInt(ar: Array[Byte]): Int = {
    var i: Int = 0;
    for (b <- ar) {
      i = i << 8;
      i = i | (b & 0xFF)
    }
    i
  }

  def readInterfaceInfo(n: Int) = {
    br.read(n * 2).grouped(2).map(toInt(_))
  }

  def decompile = {
    (if (this_class.pkg.length > 0) {
      "package " + this_class.pkg + ";\n"
    } else "")+
    access_flags + this_class.className + " extends " + super_class.className + " {\n"+
    field_info.toString+"\n"+
    method_info.toString+"\n"+
    "}"
  }

  override def toString = {
    "%04X".format(magic) +
      "\nMajor Ver:" + majorVer +
      "\nMinor Ver:" + minorVer +
      "\nConst Pool Size: " + constPoolCount +
      "\nConstant Pool \n" + cp_info +
      "\nThis Class : " + this_class +
      "\nSuper Class: " + super_class +
      "\nNum Interfaces:" + interfaces_count +
      "\nNum Fields :" + fields_count +
      "\nNum Methods :" + methods_count +
      "\nClass Attrs Count :" + attr_count
  }
}