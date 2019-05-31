package com.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 
 * @author liuchao
 *
 */
public class SerialStreamTest {

	public static void SerialStreamForIntTest(int[] arr) {
		long timeStart = System.currentTimeMillis();

		Arrays.stream(arr).min().getAsInt();
		
		long timeEnd = System.currentTimeMillis();
		System.out.println("SerialStream 比较int最小值 花费的时间" + (timeEnd - timeStart));
	}
	
	
	public static void SerialStreamForObjectTest(List<Student> studentsList) {
		long timeStart = System.currentTimeMillis();

		Map<String, List<Student>> stuMap = studentsList.stream().filter((Student s) -> s.getHeight() > 160) .collect(Collectors.groupingBy(Student ::getSex)); 
		
		long timeEnd = System.currentTimeMillis();
		System.out.println("Stream并行花费的时间" + (timeEnd - timeStart));
	}
}
