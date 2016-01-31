package com.nitin.nizhawan.decompiler.structures.clazz

/**
 * Created by nitin on 13/12/15.
 */
class ClassAccessFlag(flag:Int){
  val ACC_PUBLIC = 0x0001
  val ACC_FINAL = 0x0010
  val ACC_SUPER = 0x0020
  val ACC_INTERFACE = 0x0200
  val ACC_ABSTRACT = 0x0400
  val ACC_SYNTHETIC = 0x1000
  val ACC_ANNOTATION = 0x2000
  val ACC_ENUM = 0x4000
  lazy val isPublic = (flag & ACC_PUBLIC) != 0
  lazy val isFinal = (flag & ACC_FINAL) != 0
  lazy val isInterface = (flag & ACC_INTERFACE) != 0
  lazy val isAbstract = (flag & ACC_ABSTRACT) != 0
  lazy val isEnum = (flag & ACC_ENUM) != 0

  override def toString = {
    (if(isFinal) "final " else "")+
      (if(isPublic) "public " else "")+
      (if(isAbstract) "abstract " else "")+
      (if(isEnum) "enum " else if(isInterface) "interface " else "class ")
  }
}
