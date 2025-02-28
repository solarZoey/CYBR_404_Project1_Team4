# Security Statement

## What’s Our Goal for Security?

- We want the Offline Calculator to be super easy to use, but also safe and reliable. Security is a big deal for us because we want users to trust that their calculations are handled correctly and that their data is never at risk. Here’s how we’re making sure the calculator is secure:

### No Weird Inputs Allowed:

- We’re making sure the calculator only accepts valid numbers and operations. If someone tries to do something weird, like dividing by zero or typing random letters, the calculator will handle it smoothly and show a clear error message. No crashes, no weird behavior just a clean and simple experience.
  
### Your Data Stays Yours:

- Since this is an offline calculator, nothing you type or calculate will ever leave your device. No internet connection means no risk of your data being stolen or hacked. Plus, the temporary calculation history will be cleared after use, so there’s no chance of someone else seeing your past calculations.

### Works Everywhere, Stays Secure:

- We’re building the calculator using Java, which will work on Windows, macOS, and Linux. But just because it works everywhere doesn’t mean we’re cutting corners on security. We’re making sure the same security measures are in place no matter what device you’re using.

### Lightweight and Fast:

- The calculator will be lightweight, so it won’t slow down your device or use too much memory. This also means fewer chances for things to go wrong, like crashes or weird bugs.

### Easy to Use, Hard to Break:

- We don’t want security to make things complicated. We’re designing the calculator so that it’s simple for users but tough for anything that might try to break it. For example, if you type something wrong, you’ll get a friendly error message, not a confusing crash.

## How Are We Making It Secure?

- We’re building security into every project step, from the design to the final product. Here’s our plan:

### Design Phase:

- we’re using Data Flow Diagrams (DFDs) to map out how data moves through the calculator. This helps us spot potential security risks early on, like where bad inputs could cause problems.

We’re also using UML diagrams (like Class Diagrams) to design the system in a way that keeps the code organized and secure.

### Building the Calculator:

- When we write the code, we’re adding checks to make sure only valid inputs are accepted. For example, if someone tries to divide by zero, the calculator will show an error instead of breaking.

- We’re also making sure the temporary calculation history is stored safely and cleared after use. No sensitive data will stick around.

### Testing Phase:

- Before we release the calculator, we’re testing it thoroughly. We’re trying to break it with weird inputs and edge cases to make sure it can handle anything a user might throw at it.
We’re also writing unit tests to check that all the arithmetic operations (addition, subtraction, etc.) work correctly and securely.

### After Launch:

- Once the calculator is out there, we’ll keep an eye on it. If users report any issues or if we find any security gaps, we’ll fix them quickly. We’ll also listen to user feedback to make the calculator even better over time.

## How Does This Fit with the Problem Statement and Outcome Summary?

- The Problem Statement says that many calculators are either too complicated, not secure or don’t work well on all devices. Our Offline 
Calculator solves these problems by being:

- Simple: Easy to use, with a clean interface.
- Secure: Handles inputs safely and keeps your data private.
- Cross-Platform: Works on Windows, macOS, and Linux without compromising security.

- The Outcome Summary describes the final product as a lightweight, offline calculator that’s fast and user-friendly. By adding strong security measures, we’re making sure the calculator isn’t just easy to use, it’s also safe and reliable. Whether you’re a student doing homework, a professional crunching numbers at work, or just someone who needs to split a bill, you can trust this calculator to get the job done without any surprises.

- Security isn’t just something we’re adding at the end it’s built into every part of the Offline Calculator.
