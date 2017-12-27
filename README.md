# Java 9 experiments

#JShell

    $ jshell 

## Compiling modules

Compile sources:

    $ javac -d target/classes/com.hello.world.mars $(find ./com.hello.world.mars/ -name "*.java")
    $ javac -p target/classes -d target/classes/com.hello.world $(find ./com.hello.world/ -name "*.java")

Execute: 
    
    $ java -p target/classes -m com.hello.world/com.hello.world.Main

Create JARs

    $ jar --create --file ./target/jars/com-hello-world-mars.jar -C target/classes/com.hello.world.mars .
    $ jar --create --file ./target/jars/com-hello-world.jar --main-class com.hello.world.Main -C target/classes/com.hello.world .

Execute:

    $ java --module-path target/jars/ --module com.hello.world


## JMod
 - print module dependenceis


    
# TODO
- jshell: connect to existing process for debug and explorations
- jshell: devoxx -- how to create on the fly http client
- http2
- modules
- module layers
- jlink - create custom JDK
- services
