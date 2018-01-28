// module name can have different name than folder name
module com.hello.world.mars {

    requires com.hello.world.api;

    exports com.hello.world.mars;

    // Provide Greeting service
    provides com.hello.world.api.Greeting
        with com.hello.world.mars.Mars;

}