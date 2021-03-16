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
5. Pure functions
7. Adapter - Onion architecture https://herbertograca.com/2017/11/16/explicit-architecture-01-ddd-hexagonal-onion-clean-cqrs-how-i-put-it-all-together
8. Spring
    * Spring Context Caching
    * MockBean
    * Extensions
    * Annotations / Profiles