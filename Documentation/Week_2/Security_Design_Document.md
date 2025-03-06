# Security Design Document

## What We’re Doing for Security
For our Offline Calculator project, we want to make sure it’s safe, easy to use, and doesn’t cause any problems. Since this is a basic calculator, we’re focusing on simple but important security steps to keep everything running smoothly. Here’s what we’re doing:

## What Needs Protection (Assets) 
In our calculator, the main things we need to protect are:
- **User Input:** The numbers and operations users type in (like 2 + 2 or 10 / 5).
- **Calculation Logic:** The math operations (addition, subtraction, multiplication, division) the calculator does.
- **Temporary History**: The list of past calculations that users can see for a short time.
- **System Stability:** Making sure the calculator doesn’t crash or slow down.

## What Could Go Wrong (Threats)
### User Input
**Threat:** Someone types something weird, like letters or tries to divide by zero.<br>
**Risk:** The calculator could crash or give wrong answers.

### Calculation Logic
**Threat:** There’s a bug in the math operations.<br>
**Risk:** The calculator gives wrong results, and users can’t trust it.

### Temporary History
**Threat:** Someone could see the past calculations if they’re not cleared.<br>
**Risk:** Privacy issues if someone sees sensitive data.

### System Stability
**Threat:** The calculator crashes or runs slow.<br>
**Risk:** Users get frustrated and stop using it.

## How We’re Addressing Vulnerabilities (Security Controls)
To stop these problems, we’re adding these security controls:

### User Input:
**Control: Input Validation.** <br>
- We’re checking all inputs to make sure they’re numbers and valid operations.<br>
- If someone tries to divide by zero or type letters, the calculator will show an error message instead of crashing.

**Outcome:** No crashes, and only valid inputs are accepted.

### Calculation Logic:
**Control: Testing and Error Handling.** <br>
- We’re testing all the math operations to make sure they work right.<br>
- If something goes wrong, the calculator will handle it and show a clear message.

**Outcome:** Accurate calculations and no wrong answers.

### Temporary History:
**Control: Temporary Storage and Clearing.** <br>
- The past calculations are stored for a short time and then cleared.<br>
- Nothing is saved permanently or sent over the internet.

**Outcome:** No privacy risks, and users don’t have to worry about their data.

### System Stability:
**Control:** Good Design and Testing.<br>
- We’re using Data Flow Diagrams (DFDs) and UML diagrams to design the calculator so it’s stable and works well.<br>
- We’re also testing it with weird inputs and edge cases to make sure it doesn’t crash.

**Outcome:** A fast, lightweight calculator that doesn’t crash or slow down.

## Conclusion
For our Offline Calculator, we’re keeping things simple but secure. We’ve thought about what could go wrong and added steps to fix those problems. These steps include checking inputs, testing the math operations, clearing the history, and making sure the calculator runs smoothly. By doing this, we’re making a calculator that’s easy to use, works right, and keeps users’ data safe. 
