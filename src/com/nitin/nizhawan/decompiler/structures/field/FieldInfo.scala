package com.nitin.nizhawan.decompiler.structures.field

import com.nitin.nizhawan.decompiler.main.ByteReader
import com.nitin.nizhawan.decompiler.structures.AttributeInfo
import com.nitin.nizhawan.decompiler.structures.constantpool.ConstantPool

/**
 * Created by nitin on 13/12/15.
 */
class FieldInfo(br:ByteReader,cp:ConstantPool){
  val access_flags = new FieldAccessFlag(br.readChar())
  val name_index = br.readChar()
  val name = cp.str(name_index)
  val descriptor_index = br.readChar()
  val descriptor = cp.str(descriptor_index)
  val attribute_count = br.readChar()
  val attribute_info = new AttributeInfos(attribute_count,br,cp)

  override def toString ={
    access_flags + " "+descriptor +" "+name
  }
}
