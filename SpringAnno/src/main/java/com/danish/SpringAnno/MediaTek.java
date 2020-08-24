package com.danish.SpringAnno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MediaTek implements MobileProcessor 
{
	public void process() 
	{
		System.out.println("World's second best!!");
	}
}