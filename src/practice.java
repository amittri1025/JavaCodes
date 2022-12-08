import java.util.*;

class test{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int size = 5;
        String[] names = new String[size];

		for(int i =0; i<size; i++){
			names[i] = scn.nextLine();
		}

//        Printing the given Names
        System.out.println("\n## Input Strings: ");
        for(int i=0; i<size; i++){
            System.out.print(names[i] + ", ");
        }
        System.out.println();


        //Find the duplicates
        int duplicates = 0;

        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                if(names[i].compareTo(names[j])==0){
                    duplicates++;
                }
            }
        }


        Arrays.sort(names);

//         Reversing the string

        for(int i=0; i<size; i++){
            //odd case
            if(i%2!=0){
                String rev = names[i];

                char[] revCh = new char[rev.length()];

                for(int k=0;k<rev.length();k++){
                    revCh[k] = rev.charAt(k);

                }

                int x = 0; int y =rev.length()-1;

                while(x<=y){
                    char temp = revCh[x];
                    revCh[x] = revCh[y];
                    revCh[y] = temp;
                    x++;
                    y--;

                }

                String ans = String.valueOf(revCh);
                names[i] = ans;


            }

        }

        // Printing the strings

        System.out.println("\n## Sorted and Reversed Strings: ");
        for(int i=0; i<size; i++){
            System.out.print(names[i] + ", ");
        }
        System.out.println();

        System.out.println("No. of Duplicates:  "+ duplicates);


    }
}