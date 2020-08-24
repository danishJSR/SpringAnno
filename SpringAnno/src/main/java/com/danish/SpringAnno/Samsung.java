package com.danish.SpringAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung 
{
	@Autowired
	@Qualifier("mediaTek")
	MobileProcessor cpu;

	public void config()
	{
		System.out.println("8 GB Ram, 1 TB Hard Disk, Octa Core Processor");
		cpu.process();
	}
}
