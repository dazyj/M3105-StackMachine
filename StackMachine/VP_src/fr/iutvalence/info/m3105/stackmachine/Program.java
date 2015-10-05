package fr.iutvalence.info.m3105.stackmachine;

public interface Program {

	int getInstructionCount();

	Instruction getInstructionAt(int instructionNumber);

}