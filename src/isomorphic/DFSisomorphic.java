package isomorphic;

import java.text.spi.NumberFormatProvider;
import java.util.ArrayList;

public class DFSisomorphic {

    private int Father, plen, qlen;
    private int[] Qnew;
    private int P[][], Q[][];
    private ArrayList<int []> DFSList;
    
    
    public DFSisomorphic(int father, int plen, int qlen, int[] qnew, int[][] P,int[][] Q) {//
        this.Father = father;
        this.plen = plen;
        this.qlen = qlen;
        this.Qnew = qnew;
        this.P = P;
        this.Q = Q;
        this.DFSList = getNum();
        
    }
				
    public ArrayList<int []> getNum(){
    	ArrayList<int []> result = new ArrayList<int []>();
    	int i,j,k;
    	int rowNum=0;
		int NumP[] = new int[plen];
		int NumQ[] = new int[qlen];
		for (i=0;i<plen;i++){
			for(j=0;j<qlen;j++){
				if (P[i][j] == 1){
					rowNum=rowNum+1;
				}
			}
			
		NumP[i]=rowNum;
		rowNum=0;
		}
		for (i=0;i<plen;i++){
			for(j=0;j<qlen;j++){
				if (Q[i][j] == 1){
					rowNum=rowNum+1;
				}
			}
		NumQ[i]=rowNum;
		rowNum=0;
		}
		result.add(NumP);
		result.add(NumQ);
		return result;
    }
		
	public void backtrack(int i, int [] visited){
		int j;
		int [] NumP = DFSList.get(0);
		int [] NumQ = DFSList.get(1);
		

		if(i<this.plen)
			{
			
			for(j=0;j<plen;j++){
				if(NumP[i]==NumQ[j] && visited[j]!=1){
					Qnew[i]=j; 
					visited[j]=1;
					backtrack(i+1, visited);
					Qnew[i]=0;
					visited[j]=0;
				}
			}
			
		}
		else{
			int flag=1;
			for(i=0;i<plen;i++){
				for(j=0;j<plen;j++){
					if(Q[(Qnew[i])][(Qnew[j])]!=P[i][j]){
						flag=0;
					}
				}
			}
			if (flag==1){
				System.out.println("Is isomorhpic");
				System.out.println("Ordering of vertices");
				for (i=0;i<plen;i++){
					System.out.print(Qnew[i]+ "-->");
				}
				System.exit(0);
			}
		}
	}
}
