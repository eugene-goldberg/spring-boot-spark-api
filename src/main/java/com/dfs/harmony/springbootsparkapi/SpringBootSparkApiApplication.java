package com.dfs.harmony.springbootsparkapi;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSparkApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSparkApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		SparkSession sparkSession = SparkSession

				.builder()

				.appName("SparkWithSpring")

				.master("local")

				.getOrCreate();

		System.out.println("Spark Version: " + sparkSession.version());

        Dataset<Row> df = sparkSession.read().json("./people.json");

        df.show();

	}
}
