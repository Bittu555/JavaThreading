package com.global.ParallelStreamCoading;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem3 {

    private static final String DIR = System.getProperty("user.dir") + "/test/";

    public static void main(String[] args) throws IOException {

        Files.createDirectories(Paths.get(DIR));

        Problem3 obj = new Problem3();

        List<Employee> employees = obj.generateEmployee(10000);
       

		// normal, sequential
        //employees.stream().forEach(ParallelExample5::save); 		// 27s-29s

		// parallel
        long st1=System.currentTimeMillis();
        employees.parallelStream().forEach(Problem3::save); // 7s-8s
        
        long end1=System.currentTimeMillis();

        System.out.println("parallet time : " +(end1-st1) +"s");
    }

    private static void save(Employee input) {

        try (FileOutputStream fos = new FileOutputStream(new File(DIR + input.getName() + ".txt"));
             ObjectOutputStream obs = new ObjectOutputStream(fos)) {
            obs.writeObject(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private List<Employee> generateEmployee(int num) {

        return Stream.iterate(0, n -> n + 1)
                .limit(num)
                .map(x -> {
                    return new Employee(
                            generateRandomName(4),
                            generateRandomAge(15, 100),
                            generateRandomSalary(900.00, 200_000.00)
                    );
                })
                .collect(Collectors.toList());

    }

    private String generateRandomName(int length) {

        return new Random()
                .ints(5, 97, 122) // 97 = a , 122 = z
                .mapToObj(x -> String.valueOf((char) x))
                .collect(Collectors.joining());

    }

    private int generateRandomAge(int min, int max) {
        return new Random()
                .ints(1, min, max)
                .findFirst()
                .getAsInt();
    }

    private BigDecimal generateRandomSalary(double min, double max) {
        return new BigDecimal(new Random()
                .doubles(1, min, max)
                .findFirst()
                .getAsDouble()).setScale(2, RoundingMode.HALF_UP);
    }

}
