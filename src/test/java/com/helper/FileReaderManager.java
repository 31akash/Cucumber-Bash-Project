package com.helper;

public class FileReaderManager {
	private FileReaderManager() 
	{
	}

	public FileReaderManager getInstanceFR() {
		FileReaderManager fr = new FileReaderManager();
		return fr;
	}
	public static ConfigrationReader getInstanceCR() throws Throwable {
		ConfigrationReader cf = new ConfigrationReader();
		return cf;
	}

}
