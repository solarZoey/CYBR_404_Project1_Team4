# Introduction
- This plan ensures the Calculator app is secure, accurate, and user-friendly. It covers memory safety, input protection, math accuracy, and ease of use.

# Security Testing
## 1. Memory Safety
Why?

- Prevent sensitive data from being accessed after the program closes.

## What to Test?

- Clear history and overwrite memory on exit.

# 2. Injection Protection
Why?
- Block harmful inputs that could break the program

## What to Test?

- Reject non-numeric inputs (ex: letters, symbols).

 # 3. Code Testing
1. Arithmetic Accuracy
Why?
- Ensure all math operations give correct results.

## What to Test?

- Test basic operations (+, -, *, /) and edge cases (ex: division by zero).

# 4. Logic Clarity
Why?
- Make sure the program works as users expect.

## What to Test?

- Verify prompts clearly explain operand roles (ex: “Enter numerator:”).

- Test if operations are performed in the correct order.

# 5. History Functionality
Why?
- Ensure history is clear and works correctly.

## What to Test?

- Verify history shows full calculations (ex: “63 / 7 = 9.0”).
- Test history clearing functionality.


