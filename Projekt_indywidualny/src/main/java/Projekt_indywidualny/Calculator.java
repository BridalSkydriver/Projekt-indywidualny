package Projekt_indywidualny;

public class Calculator {
	Calculator(){
		
	}
	
	public boolean checkIfcorrect(String value, int sys) throws UnknownCharacterException {
		for(int i = 0; i < value.length(); i++)
			if(this.decodeSign(value.charAt(i)) >= sys){
				return false;
			}
		return true;
	}
	
	public boolean checkSys(int sys) {
		if(sys > 1 && sys < 63) {
			return true;
		}
		else {
			return false;
		}
	}
	private long convertToDec(String value, int sys) throws UnknownCharacterException {
		long result = 0;
		int sign;
		for(int i = 1; i <= value.length(); i++) {
			sign = this.decodeSign(value.charAt(value.length() - i));
			result += sign * Math.pow(sys, i - 1);
		}
		return result;
	}
	
	private int decodeSign(char sign) throws UnknownCharacterException {
		int result = 0;
		if((int) sign >= '0' && (int) sign <= '9') {
			result = (int) sign - (int)'0';
		}
		else if((int) sign >= 'a' && (int) sign <= 'z'){
			result = (int) sign - (int)'a' + 36;
		}
		else if((int) sign >= 'A' && (int) sign <= 'Z'){
			result = (int) sign - (int)'A' + 10;
		}
		else {
			throw new UnknownCharacterException("Sign out of range");
		}
		return result;
	}
	
	
	private String convertToSys(long value, int sys) throws UnknownCharacterException {
		String result = "";
		while(value > 0) {
			result = this.codeSign(value%sys) + result;
			value = value / sys;
		}
		return result;
	}
	
	private char codeSign(long value) throws UnknownCharacterException {
		char result;
		if(value >= 0 && value <= 9) {
			result = (char)(value + (int)'0');
		}
		else if(value >= 10 && value <= 35) {
			result = (char)(value + (int)'A' - 10);
		}
		else if(value >= 36 && value <= 61) {
			result = (char)(value + (int)'a' - 36);
		}
		else {
			throw new UnknownCharacterException("Sys to big to code sign");
		}
		return result;
	}
	public String convert(String value, int entrySys, int exitSys) throws UnknownCharacterException {
		String result = "";
		result = this.convertToSys(this.convertToDec(value, entrySys), exitSys);
		return result;
	}
}
