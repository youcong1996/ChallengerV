package com.blog.cutomer.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

import javax.servlet.ServletInputStream;

import org.mindrot.jbcrypt.BCrypt;


public class Tools {
	
	/**
	 * 判空
	 * @param s
	 * @return
	 */
	public static boolean isEmpty(String s) {
		if(s == null || s.equals("")) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
	/**
	 * 格式化从数据库中取出的时间，去掉最后的.0
	 * @param datetime
	 * @return
	 */
	public static String formatDate(String datetime) {
		if(!Tools.isEmpty(datetime)) {
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
			Date date = null;
			try {
				date = df.parse(datetime);
			} catch (ParseException e) {
				e.printStackTrace();
				return null;
			}
			return df.format(date);
		}
		return datetime;
	}
	
	/**
	 * 获取现在时间 --格式化后的日期
	 */
	public static String getCurrentDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(new Date());
	}
	
	/**
	 * 获取现在时间yyyyMMddHHmmss
	 */
	public static String getCurrentDate2() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		return sdf.format(new Date());
	}
	
	
	/**
	 *  输入日期，转化为毫秒数，用DATE方法()
	 */  
	 public static long dateToMillins(String date) {
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 long millionSeconds = 0;
		try {
			millionSeconds = sdf.parse(date).getTime();
		} catch (ParseException e) {
			e.printStackTrace();
		}//毫秒
		
	    return millionSeconds;
	 }

	 /**
		 * 毫秒数  转成 yyyyMMddHHmmss
		 */  
	public static String millinsToDateStr(long datetime) {
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss"); 
		Date date2 = new Date();  
        date2.setTime(datetime);  
        String formatDate = df.format(date2);
		return formatDate;
	 }
		 
	 /**
		时间戳转化为yyyy-MM-dd HH:mm:ss 
	  */
	 public static String timestampToDate(Long time) {
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 String date = sdf.format(time);  
		 return date;
	 }
	 
	 /**
	  * 小数型字符串转int
	  */
	 public static int strToIntvalue(String str) {
		 Number num = Float.parseFloat(str);
		int i = num.intValue();
		return i;
	 }
	 
	 /**
	  * 获取四位随机码
	  * @return
	  */
	 public static String getFourRandom() {
		Random random = new Random();
		int math = random.nextInt(9000) + 1000;
		return String.valueOf(math);
	 } 
	 
	 /**
	  * 获取6位随机码
	  * @return
	  */
	 public static String getSixRandom() {
		Random random = new Random();
		int math = random.nextInt(900000) + 100000;
		return String.valueOf(math);
	 } 
	 
	 /**
	  * 获取1小时之后时间   格式化
	  */
	 public static String getOnehourLaterDate() {
		 long curren = System.currentTimeMillis();
	        curren += 1 * 60 * 60 * 1000;
	       return timestampToDate(curren);
	 }
	 
	 
	 /**
		* 字符流转字符串
		*/
	 public static String inputStreamToString(ServletInputStream inStream) {
		 String result = "";
		 ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		 try {
	            int _buffer_size = 1024;
	            if (inStream != null) {
	               
	                byte[] tempBytes = new byte[_buffer_size];
	                int count = -1;
	                while ((count = inStream.read(tempBytes, 0, _buffer_size)) != -1) {
	                    outStream.write(tempBytes, 0, count);
	                }
	                tempBytes = null;
	                outStream.flush();
	                //将流转换成字符串
	                result = new String(outStream.toByteArray(), "UTF-8");
	                //将字符串解析成XML
	                //Document doc = DocumentHelper.parseText(result);
	                //Map<String, Object> resultMap = XmlMapHandle.Dom2Map(doc);
	            }
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	           
	        }finally {
	        	 try {
	        		inStream.close();
					outStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
	        
			return result;
	 }
	 
	 /**
	  * 密码加密
	  */
	 public static String bcryptPwd(String pwd) {
		 return BCrypt.hashpw(pwd, BCrypt.gensalt(12));
	 }
	 
	 /**
	  * 验证密码正确性
	  * pwd 用户原来的密码    hashed用户新密码
	  */
	 public static boolean checkPwd(String pwd, String hashed) {
		 try {
			 return BCrypt.checkpw(pwd, hashed);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	 }
	 
	 /**
	  * 获取UUID
	  */
	 public static String getUUID() {
		 return UUID.randomUUID().toString().replaceAll("-", "");
	 }
	
}
