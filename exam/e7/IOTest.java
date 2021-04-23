package exam.e7;

import java.nio.charset.StandardCharsets;
import java.net.*;
import java.util.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

import java.io.*;

public class IOTest {
	public static void main(String[] args) throws MalformedURLException {
		/*
		 * http://iosnetworkdemo.appspot.com/json.jsp?msg=helloWorld，
		 * 會回應{"msg":"helloWorld","狀 態":"成功"}，編碼為UTF8
		 * 請利用Java程式呼叫此網址，此將此網址回傳的結果示在Console中(IOTest.java) 程式中除了MalformedURLException其它
		 * Exception處理必須使用try catch不能直接由方法抛出。 所有IO都必須close
		 */
		URL url = new URL("http://iosnetworkdemo.appspot.com/json.jsp?msg=helloWorld");
		
		try (InputStream is = url.openStream();InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
				BufferedReader reader = new BufferedReader(isr)) {

			String str;
			while ((str = reader.readLine()) != null) {
				System.out.println(str);
			}

			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
			
		}

}
