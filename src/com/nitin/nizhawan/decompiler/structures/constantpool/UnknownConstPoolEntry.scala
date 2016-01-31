package com.nitin.nizhawan.decompiler.structures.constantpool

import com.nitin.nizhawan.decompiler.main.ByteReader

/**
 * Created by nitin on 13/12/15.
 */
class UnknownConstPoolEntry(tag:Int,br:ByteReader,pool:ConstantPool) extends ConstPoolEntry(tag,br,pool){
  override lazy val info = "Uknown_"+tag;
}
