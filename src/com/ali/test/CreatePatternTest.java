package com.ali.test;

import org.junit.Test;

import com.ali.pattern.c_builder.Meal;
import com.ali.pattern.c_builder.MealBuilder;

/**
 * http://www.runoob.com/design-pattern/template-pattern.html
 * https://www.cnblogs.com/geek6/p/3951677.html
 * https://blog.csdn.net/zhangerqing/article/details/8245560
 * 
 * @author xiyu
 *
 */
public class CreatePatternTest {

	@Test
	public void singletonTest() {

	}

	@Test
	public void builderTest() {
		MealBuilder builder = new MealBuilder();
		Meal meal = builder.prepareVegMeal();
		meal.getCost();

		meal.showItems();

		System.out.println();
	}

}
