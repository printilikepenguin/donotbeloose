package com.donotbeloose.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DonotbelooseMallApplication {

	void func() {
		System.out.println("함수임");
	}

	public static void main(String[] args) {
		SpringApplication.run(DonotbelooseMallApplication.class, args);

		String jaehyun = "정재현";
		int comeback = 826;
		int today = 810;
		var love = 520;
		final int year = 2024;


		for (int i = 0; i <3; i++) {
			today += 1;
		}

		if (comeback + today != 826) {
			System.out.println("컴백다담주");
		}

		System.out.println(jaehyun);

	}

}
