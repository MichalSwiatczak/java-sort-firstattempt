/*
TASK is: 
Sort data.txt file into two categories.
 Number Type:
 Value:

 Regular expressions to identify groups are:
'"'+ "(.*?)" + '"' 
"\\" + "[(.*?)\\" + "]" 
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class Main {

public static void main(String[] args) throws FileNotFoundException {

    Scanner scan = new Scanner (new File("Data.txt"));
   
            Pattern pat = Pattern.compile('"'+ "(.*?)" + '"' + "|" + "\\" + "[(.*?)\\" + "]");
            List<String> numberTypes = scan.findAll(pat)
                                        .map(MatchResult::group)
                                        .collect(Collectors.toList());
                                        scan.close();

                                        
for (int i = 0; i < numberTypes.size(); i++) {

  if (i%2 == 0) {
  System.out.println("Type :" + numberTypes.get(i).toString());
  } else {
  System.out.println("Values :" + numberTypes.get(i));
  }
                                            }






// numberTypes.forEach(System.out::println);
}








/*Function name extractInt
 * @param List<String> valueGroup
 * 1. pass in a list of size n containing Int values delimited by ,
 * 2. place Int values into Array of size n
 * 
 */


/*Structure Function Prints Everything 
 * pass in the first value set
*/


}