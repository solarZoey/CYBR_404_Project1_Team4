
# Code and Security Testing Overview

This document will answer the question: what tests need to be carried out and why?

---

## Security Testing

### Memory Safety

While Java has a garbage collector that will automatically de-allocate memory when it is unused, and that should *in theory* delete any program data that could be sensitive, there is still a possibility that the memory would still be accessible in the RAM via the use of a hex editor. Given this vulnerability, we should make sure that the memory used during program execution is overwritten upon exiting the program.

> Note: This level of security might be out-of-scope for our application, as Java utilizes methods for handling memory that are difficult to predict. This application of security is quite niche, however, as the attacker would need direct access to the system *before the memory is overwritten*. If it is determined that this security feature would be too difficult to implement, we will make note of the vulnerability.

### Injection

Code injection, and therefore arbritrary code execution, should be impossible. Any input should be rigorously tested for injection vulnerabilities to make sure that users can not elevate their privilages beyond what is allowed in the system.

---

## Code Testing

### Arithmetic

A calculator should give you the correct answers to an operation. Testing should be done to rule out edge cases, particularly that of rounding errors inherent in binary computer systems.

### Logic

It should be clear what inputs will correlate to which operands.

Example case for faulty application logic:

- User is trying to find the quotient to 63 divided by 7.
- User enters `63` in the first input, and `7` in the second input for the division operation.
- User expects that the logic is as follows: `first_input / second_input = quotient`, but the application logic is programmed as `second_input / first_input = quotient`
- Quotient calculated is `0.1111...` instead of the expected `9`.

To prevent this error in logic, QA tests should be performed for each operation with expected answers. The prompts should be self-explanitory for how the entered operands will be arranged in the equation.
