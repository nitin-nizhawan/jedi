package com.nitin.nizhawan.decompiler.structures.constantpool

import com.nitin.nizhawan.decompiler.main.ByteReader

/**
 * Created by nitin on 13/12/15.
 */
object ConstPoolEntry{
  def apply(br:ByteReader,pool:ConstantPool)={
    val tag = br.read(1)(0)
    if(tag == 0){
      new UnknownConstPoolEntry(tag,br,pool)
    } else if(tag == 1){
      new Utf8ConstPoolEntry(tag,br,pool)
    } else if(tag == 3){
      new IntegerConstPoolEntry(tag,br,pool)
    } else if(tag == 4){
      new FloatConstPoolEntry(tag,br,pool)
    } else if(tag == 5){
      new LongConstPoolEntry(tag,br,pool)
    } else if(tag == 6){
      new DoubleConstPoolEntry(tag,br,pool)
    } else if(tag == 7){
      new ClassConstPoolEntry(tag,br,pool)
    } else if(tag == 8){
      new StringConstPoolEntry(tag,br,pool)
    } else if(tag == 9){
      new FieldRefConstPoolEntry(tag,br,pool)
    } else if(tag == 10){
      new MethodRefConstPoolEntry(tag,br,pool)
    } else if(tag == 11){
      new InterfaceMethodRefConstPoolEntry(tag,br,pool)
    } else if(tag == 12){
      new NameAndTypeConstPoolEntry(tag,br,pool)
    } else if(tag == 13){
      new UnknownConstPoolEntry(tag,br,pool)
    } else if(tag == 14){
      new UnknownConstPoolEntry(tag,br,pool)
    } else if(tag == 15){
      new MethodHandleConstPoolEntry(tag,br,pool)
    } else if(tag == 16){
      new MethodTypeConstPoolEntry(tag,br,pool)
    } else if(tag == 17){
      new UnknownConstPoolEntry(tag,br,pool)
    } else if(tag == 18){
      new InvokeDynamicConstPoolEntry(tag,br,pool)
    } else {
      new UnknownConstPoolEntry(tag,br,pool)
    }
  }
}
class ConstPoolEntry(tag:Int,br:ByteReader,pool:ConstantPool){
  val tagList=new Array[String](0):+
    "Unknown_0":+
    "Utf8":+
    "Unknown_2":+
    "Integer":+
    "Float":+
    "Long":+
    "Double":+
    "Class":+
    "String":+
    "Fieldref":+
    "Methodref":+
    "InterfaceMethodref":+
    "NameAndType":+
    "Unknown_13":+
    "Unknown_14":+
    "MethodHandle":+
    "MethodType":+
    "Unknown_17":+
    "InvokeDynamic";
  lazy val info = "Not overridden"

  override def toString={
    if(tag<tagList.length)
      tagList(tag)+"   "+info
    else
      "error tag"
  }
}
