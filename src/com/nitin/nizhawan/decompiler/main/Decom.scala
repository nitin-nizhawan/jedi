package com.nitin.nizhawan.decompiler.main

/**
 * Created by nitin on 13/12/15.
 */

import java.nio.file.{Files, Paths}


import com.nitin.nizhawan.decompiler.instructionset.Instruction
import com.nitin.nizhawan.decompiler.structures.clazz.ClassFile



object Decom extends App {
  println(Instruction.registry)
   val file = Decom.getClass.getResource("Decom.class").toString.substring(5)

   val classBytes = Files.readAllBytes(Paths.get(file))
   val byteReader = new ByteReader(classBytes)
   val classReader = new ClassFile(byteReader,classBytes);

    println(classReader.decompile)
  /* def top = new MainFrame {
      title = classReader.this_class.className
      contents = new TextArea(
         text = classReader.decompile
      )
   }*/

}
