/** 
 * @author Aditya Mahajan <aditya.mahajan@mcgill.ca>
 * @version 2013.10.06
 * Unit Testing Temperature class
 */

import java.beans.ConstructorProperties;

import javax.annotation.PreDestroy;

import org.junit.* ;

import static org.junit.Assert.* ;

public class TemperatureTest {
	//declaring objects ,three needed  one for each type of temperature measurement
	Temperature temp1;
	Temperature temp2;
	Temperature temp3;
	
	@Before
	public void setUp()
	{
		//Constructing objects
		temp1 = new Temperature(100, Temperature.Units.CELSIUS);
		temp2 = new Temperature(-100.0, Temperature.Units.FAHRENHEIT);
		temp3 = new Temperature(100.0, Temperature.Units.KELVIN);
	}
	
	@Test
	/*
	 * these test cases check if the getUnits method.
	 * there are three test cases checking if the cases with 
	 * celcius, fahrenheit and kelvin.
	*/
	public void testgetUnits()
	{
		assertTrue(temp1.getUnits()==Temperature.Units.CELSIUS);
		assertTrue(temp2.getUnits()==Temperature.Units.FAHRENHEIT);
		assertTrue(temp3.getUnits()==Temperature.Units.KELVIN);
	}
	
	@Test
	/*these test cases are testing whether the getValue method.
	 * There are three test cases  testing if the method works for 
	 * celcius, fahrenheit, kelvin
	 */	
	public void testgetValue()
	{
		assertEquals(100, temp1.getValue(), 0);
		assertEquals(-100.0, temp2.getValue(), 0);
		assertEquals(100.0, temp3.getValue(), 0);
	}
	
	@Test
	/*
	 * these test cases are testing the change units methods that is supposed to change the units of the temperature
	 * 6 cases where tested. from celcius to kelvin and fahrenheit, 
	 * from fahrenheit to celcius and kelvin and finally kelvin to celcius and fahrenheit
	 */	
	public void testChangeUnits()
	{
		//checking case when converting from celcius to kelvin 
		temp1.changeUnits(Temperature.Units.KELVIN);
		assertTrue(temp1.getUnits()==Temperature.Units.KELVIN);

		//checking case when converting from celcius to fahrenheit
		temp1 = new Temperature(100, Temperature.Units.CELSIUS);//reconstructing
		temp1.changeUnits(Temperature.Units.FAHRENHEIT);
		assertTrue(temp1.getUnits()==Temperature.Units.FAHRENHEIT);
		
		//checking case when converting from fahrenheit to celcius
		temp2.changeUnits(Temperature.Units.CELSIUS);
		assertTrue(temp2.getUnits()==Temperature.Units.CELSIUS);
				
		//checking case when converting from fahrenheit to kelvin
		temp2 = new Temperature(-100.0, Temperature.Units.FAHRENHEIT);//reconstructing
		temp2.changeUnits(Temperature.Units.KELVIN);
		assertTrue(temp2.getUnits()==Temperature.Units.KELVIN);
		
		//checking case when converting kelvin to celcius
		temp3.changeUnits(Temperature.Units.CELSIUS);
		assertTrue(temp3.getUnits()==Temperature.Units.CELSIUS);
		
		//checking case when converting kelvin to fahrenheit
		temp3 = new Temperature(100.0, Temperature.Units.KELVIN);//reconstructing
		temp3.changeUnits(Temperature.Units.FAHRENHEIT);
		assertTrue(temp3.getUnits()==Temperature.Units.FAHRENHEIT);
		
		
	}
	
	
  // Add multiple tests to check all functions of
  // {@Code Temperature} class.

  // @Test
  // public void .... (){
  //    ...
  // }

  // @Test
  // public void .... (){
  //    ...
  // }
}
