package com.nitin.nizhawan.decompiler.structures

import com.nitin.nizhawan.decompiler.instructionset.Instruction
import com.nitin.nizhawan.decompiler.main.ByteReader
import com.nitin.nizhawan.decompiler.structures.constantpool.ConstantPool
import com.nitin.nizhawan.decompiler.structures.field.AttributeInfos
/**
 * Created by nitin on 13/12/15.
 */
class AttributeInfo(name:String,br:ByteReader,cp:ConstantPool){
  val att_name = name
  val attr_len = br.readInt()
  val info = readData
  def readData= br.read(attr_len)
  override def toString = {
    ""
  }
}
class ConstantValueAttribute(name:String,br:ByteReader,cp:ConstantPool) extends AttributeInfo(name,br,cp){

}
class CodeAttribute(name:String,br:ByteReader,cp:ConstantPool) extends AttributeInfo(name,br,cp){
   val mnemonic = List("nop",
  "aconst_null",
  "iconst_m1",
  "iconst_0",
  "iconst_1",
  "iconst_2",
  "iconst_3",
  "iconst_4",
  "iconst_5",
  "lconst_0",
  "lconst_1",
  "fconst_0",
  "fconst_1",
  "fconst_2",
  "dconst_0",
  "dconst_1",
  "bipush",
  "sipush",
  "ldc",
  "ldc_w",
  "ldc2_w",
  "iload",
  "lload",
  "fload",
  "dload",
  "aload",
  "iload_0",
  "iload_1",
  "iload_2",
  "iload_3",
  "lload_0",
  "lload_1",
  "lload_2",
  "lload_3",
  "fload_0",
  "fload_1",
  "fload_2",
  "fload_3",
  "dload_0",
  "dload_1",
  "dload_2",
  "dload_3",
  "aload_0",
  "aload_1",
  "aload_2",
  "aload_3",
  "iaload",
  "laload",
  "faload",
  "daload",
  "aaload",
  "baload",
  "caload",
  "saload",
  "istore",
  "lstore",
  "fstore",
  "dstore",
  "astore",
  "istore_0",
  "istore_1",
  "istore_2",
  "istore_3",
  "lstore_0",
  "lstore_1",
  "lstore_2",
  "lstore_3",
  "fstore_0",
  "fstore_1",
  "fstore_2",
  "fstore_3",
  "dstore_0",
  "dstore_1",
  "dstore_2",
  "dstore_3",
  "astore_0",
  "astore_1",
  "astore_2",
  "astore_3",
  "iastore",
  "lastore",
  "fastore",
  "dastore",
  "aastore",
  "bastore",
  "castore",
  "sastore",
  "pop",
  "pop2",
  "dup",
  "dup_x1",
  "dup_x2",
  "dup2",
  "dup2_x1",
  "dup2_x2",
  "swap",
  "iadd",
  "ladd",
  "fadd",
  "dadd",
  "isub",
  "lsub",
  "fsub",
  "dsub",
  "imul",
  "lmul",
  "fmul",
  "dmul",
  "idiv",
  "ldiv",
  "fdiv",
  "ddiv",
  "irem",
  "lrem",
  "frem",
  "drem",
  "ineg",
  "lneg",
  "fneg",
  "dneg",
  "ishl",
  "lshl",
  "ishr",
  "lshr",
  "iushr",
  "lushr",
  "iand",
  "land",
  "ior",
  "lor",
  "ixor",
  "lxor",
  "iinc",
  "i2l",
  "i2f",
  "i2d",
  "l2i",
  "l2f",
  "l2d",
  "f2i",
  "f2l",
  "f2d",
  "d2i",
  "d2l",
  "d2f",
  "i2b",
  "i2c",
  "i2s",
  "lcmp",
  "fcmpl",
  "fcmpg",
  "dcmpl",
  "dcmpg",
  "ifeq",
  "ifne",
  "iflt",
  "ifge",
  "ifgt",
  "ifle",
  "if_icmpeq",
  "if_icmpne",
  "if_icmplt",
  "if_icmpge",
  "if_icmpgt",
  "if_icmple",
  "if_acmpeq",
  "if_acmpne",
  "goto",
  "jsr",
  "ret",
  "tableswitch",
  "lookupswitch",
  "ireturn",
  "lreturn",
  "freturn",
  "dreturn",
  "areturn",
  "return",
  "getstatic",
  "putstatic",
  "getfield",
  "putfield",
  "invokevirtual",
  "invokespecial",
  "invokestatic",
  "invokeinterface",
  "invokedynamic",
  "new",
  "newarray",
  "anewarray",
  "arraylength",
  "athrow",
  "checkcast",
  "instanceof",
  "monitorenter",
  "monitorexit",
  "wide",
  "multianewarray",
  "ifnull",
  "ifnonnull",
  "goto_w",
  "jsr_w",
  "breakpoint",
  "impdep1",
  "impdep2").toArray


 override def readData = {new Array[Byte](0)}
   val max_stack  = br.readChar()
   val max_locale = br.readChar()
   val code_length = br.readInt()
   val instructions = toCode(br.read(code_length))
   val exception_table_len = br.readChar()
   val exception_table = br.read(exception_table_len*(2+2+2+2))
   val attr_count = br.readChar()
   val attr_infos = new AttributeInfos(attr_count,br,cp)
   def toCode(data:Array[Byte],isWide:Boolean = false):List[Instruction]={
     if(data.length>0) {
       val instr = Instruction(data,isWide)
       List(instr) ++ toCode(data.slice(instr.size, data.length),instr.isWide)
     }else {
       List[Instruction]()
     }
   }
   override def toString = {
      instructions.mkString("\n")
   }
}

class StackMapTableAttribute(name:String,br:ByteReader,cp:ConstantPool) extends AttributeInfo(name,br,cp){

}
class ExceptionsAttribute(name:String,br:ByteReader,cp:ConstantPool) extends AttributeInfo(name,br,cp){

}
class InnerClassesAttribute(name:String,br:ByteReader,cp:ConstantPool) extends AttributeInfo(name,br,cp){

}
class EnclosingMethodAttribute(name:String,br:ByteReader,cp:ConstantPool) extends AttributeInfo(name,br,cp){

}
object AttributeInfo{
  def apply(br:ByteReader,cp:ConstantPool):AttributeInfo= {
    val attr_name_index = br.readChar ()
    val attr_name = cp.str (attr_name_index)
    if ("ConstantValue" == attr_name) {
        new ConstantValueAttribute(attr_name,br,cp)
    }else if("Code" == attr_name){
        new CodeAttribute(attr_name,br,cp)
    }else if("StackMapTable" == attr_name){
      new StackMapTableAttribute(attr_name,br,cp)
    } else if("Exceptions" == attr_name){
      new ExceptionsAttribute(attr_name,br,cp)
    } else if("InnerClasses" == attr_name){
        new InnerClassesAttribute(attr_name,br,cp)
    } else if("EnclosingMethod"== attr_name){
       new EnclosingMethodAttribute(attr_name,br,cp)
    }else {
        new AttributeInfo(attr_name,br,cp)
    }
  }
}