# PaloAlto

1. hashCode() / equals() problem
   
Consider these two simple classes
public class Person {
private final int age;
private final String name;
public Person(String name, int age) {
this.name = name;
this.age = age;
}
}
public class Employee extends Person {
private final String role;
public Employee(String name, int age, String role) {
super(name, age);
this.role = role;
}
}
The task is to write appropriate hashCode() and equals()methods for both classes.
Nothing from the above source should be modified but additional fields and methods can be
added. Instances of Person and Employee should never be equal to one another. An
Employee is equal to another Employee if the role, age, and name are all equal between
instances. A Person is equal to another Person instance if the age and name are both equal
between instances.

2. Statistic Calculator
   
The task here is to implement this interface. If you want to write multiple implementations then
That is good, or you can focus on writing just one. Some notes regarding
implementations:
● Implementations of this class must be 'thread-safe'. The definition of the term
'thread-safe' is left up to you.
● Implementations may choose to prioritize (or not) various aspects of the performance
and or behavior of their instances - this is acceptable as long as the compromise can
be explained and justified.
● You are free to choose appropriate behavior for any corner cases but are expected to
be able to justify those behaviors.
● If you want to optimize for ‘performance’ (whatever you take performance to mean)
here at the expense of code readability then that is fine, but you’ll need to be able to
explain the code to us. If something appears counterintuitive or overly complex then
code comments can be useful.
package statistics;
/**
* Tracks the statistics of a continual stream of values.
*/
public interface Statistic {
/*
* Called to update the statistic with a new sample value.
*/
void event(int value);
/*
* Returns the mean of the received sample values.
*/
float mean();
/*
* Returns the minimal received sample value.
*/
int minimum();
/*
* Returns the maximal received sample value.
*/

int maximum();
/*
* Returns an estimate of the variance of the total population
* given the received sample values.
*/
float variance();
}
