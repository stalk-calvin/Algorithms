## CompareVersion

Compare two version numbers version1 and version2.  
If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

Here is an example of version numbers ordering:

```0.1 < 1.1 < 1.2 < 13.37```

## CountAndSay

The count-and-say sequence is the sequence of integers beginning as follows:
```1, 11, 21, 1211, 111221, ...```

`1` is read off as `"one 1"` or `11`.  
`11` is read off as `"two 1s"` or `21`.  
`21` is read off as `"one 2`, then `one 1"` or `1211`.

Given an integer n, generate the nth sequence.

## ExcelSheetColumnTitle

Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

```
    1 -> A  
    2 -> B  
    3 -> C  
    ...  
    26 -> Z  
    27 -> AA  
    28 -> AB  
```
## Isomorphic

Given two strings s and t, determine if they are isomorphic.

For example,

```
Given "egg", "add", return true.

Given "foo", "bar", return false.

Given "paper", "title", return true.
```

## LengthOfLastWord

Calulate the character length of last word separated by a space.

## NonRepeated

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

```
s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
```

## LongestCommonPrefix

Write a function to find the longest common prefix string amongst an array of strings.

## RansomNote

Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

You may assume that both strings contain only lowercase letters.

```
canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true
```

## Reverse String

Write a function that takes a string as input and returns the string reversed.

Example:  
Given s = "hello", return "olleh".

## ReverseVowel

Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:  
Given s = "hello", return "holle".

Example 2:  
Given s = "leetcode", return "leotcede".

## StrStr

Find the position of the first occurrence of a substring in a string

## ValidPalindrome

Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,  
`"A man, a plan, a canal: Panama"` is a palindrome.  
`"race a car"` is not a palindrome.

## WordPattern

Given a `pattern` and a string `str`, find if `str` follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in `pattern` and a non-empty word in `str`.

Examples:  
pattern = `"abba"`, str = `"dog cat cat dog"` should return true.  
pattern = `"abba"`, str = `"dog cat cat fish"` should return false.  
pattern = `"aaaa"`, str = `"dog cat cat dog"` should return false.  
pattern = `"abba"`, str = `"dog dog dog dog"` should return false.  

## ZigZag

The string `"PAYPALISHIRING"` is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

```
P   A   H   N
A P L S I I G
Y   I   R
```

And then read line by line: `"PAHNAPLSIIGYIR"`

`convert("PAYPALISHIRING", 3)` should return `"PAHNAPLSIIGYIR"`.