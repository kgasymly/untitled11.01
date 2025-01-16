package ru.itis403;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainBigText {
    public static void main(String[] args) throws FileNotFoundException {
        Pattern pattern = Pattern.compile("(^|\s)я|(^|\s)мне|(^|\s)мо[е|ё]");
        Pattern pattern1 = Pattern.compile("(^|\s)мор[e|я|ем|ю|]");
        Pattern pattern2 = Pattern.compile("(^|\s)муза");
        Pattern pattern3 = Pattern.compile("(^|\s)любовь");
        Pattern pattern4 = Pattern.compile("(^|\s)ветры.*веют");
        Pattern pattern5 = Pattern.compile("(^|\s)друзья");
        Pattern pattern6 = Pattern.compile("(^|\s)поэт");
        Pattern pattern7 = Pattern.compile("(^|\s)взор.*(встревожит|тревожит)");

        Scanner scanner = new Scanner(new File("pushkin.txt"));
        int counter = 0;
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;
        int counter6 = 0;
        int counter7 = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().toLowerCase();
            Matcher matcher = pattern.matcher(line);
            Matcher matcher1 = pattern1.matcher(line);
            Matcher matcher2 = pattern2.matcher(line);
            Matcher matcher3 = pattern3.matcher(line);
            Matcher matcher4 = pattern4.matcher(line);
            Matcher matcher5 = pattern5.matcher(line);
            Matcher matcher6 = pattern6.matcher(line);
            Matcher matcher7 = pattern7.matcher(line);
/////////////////////////////////////////////////////////////
            while (matcher.find() && counter<5) {
                if (counter==5) {
                    break;
                } else {
                    counter++;
                    //System.out.println(line.substring(matcher.start(), matcher.end()));
                    ColoredPrint.print(line, matcher.start(), matcher.end());
                }
            }
///////////////////////////////////////////////////////////
            while (matcher1.find() && counter1<5) {
                if (counter1==5) {
                    break;
                } else {
                    counter1++;
                    //System.out.println(line.substring(matcher.start(), matcher.end()));
                    ColoredPrint.print(line, matcher1.start(), matcher1.end());
                }
            }
/////////////////////////////////////////////////////////////////
            while (matcher2.find() && counter2<5) {
                if (counter2==5) {
                    break;
                } else {
                    counter2++;
                    //System.out.println(line.substring(matcher.start(), matcher.end()));
                    ColoredPrint.print(line, matcher2.start(), matcher2.end());
                }
            }
////////////////////////////////////////////////////////////////////
            while (matcher3.find() && counter3<5) {
                if (counter3==5) {
                    break;
                } else {
                    counter3++;
                    //System.out.println(line.substring(matcher.start(), matcher.end()));
                    ColoredPrint.print(line, matcher3.start(), matcher3.end());
                }
            }
/////////////////////////////////////////////////////////////////////
            while (matcher4.find() && counter4<5) {
                if (counter4==5) {
                    break;
                } else {
                    counter4++;
                    //System.out.println(line.substring(matcher.start(), matcher.end()));
                    ColoredPrint.print(line, matcher4.start(), matcher4.end());
                }
            }
///////////////////////////////////////////////////////////////////////////////////
            while (matcher5.find() && counter5<5) {
                if (counter5==5) {
                    break;
                } else {
                    counter5++;
                    //System.out.println(line.substring(matcher.start(), matcher.end()));
                    ColoredPrint.print(line, matcher5.start(), matcher5.end());
                }
            }
//////////////////////////////////////////////////////////////////////////////////////////
            while (matcher6.find() && counter6<5) {
                if (counter6==5) {
                    break;
                } else {
                    counter6++;
                    //System.out.println(line.substring(matcher.start(), matcher.end()));
                    ColoredPrint.print(line, matcher6.start(), matcher6.end());
                }
            }
/////////////////////////////////////////////////////////////////////////////////////////////
            while (matcher7.find() && counter7<5) {
                if (counter7==5) {
                    break;
                } else {
                    counter7++;
                    //System.out.println(line.substring(matcher.start(), matcher.end()));
                    ColoredPrint.print(line, matcher7.start(), matcher7.end());
                }
            }
        }
        scanner.close();
    }
}
