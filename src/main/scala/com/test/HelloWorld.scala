package com.test

import org.redisson.codec.MarshallingCodec
import org.redisson.config.Config


object HelloWorld {
  def main(args: Array[String]) = {
    println("Hello, world")
    val conf = new Config()
    conf.setCodec(new MarshallingCodec())
  }
}