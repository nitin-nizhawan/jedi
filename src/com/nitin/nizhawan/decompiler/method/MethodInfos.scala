package com.nitin.nizhawan.decompiler.method

import com.nitin.nizhawan.decompiler.main.ByteReader
import com.nitin.nizhawan.decompiler.structures.constantpool.ConstantPool
import com.nitin.nizhawan.decompiler.structures.field.FieldInfos

/**
 * Created by nitin on 13/12/15.
 */
class MethodInfos(n:Int,br:ByteReader,cp:ConstantPool) extends FieldInfos(n,br,cp) {
  override def createField(br:ByteReader,cp:ConstantPool) = new MethodInfo(br,cp)
}
