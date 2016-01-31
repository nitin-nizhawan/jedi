package com.nitin.nizhawan.decompiler.structures.constantpool

import com.nitin.nizhawan.decompiler.main.ByteReader

/**
 * Created by nitin on 13/12/15.
 */
class ConstantPool(br:ByteReader,size:Int){
  val poolEntries = new Array[ConstPoolEntry](size)
  poolEntries(0) = new UnknownConstPoolEntry(0,br,this)
  for(i <- 1 until size){
    poolEntries(i) = ConstPoolEntry(br,this)
  }
  def str(idx:Int) = poolEntries(idx).info
  override def toString = {
    poolEntries.tail.map(_.toString).mkString("\n")
  }
}