package com.hmn.ym.utils.des;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MD5Utils {
	private final static Log log = LogFactory.getLog(MD5Utils.class);
	private static final String UTF8 = "UTF-8";
	private static MessageDigest md = null;

	static {
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException ne) {
			log.error("NoSuchAlgorithmException: md5", ne);
		}
	}

	/**
	 * 对一个文件求他的md5值
	 * 
	 * @param f
	 *            要求md5值的文件
	 * @return md5串
	 */
	public static String md5(File f) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(f);
			byte[] buffer = new byte[8192];
			int length;
			while ((length = fis.read(buffer)) != -1) {
				md.update(buffer, 0, length);
			}

			return new String(Hex.encodeHex(md.digest()));
		} catch (FileNotFoundException e) {
			log.error("md5 file " + f.getAbsolutePath() + " failed:" + e.getMessage());
			return null;
		} catch (IOException e) {
			log.error("md5 file " + f.getAbsolutePath() + " failed:" + e.getMessage());
			return null;
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (IOException e) {

			}
		}
	}

	/**
	 * 求一个字符串的md5值
	 * 
	 * @param target
	 *            字符串
	 * @return md5 value
	 */
	public static String md5(String target) {
		return DigestUtils.md5Hex(target);
	}

	/***
	 * 根据字符串生成 32位的 MD5 码
	 * 
	 * @author tmc.sun 2012-11-05
	 * @param str
	 *            待生成 MD5码的字符串
	 * @return 根据字符串生成的 MD5码
	 */
	public static String stringToMD5(String str) {
		if (StringUtils.isEmpty(str)) {
			return null;
		}

		MessageDigest md5 = null;
		StringBuffer value = new StringBuffer();

		try {
			md5 = MessageDigest.getInstance("MD5");

			byte[] md5Bytes = md5.digest(str.getBytes(UTF8));

			for (int i = 0; i < md5Bytes.length; i++) {
				int val = (md5Bytes[i]) & 0xff;
				if (val < 16) {
					value.append("0");
				}
				value.append(Integer.toHexString(val));
			}
		} catch (Exception e) {

			return "";
		}

		return value.toString();

	}

	// 哈希加密S
	/**
	 * 将源字符串使用MD5加密为字节数组
	 * 
	 * @param source
	 * @return
	 */
	public static byte[] encode2bytes(String source) {
		byte[] result = null;
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.reset();
			md.update(source.getBytes("UTF-8"));
			result = md.digest();
		} catch (NoSuchAlgorithmException e) {

		} catch (UnsupportedEncodingException e) {

		}

		return result;
	}

	/**
	 * 将源字符串使用MD5加密为32位16进制数
	 * 
	 * @param source
	 * @return
	 */
	public static String encode2hex(String source) {
		byte[] data = encode2bytes(source);

		StringBuffer hexString = new StringBuffer();
		for (int i = 0; i < data.length; i++) {
			String hex = Integer.toHexString(0xff & data[i]);

			if (hex.length() == 1) {
				hexString.append('0');
			}

			hexString.append(hex);
		}

		return hexString.toString();
	}

	/**
	 * 验证字符串是否匹配
	 * 
	 * @param unknown
	 *            待验证的字符串
	 * @param okHex
	 *            使用MD5加密过的16进制字符串
	 * @return 匹配返回true，不匹配返回false
	 */
	public static boolean validate(String unknown, String okHex) {
		return okHex.equals(encode2hex(unknown));
	}
	// 哈希加密E

}
