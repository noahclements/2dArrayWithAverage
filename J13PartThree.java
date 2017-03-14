import java.io.*;


public class J13PartThree {
	public static void main(String[] args) throws IOException {
		InputStreamReader inStream = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(inStream);
		String inData;
		
	
		int[][] ints = new int[5][4]; //The 2D array, 5 columns, 4 rows. 20 inputs.
        for(int i = 0; i < 5; i++) { // while 'i' is less than 5, it will add +1 to 'i' and do everything below. This is the column 'for loop'
        
                for(int x = 0; x < 4; x++) { // while 'x' is less than 4, it will add +1 to 'x' and do everything below. This is the row 'for loop'
                	System.out.println("Please enter another integer: ");	// it will ask for another integer, 20 times. 
                		inData = stdin.readLine();
                        ints[i][x] = Integer.parseInt(inData); // this will fill all the spots in the 2D array
                }
        }
       
        // this is where the array will be printed as a grid, with the ++ part will repeat and print the array until the 20th integer.
        for(int column = 0; column < 5; column++) { // while column is less than 5, +1 to column, and do everything below. 
        	// above prints the 5 in column first, then goes to the for loop below, and repeats. 
                
        	for(int row = 0; row < 4; row++) {	// while row is less than 4, +1 to row, and do everything below. 
        		// once first column is printed, it goes to 2nd row, and then prints the columns, and repeats. 
                        System.out.print(ints[column][row] + " "); //Outputs the array with a space. 
                }
              System.out.println(); // makes the output into a 5x4 grid shape
        }
        
        
		for(int avgCol = 0; avgCol < ints.length; avgCol ++) {
			int sum = 0;
			for(int avgRow = 0;  avgRow < ints[avgCol].length; avgRow++) {
				sum = sum + ints[avgCol][avgRow];
				
				
			}
			System.out.println("The average of column #" + avgCol + " is: " + sum/ints[avgCol].length);
				System.out.println();
			
		}
        
		
	}
}
