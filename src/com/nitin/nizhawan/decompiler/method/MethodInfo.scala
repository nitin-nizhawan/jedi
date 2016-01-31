package com.nitin.nizhawan.decompiler.method

import com.nitin.nizhawan.decompiler.main.ByteReader
import com.nitin.nizhawan.decompiler.structures.constantpool.ConstantPool
import com.nitin.nizhawan.decompiler.structures.field.FieldInfo

/**
 * Created by nitin on 13/12/15.
 */
class MethodInfo(br:ByteReader,cp:ConstantPool) extends FieldInfo(br,cp){
   val methodDescriptor = new MethodDescriptor(descriptor)

   override def toString ={
     val hasCode = attribute_info.has("Code")
    access_flags + " "+methodDescriptor.returnType +" "+name+" ("+methodDescriptor.args.mkString(", ") +")"+ (if(hasCode) "{\n" else "")+
      (if(hasCode)attribute_info.attributes.find(_.att_name=="Code").get.toString else "")+"\n"+
     (if(hasCode) "}\n" else "")
  }
}
