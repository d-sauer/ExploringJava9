# Java 9 experiments


## Compiling modules

Compile sources:

    $ javac -d classes/com.hello.world $(find modules -name '*.java')

Execute: 
    
    $ java --module-path classes -m com.hello.world/com.hello.world.Main