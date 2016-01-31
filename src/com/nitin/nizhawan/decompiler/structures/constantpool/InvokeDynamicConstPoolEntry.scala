package com.nitin.nizhawan.decompiler.structures.constantpool

import com.nitin.nizhawan.decompiler.main.ByteReader


class InvokeDynamicConstPoolEntry(tag:Int,br:ByteReader,pool:ConstantPool) extends ConstPoolEntry(tag,br,pool){
  val index = br.readChar()
  val index2 = br.readChar()
  override lazy val info = pool.poolEntries(index).info+"."+pool.poolEntries(index2).info
}

