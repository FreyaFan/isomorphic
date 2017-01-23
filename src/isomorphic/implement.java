package isomorphic;

public class implement {
	 public static void main(String args[]) {
		 //case 1   
		 int no=1;
		   int P[][] =
		            {{0, 1, 0, 0, 1, 1, 0},
		            {1, 0, 1, 0, 0, 0, 1},
		            {0, 1, 0, 1, 0, 0, 0},
		            {0, 0, 1, 0, 0, 1, 1},
		            {1, 0, 0, 0, 0, 0, 1},
		            {1, 0, 0, 1, 0, 0, 1},
		            {0, 1, 0, 1, 1, 1, 0}};

		    int Q[][] = 
		            {{0, 1, 0, 1, 1, 0, 0},
		            {1, 0, 0, 0, 0, 1, 1},
		            {0, 0, 0, 1, 1, 1, 0},
		            {1, 0, 1, 0, 0, 0, 0},
		            {1, 0, 1, 0, 0, 1, 1},
		            {0, 1, 1, 0, 1, 0, 0},
		            {0, 1, 0, 0, 1, 0, 0}};
		  //case 2
		  /* int no=2; 
		    int P[][]={{0,1,1,1,1,0},
					   {1,0,0,0,1,1},
					   {1,0,0,0,1,1},
					   {1,0,0,0,0,1},
					   {1,1,1,0,0,1},
					   {0,1,1,1,1,0}};
					
			int Q[][]={{0,0,0,0,0,1},
					   {0,0,0,1,1,0},
					   {0,0,0,1,1,0},
					   {0,1,1,0,1,1},
					   {0,1,1,1,0,0},
					   {1,0,0,1,0,0}};  */
		    //case 3
		 	/*int no=3;
			int P[][]={{0,0,1,1,1,1,0},
					   {0,0,0,0,1,0,0},
					   {1,0,0,0,1,1,0},
					   {1,0,0,0,1,1,0},
					   {1,1,1,1,0,0,1},
					   {1,0,1,1,0,0,1},
					   {0,0,0,0,1,1,0}};
					
			int Q[][]={{0,0,0,0,0,0,1},
					   {0,0,1,1,0,1,1},
					   {0,1,0,0,0,1,1},
					   {0,1,0,0,0,1,1},
					   {0,0,0,0,0,1,1},
					   {0,1,1,1,1,0,0},
					   {1,1,1,1,1,0,0}};*/
		    
		    
		        int Father = 0, plen = P.length, qlen = Q.length;
		        int[] Qnew = new int[qlen];
		        int visited[] = new int [plen];
		        System.out.println("Case" +no);
		        DFSisomorphic dfSisomorphic = new DFSisomorphic(Father,plen,qlen,Qnew,P,Q);
		        dfSisomorphic.backtrack(0, visited);
		       // System.out.println();
		        System.out.println("Not isomorphic");
		        
		    }
}
