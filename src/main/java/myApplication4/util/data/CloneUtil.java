package myApplication4.util.data;


import java.io.IOException;

import myApplication4.util.io.IOUtil;


public class CloneUtil
{
	/**
	 * Gets the deep clone object.
	 * @param object the origin object
	 * @return the clone object
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static Object deepClone(Object object)
		throws IOException, ClassNotFoundException
	{
		return IOUtil.deepClone(object);
	}
	
	public static void main(String[] args)
	{
		String[] array = {"Value1", "Value2", "Value3"};
		System.out.println("array [" + array + "]'s value is [" + array[0] + ", " + array[1] + ", " + array[2] + "]");
		
		System.out.println("execute deep clone");
		
		String[] arrayClone = null;
		try
		{
			arrayClone = (String[]) CloneUtil.deepClone(array);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}

		array[0] = "Value4";
		array[1] = "Value5";
		array[2] = "Value6";
		
		System.out.println("array [" + array + "]'s new value [" + array[0] + ", " + array[1] + ", " + array[2] + "]");
		System.out.println("deep clone array [" + arrayClone + "]'s value [" + arrayClone[0] + ", " + arrayClone[1] + ", " + arrayClone[2] + "]");
	}
}