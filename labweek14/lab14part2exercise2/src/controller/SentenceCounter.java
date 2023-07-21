package controller;

public class SentenceCounter
{
	private int size = 5000;
	private String sentence;
	
	public SentenceCounter(byte[] byteData)
	{
		this.sentence = new String(byteData);
	}
	
	public String getSentence()
	{
		return sentence;
	}
	
	/**
	 * This method convert value into an array of byte
	 * @param length
	 * @return
	 */
	
	public byte[] convertToByteArray(int value)
	{
		byte[] outData = new byte[size];
		String stringValue = Integer.valueOf(value).toString();
		outData = stringValue.getBytes();
        return outData;
	}
	
	/**
	 * This method count the number of characters in a sentence
	 * @return
	 */
	
	public int Characters()
	{
		int index = 0;
        char currentChar = sentence.charAt(index);
        while (currentChar != '\0') 
        {
        	currentChar = sentence.charAt(index++);
        }
        
        return index - 1;
	}
	
	public int Vowels()
	{
	    int vowels = 0;
	    int index = 0;
	    while (index < sentence.length())
	    {
	        char currentChar = sentence.charAt(index);
	        if (currentChar == 'a' || currentChar == 'A' || currentChar == 'e' || currentChar == 'E' ||
	                currentChar == 'i' || currentChar == 'I' || currentChar == 'o' || currentChar == 'O' ||
	                currentChar == 'u' || currentChar == 'U')
	        {
	            vowels++;
	        }
	        index++;
	    }
	    return vowels;
	}

	public int Consonants()
	{
	    int consonants = 0;
	    int index = 0;
	    while (index < sentence.length())
	    {
	        char currentChar = sentence.charAt(index);
	        if (Character.isLetter(currentChar) && !isVowel(currentChar)) 
	        {
	            consonants++;
	        }
	        index++;
	    }
	    return consonants;
	}

	public int Punctuations()
	{
	    int punctuations = 0;
	    int index = 0;
	    while (index < sentence.length())
	    {
	        char currentChar = sentence.charAt(index);
	        if (currentChar == ',' || currentChar == '.' || currentChar == '?' || currentChar == '!' ||
	                currentChar == '-' || currentChar == '"')
	        {
	            punctuations++;
	        }
	        index++;
	    }
	    return punctuations;
	}

	private boolean isVowel(char c)
	{
	    c = Character.toLowerCase(c);
	    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}
}