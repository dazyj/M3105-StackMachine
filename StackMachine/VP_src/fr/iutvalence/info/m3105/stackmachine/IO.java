package fr.iutvalence.info.m3105.stackmachine;

import java.io.IOException;

public interface IO {

	void displayRuntimeError(String string);

	void displayProgramTermination();

	int read() throws IOException;

	void write(int op);

}