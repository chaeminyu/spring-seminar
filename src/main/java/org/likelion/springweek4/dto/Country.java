// 📍 위치: src/main/java/org/likelion/springweek4/dto/Country.java
package org.likelion.springweek4.dto;

public class Country {
    private String name;
    private int population;

    // 정적 팩토리 메서드 (객체 생성을 편리하게)
    public static Country of(String name, int population) {
        Country country = new Country();
        country.setName(name);
        country.setPopulation(population);
        return country;
    }

    // getter와 setter (JSON 변환을 위해 필수!)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}