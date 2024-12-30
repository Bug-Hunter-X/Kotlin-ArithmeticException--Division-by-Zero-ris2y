# Kotlin ArithmeticException: Division by Zero

This repository demonstrates a common Kotlin error: `ArithmeticException: / by zero`.  The `calculate` function doesn't handle the case where `b` is zero, leading to a runtime exception.

The solution provides a safer approach using a null check and the Elvis operator to prevent the exception.  This illustrates best practices for handling potential errors gracefully.