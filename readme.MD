How to write tests (with Spring)

Why do we write test?
* We want to know that our code works
* We want to go faster (less debugging, knows that our code keeps working, ...)

How do we do this?
Rules for writing good tests in order

1. Expressive, Readable, Reveal intention, ...
2. Fast
3. No duplication

Parts:
1. Naming Methods
2. ValueObjects
3. Use Assertj   
4. Test Builders/Creating test objects - fragile tests
5. [Pure functions](https://www.youtube.com/watch?v=M-sDjNOAn_Y)
6. [Adapter - Onion architecture](https://herbertograca.com/2017/11/16/explicit-architecture-01-ddd-hexagonal-onion-clean-cqrs-how-i-put-it-all-together)
7. Extensions
8. Spring
    * [Spring Context Caching](https://docs.spring.io/spring-framework/docs/current/reference/html/testing.html#testcontext-ctx-management-caching)
    * MockBean
    * Stubs  
    * Annotations / Profiles
   
Great videos to watch on this topic
* [Effective Unit Testing by Eliotte Rusty Harold](https://www.youtube.com/watch?v=fr1E9aVnBxw)
* [Unit Testing like a Pro: The Circle of Purity by Victor Rentea](https://www.youtube.com/watch?v=1Z_h55jMe-M)