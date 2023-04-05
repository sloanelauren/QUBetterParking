public class QuBetterParking 
{
    public static void main(String[] args) 
    {
        //Made variables that hold the size of the array, the values can be changed to whatever programmer wants
        int rowSize = 5; 
        int colSize = 5;
        
        //Creating the array
        char [][] parking;
        parking = new char[rowSize][colSize];

        //Counting variable for parking spaces
        int availableSpots = 0;
        //Printing Array and setting available spots
        for(int row = 0; row < rowSize; row++)
        {
            for(int col = 0; col < colSize; col++)
            {
                if(parking[row][col] == parking[0][0])
                {
                    //Setting [0][0] to the entrance/exit
                    parking[0][0] = 'E';
                    System.out.print(parking[row][col] + " ");
                    continue;
                }
                parking[row][col] = '0';
                System.out.print(parking[row][col] + " ");
                availableSpots++;
            }
            System.out.println();
        }
        System.out.println("Available spots: " + availableSpots);

        // searches array for first available spot - first spot that is "0"
        for(int i = 0; i < rowSize; i++){
            for(int j = 0; j < colSize; j++){
                if(parking[i][j] == '0'){
                    // i and j are the coordinates of the first available spot
                    // to print the ticket this print statement needs to be made to look all formal 
                    System.out.println(i + ", " + j);
                    // setting i and j to rowSize and colSize breaks the loop - a break could also be used here
                    i = rowSize;
                    j = colSize;
                }
            }
        }
    }
}