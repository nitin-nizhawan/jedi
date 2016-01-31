package com.nitin.nizhawan.decompiler.structures.clazz

import com.nitin.nizhawan.decompiler.structures.constantpool.ConstantPool

/**
 * Created by nitin on 13/12/15.
 */
class ClassObj(index:Int,cp:ConstantPool){
  val class_string = cp.poolEntries(index).info
  val pkg = ("/"+class_string).substring(1,("/"+class_string).lastIndexOf("/")).replaceAll("/",".")
  val className = ("/"+class_string).substring(("/"+class_string).lastIndexOf("/")+1)
}
