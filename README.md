# Using @Primary and @Qualifier annotations for beans of the same type.

### Using @Primary

- It’s possible that, at some point, you use a dependency that provides an implementation for a specific
  interface, but the provided implementation is not suitable for your app, and you choose to 
  define your custom implementation. Then @Primary is your simplest solution.

Sometimes you use dependencies that already provide implementations for specific interfaces. 
When you need to have custom implementations of those interfaces, you can use @Primary to mark your 
implementation as a default for DI. This way, Spring knows to inject the implementation you define 
and not the one provided by the dependency.


### Using @Qualifier

- Imagine we need to have two implementations for comment notification: by email or by push notification. 
 These are still implementations of the same interface, but they depend on different objects in the app.
 When you want Spring to inject one of these, you just need to specify the implementation’s name using 
 the @Qualifier annotation again. In the next listing, you find out how to inject a specific implementation 
 as a dependency of the CommentService object.

### SUMMARY

 Decoupling implementations through abstractions is a good practice in implementing a class design. 
   Decoupling objects makes implementations easy to change without affecting too many parts of the application. 
   This aspect makes your application more easily extended and maintained.

 In Java, we use interfaces to decouple implementations. We also say that we define contracts between 
   implementations through interfaces.

 When using abstraction with dependency injection, Spring knows to search for a bean created with an 
   implementation of the requested abstraction.

 You use stereotype annotations on classes for which Spring needs to create instances and add these instances 
   as beans to its context. You never use stereotype annotations on interfaces.

 When the Spring context has more beans created with multiple implementations of the same abstraction, 
   to instruct Spring which bean to inject, you can
   – use the @Primary annotation to mark one of them as default, or
   – use the @Qualifier annotation to name the bean and then instruct Spring to inject that bean by name.

 When we have service responsibility components, we use the @Service stereotype annotation instead of @Component. 
  Likewise, when a component has repository responsibility, we use the @Repository stereotype annotation instead of 
  @Component. This way, we mark the component’s responsibility explicitly, and we make the class design more 
  comfortable to read and understand.