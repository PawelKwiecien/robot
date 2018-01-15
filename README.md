We have a robot that can pick up blocks from a stash, move them horizontally, and lower them in place. There are 10 positions available to lower blocks, numbered from 0 to 9. Each position can hold up to 15 blocks.

The robot understands the commands 'P', 'M' or 'L': 
P: PICKUP from the stash and move to position 0 
M: MOVE to the next position 
L: LOWER the block

The robot is safe to operate and very forgiving:
	•	there are always blocks in the stash (PICKUP will always work on a block)
	•	if the robot already holds a block, PICKUP will reset the robot to position 0
	•	The robot will not go beyond position 9. Trying to MOVE it further does nothing
	•	LOWERing a block on a pile of 15 blocks does nothing (and the robot will keep any block it holds)
	•	LOWERing without a block does nothing
	•	the robot ignores any command that is not 'P', 'M' or 'L'
  
Implement a function that takes a String of commands for the robot. The function should output a String representing the number of blocks at each position after completing all commands.

SAMPLE INPUT: String = "PMLPMMMLPMLPMML"

SAMPLE OUTPUT "0211000000"
