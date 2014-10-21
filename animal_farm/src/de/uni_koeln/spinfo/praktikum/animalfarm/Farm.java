package de.uni_koeln.spinfo.praktikum.animalfarm;

public class Farm
{
	
	public static void main(String[] args)
	{
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		cat1.age = 10;
		cat1.name = "Lilly";
		cat1.height = 25;
		cat1.color = "black-white";
		cat2.age = 16;
		cat2.name = "Felix";
		cat2.height = 54;
		cat2.color = "brown-black";
		System.out.println("age: " + cat1.age + "	color: " +cat1.color + "	height: " + cat1.height + "	name: " + cat1.name);		
		System.out.println("age: " + cat2.age + "	color: " +cat2.color + "	height: " + cat2.height + "	name: " + cat2.name);
	}
	
}
