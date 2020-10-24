package com.spring.training;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class SeaFoodService implements DietService {

	@Override
	public String getDiet() {
		List<String> foodList = new ArrayList<>();
		try {
			File f = new File("C:\\Users\\hamee\\eclipse-workspace\\spring-training-ioc-annotation\\src\\seafood.txt");
			Scanner s = new Scanner(f);
			while (s.hasNext()) {
				foodList.add(s.nextLine());
			}
			s.close();
		} catch (FileNotFoundException f) {
			System.out.println("Exception Occured");
			f.printStackTrace();
		}
		return foodList.get(new Random().nextInt(foodList.size()));
	}
}
