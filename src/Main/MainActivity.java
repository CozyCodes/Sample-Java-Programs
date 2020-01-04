package Main;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainActivity {


    int[] failure;


    public static void main(String[] args) {

//        Log.v("getAnagram ", String.valueOf(getAnagaram("Thulasiram","marisaluhh")));
//        getDevisor(6);
//        getMultiples(5);
//        DictionaryOrder();
//        Log.v("getDevosors ",getSmallestAndLargest("welcometojava",3));
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        long[] arlong = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};

//        Log.v("getArraysum", " - "+ simpleArraySum(ar));
//        Log.v("getArraysum", " - "+ simpleArraySumBig(arlong));
//        plusMinus(ar);
//        plusMinus(ar);
//        Log.v("getnos", " - "+ divisibleSumPairs(6,3,ar));
//        sockMerchant(9,ar);
//        countingValleys(8,"UDDDUDUU");
        String s="aba";
        int n = 10;
//        repeatedString(s,n);
        int arr[] = {1, 2, 3, 4, 5};
//        Log.v("getArraysum", " - "+ JumpingontheClouds(arr));

//        int[] result = rotLeft(arr,4);

//        for (int i = 0; i < result.length; i++) {
//
//            Log.v("getArraysum", " - "+ result[i]);
//
//        }
//        Log.v("sherlockString", " - "+ sherlockString("aabbcd"));  // abcdefghhgfedecba aaaabbbbcd
//        getSpecialString();
       /* List<Integer> grades =  new ArrayList<>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);
        grades = gradingStudents(grades);
        for(int i= 0;i<grades.size();i++){
            Log.v("gradingStudents", " - "+ grades.get(i));
        }*/
//        lotteryCoupons(22);
//        Intent intent = getPackageManager().getLaunchIntentForPackage("com.arestrading.ehealth.growlink");
//        startActivity(intent);
//        Intent intent = new Intent(Intent.ACTION_MAIN);
////        intent.setComponent(new ComponentName("com.arestrading.ehealth.growlink","com.arestrading.ehealth.growlink.user.EditPhoneActivity"));
//        intent.setComponent(new ComponentName("com.arestrading.ehealth.growlink","com.arestrading.ehealth.growlink.login.activity.SignUpActivity"));
////        intent.setComponent(new ComponentName("com.arestrading.ehealth.growlink","com.arestrading.ehealth.growlink.android_host.activity.MainActivity"));
//        startActivity(intent);
        String[] val = {"129300455" ,"5559948277","012334556" ,"56789","123456879"};
//        winningLotteryTicket(val);
//        Log.v("winningLotteryTicket","- "+ winningLotteryTicket(val));
//        Log.v("minimumNumber","- "+ minimumNumber(11,"hackerrank"));
        int[] ch = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5 ,5, 5, 5, 5, 5 ,5 ,5 ,5, 5, 5, 5 ,5, 5, 7};
//        Log.v("designerPdfViewer",String.valueOf(designerPdfViewer(ch,"zaba")));
        String val1 = "1 4 3 2 5";
//        getArrayReverse(val1,5);
        int[][] num = {{1, 2, 3, 4}, {5, 6, 7, 8},{ 9, 10, 11, 12}, {13, 14, 15, 16}};
//        spiralTraverse(4,4,num);
//        checkPalindrom();
//        int [] sortArr = sortArray();
//        for(int i=0;i<sortArr.length;i++){
//            System.out.println(sortArr[i]);
//        }
//        kangaroo(0,2,5,3);
        String txt = "ABABDABACDABABCABAB";
        String pat = "ABABCABAB";
        KMPSearch(pat,txt);
        int r = longestPrefixSuffix("blablabla");
        
    }




 

    public boolean getAnagaram(String A, String B){
        char[] arrA = A.toUpperCase().toCharArray();
        char[] arrB = B.toUpperCase().toCharArray();
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        int[] arr={1,2,3,4,5};
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        if(A.length() == B.length()){
         for(int i=0;i < A.length();i++){
             if(Character.toUpperCase(arrA[i]) != Character.toUpperCase(arrB[i]))
              return false;
         }
        }else{
           return false;
        }
        return true;
    }

    public void getDevisor(int n){
        int temp = 0;
        for(int i= 1;i <=n; i++){
            if(n%i == 0){
                
                temp += i;
            }
        }
       
    }
public void getMultiples(int N){
    for(int i=1; i <= 10;i++){
        System.out.println(N + " x "+ i+ " = "+ N * i);
    }
}

   public void DictionaryOrder(){
  String A = "hello";

  String B = "java";
 StringBuilder input = new StringBuilder();
       input.append(A);
       input.reverse();
       System.out.println("getDevosors1"+ " - "+ A.compareTo(B));
       System.out.print("hello "+A.compareTo(B));
  if(A.compareTo(B) > 0){
	  System.out.println("getDevosors2"+ " - "+ A.compareTo(B));
  }
   }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        int iterations = s.length()-k;

        largest = s.substring(0,k);

        smallest = s.substring(0,k);
System.out.println("getDevosors"+ " - "+ largest +" - "+ smallest);
        for(int i = 0; i<=iterations;i++)

        {

            if(largest.compareTo(s.substring(i,i+k))<0)
            {
                largest = s.substring(i,i+k);
            }

            if(smallest.compareTo(s.substring(i,i+k))>0)
            {
                smallest = s.substring(i,i+k);
            }

        }
        return smallest + "\n" + largest;
    }

     int simpleArraySum(int[] ar) {
        int temp=0;
       for(int i=0;i<ar.length;i++){
           int a = ar[i];
           temp += a;
       }
return temp;
    }
    long simpleArraySumBig(long[] ar) {
        long temp=0;
        for(int i=0;i<ar.length;i++){
            long a = ar[i];
            temp += a;
        }
        return temp;
    }

    static void plusMinus(int[] arr) {

        int positive =0;
        int negative = 0;
        int neutral = 0;
        for(int i=0;i < arr.length;i++){
            if(arr[i] >0){
                positive++;
            }
            else if(arr[i] <0){
                negative++;
            }else if(arr[i] == 0){
                neutral++;
            }
        }
        System.out.println(positive/arr.length);
        System.out.println(negative/arr.length);
        System.out.println(neutral/arr.length);
    }

    int divisibleSumPairs(int n, int k, int[] ar) {
int count=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
               System.out.println("getDevosors"+" - "+ar[i]+" "+ar[j]);
if(i != j && (ar[i]+ar[j]) %k ==0){
    count++;
}
            }
        }
        return count;
    }
    void sockMerchant(int n, int[] ar) {
        Arrays.sort(ar);
        int pair =0;
        for(int i=0;i<n-1;i++){
        	System.out.println("getloopval"+ " - "+ar[i]+" "+ar[i+1]);
            if(ar[i] == ar[i+1]){
                pair++;
                System.out.println("getloopval1"+" - "+ar[i]+" "+ar[i+1]);

            }
        }
        System.out.println("getDevosors"+ " - "+pair);
    }

    int countingValleys(int n, String s) {
        int valleys = 0;
        int currentPlane =0;
        boolean sealevel =false;

        char[] ar = s.toCharArray();
        for(int i=0;i<n;i++){

            if(String.valueOf(ar[i]).equals("U")){
                currentPlane++;
            }else if(String.valueOf(ar[i]).equals("D")){
                if(currentPlane == 0){
                    valleys++;
                }
                currentPlane-- ;
            }

            System.out.println("countingValleys"+ " - "+valleys);

        }

        return valleys;
    }

    long repeatedString(String s, long n){

        long countForSubstring = 0;
        long totalCount = 0;
        //Determines how many a's are in a substring
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == 'a')
            {
                countForSubstring++;
            }
        }

        //Determines how many complete substrings we will analyze
        long divisor = n / s.length();
        System.out.println("repeatedString"+ " = "+ divisor);
        totalCount += divisor * countForSubstring;
        //Determines how many characters in we will analyze towards the end of our n range
        long remainder = n % s.length();
        System.out.println("repeatedString"+ " = "+ remainder);
        for(int i = 0; i < remainder; i++)
        {
            if(s.charAt(i) == 'a')
            {
                totalCount++;
            }
        }

       return totalCount;
    }

    int JumpingontheClouds(int [] arr){
        int count =0;
        for(int i=0;i<arr.length-1;i++){
        	System.out.println("JumpingontheClouds"+" - "+arr[i]);
            if(arr[i+1] == 0){
                count++;
                i +=1;
            } else if(arr[i+2] == 0){
                count++;
                i +=2;
            }
        }
        return count;

    }

    int[] rotLeft(int[] a, int d) {
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                if(a[j] == 5){
                    int temp = a[j];
                    System.out.println("rotLeft1"+ " = "+ temp);
                    a[j] = a[j-1];
                    System.out.println("rotLeft2"+ " = "+ a[i]);
                    a[j-1] = temp;
//                    Log.v("rotLeft3", " = "+ a[i-1]);
                }
            }
//            Log.v("rotLeft1", " = "+ a[i]);


        }
        return a;
    }

    String sherlockString(String s){
String val = "No";
       char[] st = s.toCharArray();
       Arrays.sort(st);
        String newst = new String(st);
        int count =0;
        int n =newst.length();
        if(newst.length() % 2 != 0){
//            n = n-1;

        }

        for(int i=0;i<n-1;i++){

            if(newst.charAt(i) == newst.charAt(i+1)){
                count +=2;
                i += 1;
            }

        }
        if(newst.length() % 2 != 0){
            if(count == newst.length()-1){
                val = "Yes";
            }

        }else{
           if(count == newst.length()){
                val = "Yes";
            }
        }

        return val;
    }

    String getSpecialString(){
        String s = "aaaa";
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
            	System.out.println("getSpecialString"+" - "+ s.substring(0,j));
            }

        }
        return "";
    }

    void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int noofApples =0;
        int noofOranges = 0;
        for(int i=0;i<apples.length;i++){
            if(apples[i]+ a >= s && apples[i]+a <= t){
                noofApples++;
            }
        }
        for(int j=0;j<oranges.length;j++){
            if(oranges[j]+ b >= s && oranges[j]+b <= t){
                noofOranges++;
            }
        }
        System.out.println(noofApples);
        System.out.println(noofOranges);
    }

    public List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> newgrades  =  new ArrayList<>();
        int num= 0;
        int nextnum = 0;
        for(int i=0;i<grades.size();i++){
            num = grades.get(i) / 5;
            nextnum = (num+1) * 5;
            if(nextnum - grades.get(i) <3){
                if(grades.get(i)+2 >= 40){
                    newgrades.add(nextnum);
                }else{
                    newgrades.add(grades.get(i));
                }

            }else{
                newgrades.add(grades.get(i));
            }


        }
        // Write your code here
return newgrades;
    }

    public static int lotteryCoupons(int n) {
        // Write your code here
        for(int i=1;i<=n;i++){

               System.out.println("lotteryCoupons"+ " - "+ i );


        }
        return 0;
    }

    long winningLotteryTicket(String[] tickets) {
        long count= 0;
        for(int i=0;i<tickets.length;i++){
            for(int j=i+1;j<tickets.length;j++){
                if(i != j){
//                    Log.v("winningLotteryTicket", " - "+ tickets[i]+" - "+tickets[j] + " - " +(tickets[i]+tickets[j]));
                    if((tickets[i]+tickets[j]).contains("0") && (tickets[i]+tickets[j]).contains("1") && (tickets[i]+tickets[j]).contains("2") && (tickets[i]+tickets[j]).contains("3") && (tickets[i]+tickets[j]).contains("4")
                    && (tickets[i]+tickets[j]).contains("5") && (tickets[i]+tickets[j]).contains("6") && (tickets[i]+tickets[j]).contains("7") && (tickets[i]+tickets[j]).contains("8")
                            && (tickets[i]+tickets[j]).contains("9")){
                        count++;
                    }
                }

            }
        }
        return count;
    }

    static int minimumNumber(int n, String password) {
        boolean num= false, low= false, up= false,spe = false;
        int count= 0;
        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_characters = "!@#$%^&*()-+";
        int getLength = password.length();
        for(int i=0;i<numbers.length();i++){
            String s = Character.toString(numbers.charAt(i));
            if(password.contains(s)){
                num = true;
            }
        }

        for(int i=0;i<lower_case.length();i++){
            String s = Character.toString(lower_case.charAt(i));
            if(password.contains(s)){
                low = true;
            }
        }

        for(int i=0;i<upper_case.length();i++){
            String s = Character.toString(upper_case.charAt(i));
            if(password.contains(s)){
                up = true;
            }
        }

        for(int i=0;i<special_characters.length();i++){
            String s = Character.toString(special_characters.charAt(i));
            if(password.contains(s)){
                spe = true;
            }
        }

        if(num){

        }else{
            count++;
        }
        if(low){

        }else{
            count++;
        }
        if(up){

        }else{
            count++;
        }
        if(spe){

        }else{
            count++;
        }
        if(getLength >= 6){

        }else{
            count = 6 - getLength;
        }
        return count;
    }

    public String numberToCharacterRepresentation(int number) {
        char[] ls = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        String r = "";
        while(true) {

            r = ls[number % 26] + r;
            System.out.println("valuesare"+ " - "+ r);
            if(number < 26) {
                break;
            }
            number /= 26;
        }
        return r;
    }

    int designerPdfViewer(int[] h, String word) {
        int high = 0;
        int finalval;
        for(char c: word.toCharArray()) {
            int i = c - 'a';
            int v = h[i];
            if(high < v) {
                high = v;
            }
        }
        finalval = word.length() * high;
        return finalval;
    }

    void getArrayReverse(String val,int n){

        int[] arr = new int[n];
        StringBuilder input = new StringBuilder();
        String[] arrItems = val.split(" ");
        for (int i = 0; i <= n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
            arr[i] = Integer.parseInt(arrItems[arrItems.length-i-1]);

           String str = Integer.toString(arr[i]);
            input.append(str+" ");
        }
        System.out.println("getArrayReverse"+ "- "+input.toString());
    }

    void spiralTraverse(int m, int n, int[][] arr){

     int top = 0;
     int bottom = m -1;
     int left = 0;
     int right = n-1;
     int dir = 1;

     while(top <= bottom && left <= right){

      if(dir ==1){

          // left to right
          for(int i =left;i<=right;i++){
//              Log.v("hello ",String.valueOf(arr[top][i]));
              System.out.println(arr[top][i]+ " ");


          }
          dir = 2;
          top++;
      }

      if(dir == 2){
          //top to bottom
          for(int i =top;i<=bottom;i++){
              System.out.println(arr[i][right]);


          }
          dir = 3;
          right--;
      }
      if(dir == 3){
          // right to left

          for(int i = right; i>= left;--i){
              System.out.println(arr[bottom][i]);
          }
          dir = 4;
          bottom--;
      }
if(dir == 4){

    for(int i=bottom;i>= top;--i){
        System.out.println(arr[i][left]);
    }
    dir=1;
    left++;
}
     }

    }

    void checkPalindrom(){
        String pal = "abaaa";
        char[] val = pal.toCharArray();
        String temp="";
        for(int i=0;i<pal.length();i++){
//            System.out.println(val[val-i-1]);
            temp = temp + String.valueOf(pal.charAt(pal.length() - i-1));


        }
        if(pal.equals(temp)){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }

    int[] sortArray(){
        int[] a = {1,2,0,0,2};
        int temp = 0;
        for(int i=0;i<a.length-1;i++){
            for(int j = i+1;j<a.length;j++){
                if(a[i] > a[j]){
                    temp =  a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
//            System.out.println(a[i]+ " - "+a[i+1]);

//            System.out.println(a[i]);
    }
        return a;
    }

    String kangaroo(int x1, int v1, int x2, int v2) {
        boolean looping = true;
        int count =0;
        String val = "NO";
        while(looping){
            for(int i=0;i<10000;i++){
                x1 = x1+v1;
                x2 = x2+v2;
                if(x1 == x2){
                    looping =false;
                    val = "YES";
                }
            }
            looping = false;
        }
        return val;
    }


    static void KMPSearch(String pat, String txt)
    {
        int M = pat.length();
        int N = txt.length();

        // create lps[] that will hold the longest
        // prefix suffix values for pattern
        int lps[] = new int[M];
        int j = 0; // index for pat[]

        // Preprocess the pattern (calculate lps[]
        // array)
        computeLPSArray(pat, M, lps);

        int i = 0; // index for txt[]
        while (i < N) {
            if (pat.charAt(j) == txt.charAt(i)) {
                j++;
                i++;
            }
            if (j == M) {
                System.out.println("Found pattern "
                        + "at index " + (i - j));
                j = lps[j - 1];
            }

            // mismatch after j matches
            else if (i < N && pat.charAt(j) != txt.charAt(i)) {
                // Do not match lps[0..lps[j-1]] characters,
                // they will match anyway
                if (j != 0)
                    j = lps[j - 1];
                else
                    i = i + 1;
            }
        }
    }

   static void computeLPSArray(String pat, int M, int lps[])
    {
        // length of the previous longest prefix suffix
        int len = 0;
        int i = 1;
        lps[0] = 0; // lps[0] is always 0

        // the loop calculates lps[i] for i = 1 to M-1
        while (i < M) {
        	System.out.println("computeLPSArray"+" = "+ pat.charAt(i) + " - "+ pat.charAt(len) + " = "+len);
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }else // (pat[i] != pat[len])
            {
                // This is tricky. Consider the example.
                // AAACAAAA and i = 7. The idea is similar
                // to search step.
                if (len != 0) {
                    len = lps[len - 1];

                    // Also, note that we do not increment
                    // i here
                }else // if (len == 0)
                {
                    lps[i] = len;
                    i++;
                }
            }
        }
    }


    static int longestPrefixSuffix(String s)
    { //blablabla
        int n = s.length();

        if(n < 2) {
            return 0;
        }

        int len = 0;
        int i = n/2;
        System.out.println("hellomy"+String.valueOf(i) + s.charAt(len)  );
        while(i < n) {

            if(s.charAt(i) == s.charAt(len)) {
                ++len;
                ++i;
            }
            else
            {
                if(len == 0) { // no prefix
                    ++i;
                }
                else
                {
                    // search for shorter prefixes
                    --len;
                }
            }
        }

        return len;

    }
}
