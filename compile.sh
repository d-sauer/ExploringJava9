#!/usr/bin/env bash
javac -d target/classes/com.hello.world.mars $(find ./com.hello.world.mars/ -name "*.java")
javac -p target/classes -d target/classes/com.hello.world $(find ./com.hello.world/ -name "*.java")
