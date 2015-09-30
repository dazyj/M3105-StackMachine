package fr.iutvalence.info.m3105.stackmachine;

public interface CPU {

	public abstract void run();

	public abstract void wireToExpStack(Stack expstack);

	public abstract void wireToCallStack(Stack expstack);

	public abstract void wireToIoSubsystem(IO ioSystem);

	public abstract void wireToProgramMemory(Memory programMemory);

	public abstract void clearStacks();

	public abstract void setPC(int address);

}