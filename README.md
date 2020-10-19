# Juliet Test Suite

##### Maintained for my undergraduate machine learning research, attempting to detect security vulnerabilities in Java source code. Retrieved from NIST.

##### A collection of test cases in the Java language. It contains examples organized under 112 different CWEs. Version 1.3 adds test cases for increment and decrement. Test cases are pieces of buildable code that can be used to study static analysis tools. A test case targets exactly one type of flaw, but other, unrelated flaws may be incidentally present. For example, the Java test case “CWE476_NULL_Pointer_Dereference__int_array_01” targets only a NULL Pointer Dereference flaw. In addition to the construct containing the target flaw, each test case typically contains one or more non-flawed constructs that perform a function similar to the flawed construct. A small subset of test cases does not contain non-flawed constructs and are considered bad-only test cases. 

##### The user manual can be found here -> https://samate.nist.gov/SARD/resources/Juliet_Test_Suite_v1.2_for_Java_-_User_Guide.pdf
