package com.nitin.nizhawan.decompiler.method

import scala.collection.immutable.List

/**
 * Created by nitin on 19/12/15.
 */
class MethodDescriptor(descriptor:String) {
   val extractParams = """(?<=\()(.*)(?=\))""".r
   val returnType = getType(descriptor.split("\\)")(1))
   val args = extractParams.findAllIn(descriptor).next.split(";").filter(!_.isEmpty).map(getType(_))
   def getType(typeSign:String) :String={
     println("g"+typeSign)
     (typeSign.trim.toCharArray.toList.dropWhile(_=='[')(0) match {
        case 'L' => new String(typeSign.trim.toCharArray.toList.dropWhile(_=='[').tail.toArray).split(";")(0).replaceAll("/",".")
        case 'B' => "boolean"
        case 'V' => "void"
        case 'I' => "int"
        case 'F' => "float"
        case _ => "H"
      } ) +
      typeSign.trim.toCharArray.toList.takeWhile(_=='[').map(_=>"[]").mkString("")
   }
}
