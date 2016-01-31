package com.nitin.nizhawan.decompiler.main

/**
 * Created by nitin on 13/12/15.
 */
class ByteReader(bytes:Array[Byte]){
  var pos:Int = 0
  def read(len:Int):Array[Byte]={
    val ret = bytes.slice(pos,pos+len)
    pos = pos + len;
    ret
  }
  def toInt(ar:Array[Byte]):Int={
    var i:Int =0;
    for(b<-ar){
      i = i<<8;
      i = i|(b&0xFF)
    }
    i
  }

  def readInt():Int={
    toInt(read(4))
  }
  def readChar():Int={
    val b = read(2)
    toInt(b)
  }
  def takeWhile(p:(Byte)=>Boolean):Array[Byte]={
    val ret = bytes.slice(pos,bytes.length).takeWhile(p)
    pos = pos + ret.length;
    ret
  }
}
