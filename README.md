# postfix


Problem with FPE(Fully Parenthesized Expression):
- Too many parentheses.
- Establish precedence rules
We have alternative ways (postfix and prefix)



Postfix Notation:
Instead of saying "A plus B", we could put the operators after the operands as in: A B +
2 3 5 * + =
			   = 2 3 5 * + 
			   = 2 15 + = 17
 2 3 + 5 * =
			   = 2 3 + 5 *
			   = 5 5 * = 25
No parentheses needed here!


Infix to Postfix:
( ( ( A + B ) * C ) - ( ( D + E ) / F ) )
	          A  B + C *  D  E + F / -
Operand order does not change!
Operators are in order of evaluation!

Computer Algorithm FPE Infix To Postfix:
Assumptions:  
Space delimited list of tokens represents a FPE infix expression
Operands are single characters.
Operators +,-,*,/

