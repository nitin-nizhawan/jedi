package com.nitin.nizhawan.decompiler.structures.field

import com.nitin.nizhawan.decompiler.main.ByteReader
import com.nitin.nizhawan.decompiler.structures.AttributeInfo
import com.nitin.nizhawan.decompiler.structures.constantpool.ConstantPool

/**
 * Created by nitin on 14/12/15.
 */
class AttributeInfos(n:Int,br:ByteReader,cp:ConstantPool) {
  val attributes = new Array[AttributeInfo](n)

  for(i<- 0 until n){
    attributes(i) = AttributeInfo(br,cp)
  }
  def has(attr:String) = attributes.find(_.att_name==attr) != None
  override def toString ={
      attributes.map(_.toString).mkString("\n")
  }
}
