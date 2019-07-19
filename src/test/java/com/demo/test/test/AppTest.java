package com.demo.test.test;

import java.io.FileInputStream;

import org.junit.jupiter.api.Test;

import com.daily.tool.common.FileTypeEnum;
import com.daily.tool.read.EasyReader;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

	@Test
	public void test() {
		try {
			
		} catch (		/**
		 * 读取流
		 */
		EasyReader.reader(new FileInputStream("a.xlsx"), FileTypeEnum.XLSX, (line, context) -> {
			System.out.println(line);
		});
		
		EasyReader.reader(new FileInputStream("a.xlsx"), FileTypeEnum.XLSX, (line, context) -> {
			System.out.println(line);
		}, (line, context) -> {
			//处理
		}); e) {
			// TODO: handle exception
		}
	}
}
