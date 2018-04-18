package regs_router

import chisel3.core._

class RegisterPorts extends Bundle{
  val ra = Output(UInt(32.W))
  val sp = Output(UInt(32.W))
  val gp = Output(UInt(32.W))
  val tp = Output(UInt(32.W))
  val t0 = Output(UInt(32.W))
  val t1 = Output(UInt(32.W))
  val t2 = Output(UInt(32.W))
  val fp = Output(UInt(32.W))
  val s1 = Output(UInt(32.W))
  val a0 = Output(UInt(32.W))
  val a1 = Output(UInt(32.W))
  val a2 = Output(UInt(32.W))
  val a3 = Output(UInt(32.W))
  val a4 = Output(UInt(32.W))
  val a5 = Output(UInt(32.W))
  val a6 = Output(UInt(32.W))
  val a7 = Output(UInt(32.W))
  val s2 = Output(UInt(32.W))
  val s3 = Output(UInt(32.W))
  val s4 = Output(UInt(32.W))
  val s5 = Output(UInt(32.W))
  val s6 = Output(UInt(32.W))
  val s7 = Output(UInt(32.W))
  val s8 = Output(UInt(32.W))
  val s9 = Output(UInt(32.W))
  val s10 = Output(UInt(32.W))
  val s11 = Output(UInt(32.W))
  val t3 = Output(UInt(32.W))
  val t4 = Output(UInt(32.W))
  val t5 = Output(UInt(32.W))
  val t6 = Output(UInt(32.W))
  val pc = Output(UInt(32.W))
}
