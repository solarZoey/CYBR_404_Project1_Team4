# EXECUTIVE DESIGN
## INTRODUCTION
<br> This document aims to provide the design for a basic calculator program that conducts both basic and advanced calculations. The calculator will be a simple Java program that will interact with the user and conduct error handling, calculate what needs to be calculated and validate the input entered by the user.
## OVERVIEW
<br> The Java Calculator program will be a easy to use mathematical tool, that will allow useers to perform calculations, view history, clear their history and all in all manage their calculation results.
## COMPONENTS
### Interface
- User will enter the mathematical expressions that they need
- The interface will be where calculations will be shown
- Error messages will also be displayed on the interface
- The user interface will be where previous calculations will be displayed
- The user interface will also be where user can select the operations they aim to use
### Basic Operations Module
- Addition
- Subtraction
- Multiplication
- Division
### Advanced Operations
- Logarithmic Fubctions
- Trigonometric Functions
- Square Root
### Storage Processor (History Tracking)
- Stores all the calculations temporarily
- Gives the user the ability to be able to get the stored calculations
- User can manage storage process or by clearing the stored information
### Error Handling
- Validates the user input
- Checks calculations to make sure there are no errors or that user is entering the right input
- Outputs the appropriate error messages
## Classes and Objects
### Calculator Class
- Is the main class
- Manages the flow of the program
- Displays the welcome and closing messages
- Methods include: 
### Basic Operations Class
- The Abstract class for all the basic mathematical operations
- Methods include:
### Advanced Operations Class
- The Abstract class for all the advanced mathematical operations
- Methods include:
### History Class
- Manages the calculation history
- Methods include:
### User Input Class
- Where the error handling occurs
- Where the display and user interactions are managed
- Methods include:
## INTERACTIONS / USER INTERACTIONS
### Calculation Workflow
1. The sees the calculator welcome message and what they need to enter for each operator they intend to use
2. User inputs into the console
3. The system valdiates the input and ensures that the user entered the right thing
4. If the input is wrong the user is told and asked to try again
5. If the input is correct, the ystsem performs the calculation
6. Results are displayed
7. The calculation is stored in the history
### History Interaction
1. User requests for the history
2. The program gets the history and displays it
3. User can look through their history for reference
### Error Resolution
1. If an error occurs, the program displays a error message
2. The user corrects their msitake based on the message
3. The user resubmits the correct input for calculation
## Data Flows
### Calculation Flow
1. User ----> User Interface ----> Calculation Input
2. Calculation Input ----> Input Validation ----> Validated Input
3. Validated Input ---> Calculation Process ---> Result
### History Data Flow
1. User ----> User Interface ---> Request History
2. Request History ----> History Storage ----> Saved history data
3. Saved history data ----> User Interface ----> User
### Error Handling Flow
1. Input ---> Validation ----> Error detected
2. Error detected ----> Error message
3. Error Message ---> Displays On The User Interface ----> User

## Level 0 Data Flow Diagram
## Level 1 Data Flow Diagram
## UML Diagram
## Conclusion
This document aims to give a comprehensive overview of the java calulator program that involves both absic and advanced operations. It's user friendly approach allows for people who are going to use the program in the future to be able to do simple math operations and manage the calculations they have done while interacting with that program.

