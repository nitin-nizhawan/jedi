package com.nitin.nizhawan.decompiler.instructionset

import scala.collection.mutable

/**
 * Created by nitin on 20/12/15.
 */
class Instruction(code:Array[Byte],wideMode:Boolean = false) {
   val isWide = false
   val size = 1
   val mnemonic = "base"
   var data = code(0)
   val opcode = 0x00
   def register(f:(Array[Byte],Boolean)=>Instruction)={
     Instruction.registry.put(opcode,f)
  }
   override def toString = this.opcode+"s"
}
class Nop(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val opcode = 0x00
  register(new Nop(_,_))
}
class AConstNull(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
   override val mnemonic = "aconst_null"
   override val opcode = 0x01
  register(new Nop(_,_))
}

class IConstM1(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "iconst_m1"
  override val opcode = 0x02
  register(new Nop(_,_))

}
class IConst0(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "iconst_0"
  override val opcode = 0x03
  register(new Nop(_,_))
}
class IConst1(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "iconst_1"
  override val opcode = 0x04
  register(new Nop(_,_))
}
class IConst2(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "iconst_2"
  override val opcode = 0x05
  register(new Nop(_,_))
}
class IConst3(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "iconst_3"
  override val opcode = 0x06
  register(new Nop(_,_))
}
class IConst4(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "iconst_4"
  override  val opcode = 0x07
  register(new Nop(_,_))
}
class IConst5(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "iconst_5"
  override  val opcode = 0x08
}
class LConst0(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "lconst_0"
  override  val opcode = 0x09
  register(new Nop(_,_))
}
class LConst1(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "lconst_1"
  override  val opcode = 0x0a
  register(new Nop(_,_))
}
class FConst0(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "fconst_0"
  override  val opcode = 0x0b
  register(new Nop(_,_))
}
class FConst1(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "fconst_1"
  override  val opcode = 0x0c
  register(new Nop(_,_))
}
class FConst2(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "fconst_2"
  override  val opcode = 0x0d
  register(new Nop(_,_))
}
class DConst0(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x0e
  register(new Nop(_,_))
}
class DConst1(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_1"
  override  val opcode = 0x0f
  register(new Nop(_,_))
}

class BiPush(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 2
  override val mnemonic = "dconst_0"
  override  val opcode = 0x10
  register(new Nop(_,_))
}
class SiPush(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 3
  override val mnemonic = "dconst_0"
  override  val opcode = 0x11
  register(new Nop(_,_))
}
class Ldc(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 2
  override val mnemonic = "dconst_0"
  override  val opcode = 0x12
  register(new Nop(_,_))
}
class Ldc_w(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 3
  override val mnemonic = "dconst_0"
  override  val opcode = 0x13
  register(new Nop(_,_))
}
class Ldc2_w(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 3
  override val mnemonic = "dconst_0"
  override  val opcode = 0x14
  register(new Nop(_,_))
}
class ILoad(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 2
  override val mnemonic = "dconst_0"
  override  val opcode = 0x15
  register(new Nop(_,_))
}
class LLoad(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 2
  override val mnemonic = "dconst_0"
  override  val opcode = 0x16
  register(new Nop(_,_))
}
class FLoad(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 2
  override val mnemonic = "dconst_0"
  override  val opcode = 0x17
  register(new Nop(_,_))
}
class DLoad(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 2
  override val mnemonic = "dconst_0"
  override  val opcode = 0x18
  register(new Nop(_,_))
}
class ALoad(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 2
  override val mnemonic = "dconst_0"
  override  val opcode = 0x19
  register(new Nop(_,_))
}
class ILoad0(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x1a
  register(new Nop(_,_))
}
class ILoad1(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x1b
  register(new Nop(_,_))
}
class ILoad2(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x1c
  register(new Nop(_,_))
}
class ILoad3(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x1d
  register(new Nop(_,_))
}
class LLoad0(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x1e
  register(new Nop(_,_))
}
class LLoad1(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x1f
  register(new Nop(_,_))
}
class LLoad2(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x20
  register(new Nop(_,_))
}
class LLoad3(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x21
  register(new Nop(_,_))
}
class FLoad0(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x22
  register(new Nop(_,_))
}
class FLoad1(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x23
  register(new Nop(_,_))
}
class FLoad2(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x24
  register(new Nop(_,_))
}
class FLoad3(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x25
  register(new Nop(_,_))
}
class DLoad0(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x26
  register(new Nop(_,_))
}
class DLoad1(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x27
  register(new Nop(_,_))
}
class DLoad2(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x28
  register(new Nop(_,_))
}
class DLoad3(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x29
  register(new Nop(_,_))
}
class ALoad0(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x2a
  register(new Nop(_,_))
}
class ALoad1(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x2b
  register(new Nop(_,_))
}
class ALoad2(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x2c
  register(new Nop(_,_))
}
class ALoad3(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x2d
  register(new Nop(_,_))
}
class IALoad(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x2e
  register(new Nop(_,_))
}
class LALoad(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x2f
  register(new Nop(_,_))
}
class FALoad(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x30
  register(new Nop(_,_))
}
class DALoad(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x31
  register(new Nop(_,_))
}
class AALoad(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x32
  register(new Nop(_,_))
}
class BALoad(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x33
  register(new Nop(_,_))
}
class CALoad(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x34
  register(new Nop(_,_))
}
class SALoad(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x35
  register(new Nop(_,_))
}

class IStore(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 2
  override val mnemonic = "dconst_0"
  override  val opcode = 0x36
  register(new Nop(_,_))
}
class LStore(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 2
  override val mnemonic = "dconst_0"
  override  val opcode = 0x37
  register(new Nop(_,_))
}
class FStore(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 2
  override val mnemonic = "dconst_0"
  override  val opcode = 0x38
  register(new Nop(_,_))
}
class DStore(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 2
  override val mnemonic = "dconst_0"
  override  val opcode = 0x39
  register(new Nop(_,_))
}
class AStore(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 2
  override val mnemonic = "dconst_0"
  override  val opcode = 0x3a
  register(new Nop(_,_))
}
class IStore0(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x3b
  register(new Nop(_,_))
}
class IStore1(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x3c
  register(new Nop(_,_))
}
class IStore2(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){

  override val mnemonic = "dconst_0"
  override  val opcode = 0x3d
  register(new Nop(_,_))
}
class IStore3(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x3e
  register(new Nop(_,_))
}
class LStore0(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x3f
  register(new Nop(_,_))
}
class LStore1(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x40
  register(new Nop(_,_))
}
class LStore2(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x41
  register(new Nop(_,_))
}
class LStore3(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x42
  register(new Nop(_,_))
}
class FStore0(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x43
  register(new Nop(_,_))
}
class FStore1(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x44
  register(new Nop(_,_))
}
class FStore2(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x45
  register(new Nop(_,_))
}
class FStore3(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x46
  register(new Nop(_,_))
}
class DStore0(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x47
  register(new Nop(_,_))
}
class DStore1(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x48
  register(new Nop(_,_))
}
class DStore2(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x49
  register(new Nop(_,_))
}
class DStore3(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x4a
  register(new Nop(_,_))
}

class AStore0(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x4b
  register(new Nop(_,_))
}
class AStore1(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x4c
  register(new Nop(_,_))
}
class AStore2(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x4d
  register(new Nop(_,_))
}
class AStore3(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x4e
  register(new Nop(_,_))
}
class IAStore(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x4f
  register(new Nop(_,_))
}
class LAStore(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x50
  register(new Nop(_,_))
}
class FAStore(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x51
  register(new Nop(_,_))
}
class DAStore(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x52
  register(new Nop(_,_))
}
class AAStore(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x53
  register(new Nop(_,_))
}

class BAStore(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x54
  register(new Nop(_,_))
}
class CAStore(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x55
  register(new Nop(_,_))
}
class SAStore(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x56
  register(new Nop(_,_))
}



class Pop(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x57
  register(new Nop(_,_))
}
class Pop2(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x58
  register(new Nop(_,_))
}
class Dup(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x59
  register(new Nop(_,_))
}
class DupX1(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x5a
  register(new Nop(_,_))
}
class DupX2(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x5b
  register(new Nop(_,_))
}
class Dup2(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x5c
  register(new Nop(_,_))
}
class Dup2X1(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x5d
  register(new Nop(_,_))
}
class Dup2X2(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x5e
  register(new Nop(_,_))
}
class Swap(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x5f
  register(new Nop(_,_))
}


class IAdd(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x60
  register(new Nop(_,_))
}
class LAdd(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x61
  register(new Nop(_,_))
}
class FAdd(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x62
  register(new Nop(_,_))
}
class DAdd(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x63
  register(new Nop(_,_))
}
class ISub(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x64
  register(new Nop(_,_))
}
class LSub(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x65
  register(new Nop(_,_))
}
class FSub(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x66
  register(new Nop(_,_))
}
class DSub(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x67
  register(new Nop(_,_))
}
class IMul(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x68
  register(new Nop(_,_))
}
class LMul(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x69
  register(new Nop(_,_))
}
class FMul(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x6a
  register(new Nop(_,_))
}
class DMul(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x6b
  register(new Nop(_,_))
}
class IDiv(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x6c
  register(new Nop(_,_))
}
class LDiv(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x6d
  register(new Nop(_,_))
}
class FDiv(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x6e
  register(new Nop(_,_))
}
class DDiv(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x6f
  register(new Nop(_,_))
}



class IRem(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x70
  register(new Nop(_,_))
}
class LRem(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x71
  register(new Nop(_,_))
}
class FRem(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode) {
  override val mnemonic = "dconst_0"
  override val opcode = 0x72
  register(new Nop(_,_))
}
class DRem(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x73
  register(new Nop(_,_))
}
class INeg(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x74
  register(new Nop(_,_))
}
class LNeg(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x75
  register(new Nop(_,_))
}
class FNeg(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x76
  register(new Nop(_,_))
}
class DNeg(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x77
  register(new Nop(_,_))
}
class IShl(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x78
  register(new Nop(_,_))
}
class LShl(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x79
  register(new Nop(_,_))
}
class IShr(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x7a
  register(new Nop(_,_))
}
class LShr(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x7b
  register(new LShr(_,_))
}
class IUShr(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x7c
  register(new IUShr(_,_))
}
class LUShr(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x7d
  register(new LUShr(_,_))
}
class IAnd(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x7e
  register(new IAnd(_,_))
}
class LAnd(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x7f
  register(new LAnd(_,_))
}



class IOr(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x80
  register(new IOr(_,_))
}
class LOr(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x81
  register(new LOr(_,_))
}
class IXor(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode) {
  override val mnemonic = "dconst_0"
  override val opcode = 0x82
  register(new IXor(_,_))
}
class LXor(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x83
  register(new LXor(_,_))
}
class IInc(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 3
  override val mnemonic = "dconst_0"
  override  val opcode = 0x84
  register(new IInc(_,_))
}
class I2L(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x85
  register(new I2L(_,_))
}
class I2F(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x86
  register(new I2F(_,_))
}
class I2D(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x87
  register(new I2D(_,_))
}
class L2I(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x88
  register(new L2I(_,_))
}
class L2F(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x89
  register(new L2F(_,_))
}
class L2D(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x8a
  register(new L2D(_,_))
}
class F2I(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x8b
  register(new F2I(_,_))
}
class F2L(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x8c
  register(new F2L(_,_))
}
class F2D(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x8d
  register(new F2D(_,_))
}
class D2I(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x8e
  register(new D2I(_,_))
}
class D2L(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x8f
  register(new D2L(_,_))
}


class D2F(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x90
  register(new D2F(_,_))
}
class I2B(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x91
  register(new I2B(_,_))
}
class I2C(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode) {
  override val mnemonic = "dconst_0"
  override val opcode = 0x92
  register(new I2C(_,_))
}
class I2S(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x93
  register(new I2S(_,_))
}
class LCmp(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x94
  register(new LCmp(_,_))
}
class FCmpL(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x95
  register(new FCmpL(_,_))
}
class FCmpG(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x96
  register(new FCmpG(_,_))
}
class DCmpL(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x97
  register(new DCmpL(_,_))
}
class DCmpG(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0x98
  register(new DCmpG(_,_))
}
class IfEq(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 3
  override val mnemonic = "dconst_0"
  override  val opcode = 0x99
  register(new IfEq(_,_))
}
class IfNe(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 3
  override val mnemonic = "dconst_0"
  override  val opcode = 0x9a
  register(new IfNe(_,_))
}
class IfLt(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 3
  override val mnemonic = "dconst_0"
  override  val opcode = 0x9b
  register(new IfLt(_,_))
}
class IfGe(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 3
  override val mnemonic = "dconst_0"
  override  val opcode = 0x9c
  register(new IfGe(_,_))
}
class IfGt(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 3
  override val mnemonic = "dconst_0"
  override  val opcode = 0x9d
  register(new IfGt(_,_))
}
class IfLe(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 3
  override val mnemonic = "dconst_0"
  override  val opcode = 0x9e
  register(new IfLe(_,_))
}
class IfICmpEq(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 3
  override val mnemonic = "dconst_0"
  override  val opcode = 0x9f
  register(new IfICmpEq(_,_))
}

class IfICmpNe(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 3
  override val mnemonic = "dconst_0"
  override  val opcode = 0xa0
  register(new IfICmpNe(_,_))
}
class IfICmpLt(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 3
  override val mnemonic = "dconst_0"
  override  val opcode = 0xa1
  register(new IfICmpLt(_,_))
}
class IfICmpGe(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode) {
  override val size = 3
  override val mnemonic = "dconst_0"
  override val opcode = 0xa2
  register(new IfICmpGe(_,_))
}
class IfCmpGt(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 3
  override val mnemonic = "dconst_0"
  override  val opcode = 0xa3
  register(new IfCmpGt(_,_))
}
class IfCmpLe(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 3
  override val mnemonic = "dconst_0"
  override  val opcode = 0xa4
  register(new IfCmpLe(_,_))
}
class IfACmpEq(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 3
  override val mnemonic = "dconst_0"
  override  val opcode = 0xa5
  register(new IfACmpEq(_,_))
}
class IfACmpNe(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 3
  override val mnemonic = "dconst_0"
  override  val opcode = 0xa6
  register(new IfACmpNe(_,_))
}
class Goto(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 3
  override val mnemonic = "dconst_0"
  override  val opcode = 0xa7
  register(new Goto(_,_))
}
class Jsr(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 3
  override val mnemonic = "dconst_0"
  override  val opcode = 0xa8
  register(new Jsr(_,_))
}
class Ret(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 2
  override val mnemonic = "dconst_0"
  override  val opcode = 0xa9
  register(new Ret(_,_))
}
class TableSwitch(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0xaa
  register(new TableSwitch(_,_))
}
class LookUpSwitch(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0xab
  register(new LookUpSwitch(_,_))
}
class IReturn(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0xac
  register(new IReturn(_,_))
}
class LReturn(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0xad
  register(new LReturn(_,_))
}
class FReturn(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0xae
  register(new FReturn(_,_))
}
class DReturn(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0xaf
  register(new DReturn(_,_))
}



class AReturn(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0xb0
  register(new AReturn(_,_))
}
class Return(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0xb1
  register(new Return(_,_))
}
class GetStatic(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode) {
  override val size = 3
  override val mnemonic = "dconst_0"
  override val opcode = 0xb2
  register(new GetStatic(_,_))
}
class PutStatic(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 3
  override val mnemonic = "dconst_0"
  override  val opcode = 0xb3
  register(new PutStatic(_,_))
}
class GetField(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 3
  override val mnemonic = "dconst_0"
  override  val opcode = 0xb4
  register(new GetField(_,_))
}
class PutField(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 3
  override val mnemonic = "dconst_0"
  override  val opcode = 0xb5
  register(new PutField(_,_))
}
class InvokeVirtual(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 3
  override val mnemonic = "dconst_0"
  override  val opcode = 0xb6
  register(new InvokeVirtual(_,_))
}
class InvokeSpecial(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 3
  override val mnemonic = "dconst_0"
  override  val opcode = 0xb7
  register(new InvokeSpecial(_,_))
}
class InvokeStatic(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 3
  override val mnemonic = "dconst_0"
  override  val opcode = 0xb8
  register(new InvokeStatic(_,_))
}
class InvokeInterface(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 5
  override val mnemonic = "dconst_0"
  override  val opcode = 0xb9
  register(new InvokeInterface(_,_))
}
class InvokeDynamic(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 5
  override val mnemonic = "dconst_0"
  override  val opcode = 0xba
  register(new InvokeDynamic(_,_))
}
class New(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 3
  override val mnemonic = "dconst_0"
  override  val opcode = 0xbb
  register(new New(_,_))
}
class NewArray(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 2
  override val mnemonic = "dconst_0"
  override  val opcode = 0xbc
  register(new NewArray(_,_))
}
class ANewArray(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 3
  override val mnemonic = "dconst_0"
  override  val opcode = 0xbd
  register(new ANewArray(_,_))
}
class ArrayLength(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0xbe
  register(new ArrayLength(_,_))
}
class AThrow(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0xbf
  register(new AThrow(_,_))
}

class CheckCast(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 3
  override val mnemonic = "dconst_0"
  override  val opcode = 0xc0
  register(new CheckCast(_,_))
}
class InstanceOf(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 3
  override val mnemonic = "dconst_0"
  override  val opcode = 0xc1
  register(new InstanceOf(_,_))
}
class MonitorEnter(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode) {
  override val mnemonic = "dconst_0"
  override val opcode = 0xc2
  register(new MonitorEnter(_,_))
}
class MonitorExit(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0xc3
  register(new MonitorExit(_,_))
}
class Wide(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val isWide = true
  override val mnemonic = "dconst_0"
  override  val opcode = 0xc4
  register(new Wide(_,_))
}
class MultiANewArray(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 4
  override val mnemonic = "dconst_0"
  override  val opcode = 0xc5
  register(new MultiANewArray(_,_))
}
class IfNull(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 3
  override val mnemonic = "dconst_0"
  override  val opcode = 0xc6
  register(new IfNull(_,_))
}
class IfNonNull(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 3
  override val mnemonic = "dconst_0"
  override  val opcode = 0xc7
  register(new IfNonNull(_,_))
}
class GotoW(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 5
  override val mnemonic = "dconst_0"
  override  val opcode = 0xc8
  register(new GotoW(_,_))
}
class JsrW(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val size = 5
  override val mnemonic = "dconst_0"
  override  val opcode = 0xc9
  register(new JsrW(_,_))
}
class Breakpoint(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0xca
  register(new Breakpoint(_,_))
}
/**   cb - fd   **/
class ImpDep1(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0xfe
  register(new ImpDep1(_,_))
}
object ImpDep2 {
   val opcode = 0xfd
}
class ImpDep2(code:Array[Byte],wideMode:Boolean = false) extends  Instruction(code,wideMode){
  override val mnemonic = "dconst_0"
  override  val opcode = 0xfd
  register(new ImpDep2(_,_))
}



object Instruction {
  val registry = mutable.Map[Int,(Array[Byte],Boolean)=>Instruction]()
  def register(c:Int,f:(Array[Byte],Boolean)=>Instruction)={
    Instruction.registry.put(c,f)
  }
  register
  def apply(code:Array[Byte],wideMode:Boolean = false)={
      registry.getOrElse(code(0) & 0xFF,new Instruction(_,_))(code,wideMode)

   /* (code(0)&0xFF) match {
       case 0x00 => new Nop(code,wideMode)
       case 0x01 => new AConstNull(code,wideMode)
       case 0x02 => new Instruction(code,wideMode)
       case 0x03 => new Instruction(code,wideMode)
       case 0x04 => new Instruction(code,wideMode)
       case 0x05 => new Instruction(code,wideMode)
       case 0x06 => new Instruction(code,wideMode)
       case 0x07 => new Instruction(code,wideMode)
       case 0x08 => new Instruction(code,wideMode)
       case 0x09 => new Instruction(code,wideMode)
       case 0x0A => new Instruction(code,wideMode)
       case 0x0B => new Instruction(code,wideMode)
       case 0x0C => new Instruction(code,wideMode)
       case 0x0D => new Instruction(code,wideMode)
       case 0x0E => new Instruction(code,wideMode)
       case 0x0F => new Instruction(code,wideMode)

       case 0x10 => new Instruction(code,wideMode)
       case 0x11 => new Instruction(code,wideMode)
       case 0x12 => new Instruction(code,wideMode)
       case 0x13 => new Instruction(code,wideMode)
       case 0x14 => new Instruction(code,wideMode)
       case 0x15 => new Instruction(code,wideMode)
       case 0x16 => new Instruction(code,wideMode)
       case 0x17 => new Instruction(code,wideMode)
       case 0x18 => new Instruction(code,wideMode)
       case 0x19 => new Instruction(code,wideMode)
       case 0x1A => new Instruction(code,wideMode)
       case 0x1B => new Instruction(code,wideMode)
       case 0x1C => new Instruction(code,wideMode)
       case 0x1D => new Instruction(code,wideMode)
       case 0x1E => new Instruction(code,wideMode)
       case 0x1F => new Instruction(code,wideMode)

       case 0x20 => new Instruction(code,wideMode)
       case 0x21 => new Instruction(code,wideMode)
       case 0x22 => new Instruction(code,wideMode)
       case 0x23 => new Instruction(code,wideMode)
       case 0x24 => new Instruction(code,wideMode)
       case 0x25 => new Instruction(code,wideMode)
       case 0x26 => new Instruction(code,wideMode)
       case 0x27 => new Instruction(code,wideMode)
       case 0x28 => new Instruction(code,wideMode)
       case 0x29 => new Instruction(code,wideMode)
       case 0x2A => new Instruction(code,wideMode)
       case 0x2B => new Instruction(code,wideMode)
       case 0x2C => new Instruction(code,wideMode)
       case 0x2D => new Instruction(code,wideMode)
       case 0x2E => new Instruction(code,wideMode)
       case 0x2F => new Instruction(code,wideMode)

       case 0x30 => new Instruction(code,wideMode)
       case 0x31 => new Instruction(code,wideMode)
       case 0x32 => new Instruction(code,wideMode)
       case 0x33 => new Instruction(code,wideMode)
       case 0x34 => new Instruction(code,wideMode)
       case 0x35 => new Instruction(code,wideMode)
       case 0x36 => new Instruction(code,wideMode)
       case 0x37 => new Instruction(code,wideMode)
       case 0x38 => new Instruction(code,wideMode)
       case 0x39 => new Instruction(code,wideMode)
       case 0x3A => new Instruction(code,wideMode)
       case 0x3B => new Instruction(code,wideMode)
       case 0x3C => new Instruction(code,wideMode)
       case 0x3D => new Instruction(code,wideMode)
       case 0x3E => new Instruction(code,wideMode)
       case 0x3F => new Instruction(code,wideMode)

       case 0x40 => new Instruction(code,wideMode)
       case 0x41 => new Instruction(code,wideMode)
       case 0x42 => new Instruction(code,wideMode)
       case 0x43 => new Instruction(code,wideMode)
       case 0x44 => new Instruction(code,wideMode)
       case 0x45 => new Instruction(code,wideMode)
       case 0x46 => new Instruction(code,wideMode)
       case 0x47 => new Instruction(code,wideMode)
       case 0x48 => new Instruction(code,wideMode)
       case 0x49 => new Instruction(code,wideMode)
       case 0x4A => new Instruction(code,wideMode)
       case 0x4B => new Instruction(code,wideMode)
       case 0x4C => new Instruction(code,wideMode)
       case 0x4D => new Instruction(code,wideMode)
       case 0x4E => new Instruction(code,wideMode)
       case 0x4F => new Instruction(code,wideMode)

       case 0x50 => new Instruction(code,wideMode)
       case 0x51 => new Instruction(code,wideMode)
       case 0x52 => new Instruction(code,wideMode)
       case 0x53 => new Instruction(code,wideMode)
       case 0x54 => new Instruction(code,wideMode)
       case 0x55 => new Instruction(code,wideMode)
       case 0x56 => new Instruction(code,wideMode)
       case 0x57 => new Instruction(code,wideMode)
       case 0x58 => new Instruction(code,wideMode)
       case 0x59 => new Instruction(code,wideMode)
       case 0x5A => new Instruction(code,wideMode)
       case 0x5B => new Instruction(code,wideMode)
       case 0x5C => new Instruction(code,wideMode)
       case 0x5D => new Instruction(code,wideMode)
       case 0x5E => new Instruction(code,wideMode)
       case 0x5F => new Instruction(code,wideMode)

       case 0x60 => new Instruction(code,wideMode)
       case 0x61 => new Instruction(code,wideMode)
       case 0x62 => new Instruction(code,wideMode)
       case 0x63 => new Instruction(code,wideMode)
       case 0x64 => new Instruction(code,wideMode)
       case 0x65 => new Instruction(code,wideMode)
       case 0x66 => new Instruction(code,wideMode)
       case 0x67 => new Instruction(code,wideMode)
       case 0x68 => new Instruction(code,wideMode)
       case 0x69 => new Instruction(code,wideMode)
       case 0x6A => new Instruction(code,wideMode)
       case 0x6B => new Instruction(code,wideMode)
       case 0x6C => new Instruction(code,wideMode)
       case 0x6D => new Instruction(code,wideMode)
       case 0x6E => new Instruction(code,wideMode)
       case 0x6F => new Instruction(code,wideMode)

       case 0x70 => new Instruction(code,wideMode)
       case 0x71 => new Instruction(code,wideMode)
       case 0x72 => new Instruction(code,wideMode)
       case 0x73 => new Instruction(code,wideMode)
       case 0x74 => new Instruction(code,wideMode)
       case 0x75 => new Instruction(code,wideMode)
       case 0x76 => new Instruction(code,wideMode)
       case 0x77 => new Instruction(code,wideMode)
       case 0x78 => new Instruction(code,wideMode)
       case 0x79 => new Instruction(code,wideMode)
       case 0x7A => new Instruction(code,wideMode)
       case 0x7B => new Instruction(code,wideMode)
       case 0x7C => new Instruction(code,wideMode)
       case 0x7D => new Instruction(code,wideMode)
       case 0x7E => new Instruction(code,wideMode)
       case 0x7F => new Instruction(code,wideMode)

       case 0x80 => new Instruction(code,wideMode)
       case 0x81 => new Instruction(code,wideMode)
       case 0x82 => new Instruction(code,wideMode)
       case 0x83 => new Instruction(code,wideMode)
       case 0x84 => new Instruction(code,wideMode)
       case 0x85 => new Instruction(code,wideMode)
       case 0x86 => new Instruction(code,wideMode)
       case 0x87 => new Instruction(code,wideMode)
       case 0x88 => new Instruction(code,wideMode)
       case 0x89 => new Instruction(code,wideMode)
       case 0x8A => new Instruction(code,wideMode)
       case 0x8B => new Instruction(code,wideMode)
       case 0x8C => new Instruction(code,wideMode)
       case 0x8D => new Instruction(code,wideMode)
       case 0x8E => new Instruction(code,wideMode)
       case 0x8F => new Instruction(code,wideMode)

       case 0x90 => new Instruction(code,wideMode)
       case 0x91 => new Instruction(code,wideMode)
       case 0x92 => new Instruction(code,wideMode)
       case 0x93 => new Instruction(code,wideMode)
       case 0x94 => new Instruction(code,wideMode)
       case 0x95 => new Instruction(code,wideMode)
       case 0x96 => new Instruction(code,wideMode)
       case 0x97 => new Instruction(code,wideMode)
       case 0x98 => new Instruction(code,wideMode)
       case 0x99 => new Instruction(code,wideMode)
       case 0x9A => new Instruction(code,wideMode)
       case 0x9B => new Instruction(code,wideMode)
       case 0x9C => new Instruction(code,wideMode)
       case 0x9D => new Instruction(code,wideMode)
       case 0x9E => new Instruction(code,wideMode)
       case 0x9F => new Instruction(code,wideMode)

       case 0xA0 => new Instruction(code,wideMode)
       case 0xA1 => new Instruction(code,wideMode)
       case 0xA2 => new Instruction(code,wideMode)
       case 0xA3 => new Instruction(code,wideMode)
       case 0xA4 => new Instruction(code,wideMode)
       case 0xA5 => new Instruction(code,wideMode)
       case 0xA6 => new Instruction(code,wideMode)
       case 0xA7 => new Instruction(code,wideMode)
       case 0xA8 => new Instruction(code,wideMode)
       case 0xA9 => new Instruction(code,wideMode)
       case 0xAA => new Instruction(code,wideMode)
       case 0xAB => new Instruction(code,wideMode)
       case 0xAC => new Instruction(code,wideMode)
       case 0xAD => new Instruction(code,wideMode)
       case 0xAE => new Instruction(code,wideMode)
       case 0xAF => new Instruction(code,wideMode)

       case 0xB0 => new Instruction(code,wideMode)
       case 0xB1 => new Instruction(code,wideMode)
       case 0xB2 => new Instruction(code,wideMode)
       case 0xB3 => new Instruction(code,wideMode)
       case 0xB4 => new Instruction(code,wideMode)
       case 0xB5 => new Instruction(code,wideMode)
       case 0xB6 => new Instruction(code,wideMode)
       case 0xB7 => new Instruction(code,wideMode)
       case 0xB8 => new Instruction(code,wideMode)
       case 0xB9 => new Instruction(code,wideMode)
       case 0xBA => new Instruction(code,wideMode)
       case 0xBB => new Instruction(code,wideMode)
       case 0xBC => new Instruction(code,wideMode)
       case 0xBD => new Instruction(code,wideMode)
       case 0xBE => new Instruction(code,wideMode)
       case 0xBF => new Instruction(code,wideMode)

       case 0xC0 => new Instruction(code,wideMode)
       case 0xC1 => new Instruction(code,wideMode)
       case 0xC2 => new Instruction(code,wideMode)
       case 0xC3 => new Instruction(code,wideMode)
       case 0xC4 => new Instruction(code,wideMode)
       case 0xC5 => new Instruction(code,wideMode)
       case 0xC6 => new Instruction(code,wideMode)
       case 0xC7 => new Instruction(code,wideMode)
       case 0xC8 => new Instruction(code,wideMode)
       case 0xC9 => new Instruction(code,wideMode)
       case 0xCA => new Instruction(code,wideMode)
       case 0xCB => new Instruction(code,wideMode)
       case 0xCC => new Instruction(code,wideMode)
       case 0xCD => new Instruction(code,wideMode)
       case 0xCE => new Instruction(code,wideMode)
       case 0xCF => new Instruction(code,wideMode)

       case 0xD0 => new Instruction(code,wideMode)
       case 0xD1 => new Instruction(code,wideMode)
       case 0xD2 => new Instruction(code,wideMode)
       case 0xD3 => new Instruction(code,wideMode)
       case 0xD4 => new Instruction(code,wideMode)
       case 0xD5 => new Instruction(code,wideMode)
       case 0xD6 => new Instruction(code,wideMode)
       case 0xD7 => new Instruction(code,wideMode)
       case 0xD8 => new Instruction(code,wideMode)
       case 0xD9 => new Instruction(code,wideMode)
       case 0xDA => new Instruction(code,wideMode)
       case 0xDB => new Instruction(code,wideMode)
       case 0xDC => new Instruction(code,wideMode)
       case 0xDD => new Instruction(code,wideMode)
       case 0xDE => new Instruction(code,wideMode)
       case 0xDF => new Instruction(code,wideMode)

       case 0xE0 => new Instruction(code,wideMode)
       case 0xE1 => new Instruction(code,wideMode)
       case 0xE2 => new Instruction(code,wideMode)
       case 0xE3 => new Instruction(code,wideMode)
       case 0xE4 => new Instruction(code,wideMode)
       case 0xE5 => new Instruction(code,wideMode)
       case 0xE6 => new Instruction(code,wideMode)
       case 0xE7 => new Instruction(code,wideMode)
       case 0xE8 => new Instruction(code,wideMode)
       case 0xE9 => new Instruction(code,wideMode)
       case 0xEA => new Instruction(code,wideMode)
       case 0xEB => new Instruction(code,wideMode)
       case 0xEC => new Instruction(code,wideMode)
       case 0xED => new Instruction(code,wideMode)
       case 0xEE => new Instruction(code,wideMode)
       case 0xEF => new Instruction(code,wideMode)

       case 0xF0 => new Instruction(code,wideMode)
       case 0xF1 => new Instruction(code,wideMode)
       case 0xF2 => new Instruction(code,wideMode)
       case 0xF3 => new Instruction(code,wideMode)
       case 0xF4 => new Instruction(code,wideMode)
       case 0xF5 => new Instruction(code,wideMode)
       case 0xF6 => new Instruction(code,wideMode)
       case 0xF7 => new Instruction(code,wideMode)
       case 0xF8 => new Instruction(code,wideMode)
       case 0xF9 => new Instruction(code,wideMode)
       case 0xFA => new Instruction(code,wideMode)
       case 0xFB => new Instruction(code,wideMode)
       case 0xFC => new Instruction(code,wideMode)
       case 0xFD => new Instruction(code,wideMode)
       case 0xFE => new Instruction(code,wideMode)
       case 0xFF => new Instruction(code,wideMode)
     }*/
  }
}
