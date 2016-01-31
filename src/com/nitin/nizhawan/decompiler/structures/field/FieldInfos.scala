package com.nitin.nizhawan.decompiler.structures.field

import com.nitin.nizhawan.decompiler.main.ByteReader
import com.nitin.nizhawan.decompiler.structures.constantpool.ConstantPool

/**
 * Created by nitin on 13/12/15.
 */
class FieldInfos(n:Int,br:ByteReader,cp:ConstantPool) {
  val fields = new Array[FieldInfo](n)

  for(i<- 0 until n){
     fields(i) = createField(br,cp)
  }
  def createField(br:ByteReader,cp:ConstantPool) = new FieldInfo(br,cp)
  override def toString = {
     fields.map(_.toString).mkString("\n")
  }
}
