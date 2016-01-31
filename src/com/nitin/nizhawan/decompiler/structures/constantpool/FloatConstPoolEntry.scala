package com.nitin.nizhawan.decompiler.structures.constantpool

import com.nitin.nizhawan.decompiler.main.ByteReader

/**
 * Created by nitin on 13/12/15.
 */
class FloatConstPoolEntry(tag:Int,br:ByteReader,pool:ConstantPool) extends ConstPoolEntry(tag,br,pool){
  val int_val = br.readInt()
  override lazy val info = int_val+"";
}
