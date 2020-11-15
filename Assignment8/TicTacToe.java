import java.util.*;



/**
 * I put some codes I wrote in ticTacToe.java file which can give some tips I think. 
 * You can just delete codes or functions I wrote if you come up with some other methods to finish the requirements.
 */

public class TicTacToe {


    public static void main(String[] args) {
        char[][] gameBoard = {
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
        };
        
        printGameBoard(gameBoard);
        Set<Integer> set = new HashSet<Integer>();
        for(int i=1;i<=9;i++) {
        	set.add(i);
        }
        

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your placement (1-9): ");
            int playerPos = scan.nextInt();
            // write your code here
            placePiece(gameBoard,playerPos,"player");
            if(checkWinner(gameBoard)=="Player Win!"||checkWinner(gameBoard)=="CPU Win"||checkWinner(gameBoard)=="Dogfall") {
            	System.out.println(checkWinner(gameBoard));
            	break;
            }
            System.out.println();
            set.remove(playerPos);
            while(true) {
            	Random random = new Random();
                int randomItem = random.nextInt(9)%(9) + 1;
                if(!set.contains(randomItem)) {
                	continue;
                }
                else {
                	placePiece(gameBoard,randomItem,"cpu");
                	 set.remove(randomItem);
                	break;
                }
            } 
        }
    }

    public static void printGameBoard(char[][] gameBoard) {
        // write your code here
    	for(int i=0;i<gameBoard.length;i++) {
    		for(int j=0;j<gameBoard[0].length;j++) {
    			System.out.print(gameBoard[i][j]);
    		}
    		System.out.println();
    	}
    }

    public static void placePiece(char[][] gameBoard, int pos, String user) {
        char symbol = ' ';
        List<Integer> playerPositions=new ArrayList<>();
        List<Integer> cpuPositions=new ArrayList<>();
        if (user.equals("player")) {
            symbol = 'X';
            playerPositions.add(pos);
        } else if (user.equals("cpu")) {
            symbol = 'O';
            cpuPositions.add(pos);
        }
        // write your code here
        for(int i=0;i<gameBoard.length;i++) {
    		for(int j=0;j<gameBoard[0].length;j++) {
    			if(pos==1+3*(i/2)+j/2&&gameBoard[i][j]==' ') gameBoard[i][j]=symbol;	
    			System.out.print(gameBoard[i][j]);
    		}
    		System.out.println();
    	}

    }

    public static String checkWinner(char[][] gameBoard) {
        // write your code here
    	if(gameBoard[0][0]==gameBoard[0][2]&&gameBoard[0][4]==gameBoard[0][2]) {
    		if(gameBoard[0][0]=='X') return "Player Win!";
    		else if(gameBoard[0][0]=='O') return "CPU Win";
    	}
    	if(gameBoard[2][0]==gameBoard[2][2]&&gameBoard[2][2]==gameBoard[2][4]) {
    		if(gameBoard[2][0]=='X') return "Player Win!";
    		else if(gameBoard[2][0]=='O') return "CPU Win";
    	}
    	if(gameBoard[4][0]==gameBoard[4][2]&&gameBoard[4][2]==gameBoard[0][4]) {
    		if(gameBoard[4][0]=='X') return "Player Win!";
    		else if(gameBoard[4][0]=='O') return "CPU Win";
    	}
    	if(gameBoard[0][0]==gameBoard[2][0]&&gameBoard[2][0]==gameBoard[4][0]) {
    		if(gameBoard[0][0]=='X') return "Player Win!";
    		else if(gameBoard[0][0]=='O') return "CPU Win";
    	}
    	if(gameBoard[0][2]==gameBoard[2][2]&&gameBoard[2][2]==gameBoard[4][2]) {
    		if(gameBoard[0][2]=='X') return "Player Win!";
    		else if(gameBoard[0][2]=='O') return "CPU Win";
    	}
    	if(gameBoard[0][4]==gameBoard[2][4]&&gameBoard[2][4]==gameBoard[4][4]) {
    		if(gameBoard[0][4]=='X') return "Player Win!";
    		else if(gameBoard[0][4]=='O') return "CPU Win";
    	}
    	if(gameBoard[0][0]==gameBoard[2][2]&&gameBoard[2][2]==gameBoard[4][4]) {
    		if(gameBoard[0][0]=='X') return "Player Win!";
    		else if(gameBoard[0][0]=='O') return "CPU Win";
    	}
    	if(gameBoard[0][4]==gameBoard[2][2]&&gameBoard[2][2]==gameBoard[4][0]) {
    		if(gameBoard[0][4]=='X') return "Player Win!";
    		else if(gameBoard[0][4]=='O') return "CPU Win";
    	}
    	int num=0;
    	for(int i=0;i<gameBoard.length;i++) {
    		for(int j=0;j<gameBoard[0].length;j++) {
    			if(gameBoard[i][j]==' ') num++;
    		}
    	}
    	if(num==0) return "Dogfall";
    	return "continue";
    }

}

