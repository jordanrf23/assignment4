# assignment4
1 Objective
In this assignment, you are expected to design and implement “Tears, Despair & Debug-
ging”. In this game, you are going to construct a grid of size NxN (with a size constraint,
see description for details). Your agent tries to escape from the grid by keeping track of
apertures.
2 Description
In a grid, each cell is composed of 4 components, which are up, bottom, left, and right.
Each component can be WALL, APERTURE, or EXIT.
You should create a grid randomly (the size of a grid can be between 3 and 7) by
satisfying the following constraints:
• Grid has only one EXIT component (the EXIT must be the left component of the
cell and must be on the leftmost side of the grid, as shown in the Table 1 and 2).
• Each cell has at least one APERTURE component.
After the grid construction, the game must be started. The Agent can move in four
directions (UP, DOWN, LEFT, RIGHT). For each agent movement, the updated grid
must be printed. The format of the grid visualization is shown in the following for
the given grid below, where ’E’ denotes EXIT, ’S’ denotes SPACE, and ’A’ denotes
AGENT. When the agent reaches the EXIT cell, to escape from the grid, make sure
the agent moves in the left direction, because the EXIT component is always assigned
to the leftmost side of the grid, and left on the cell.
Your goal is to get the agent out of the maze! You are given JUnit5 test cases, and
you must implement the project based on the test cases given to you (aka. Test-driven
Development).
