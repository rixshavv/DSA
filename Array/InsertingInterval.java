import java.util.ArrayList;

public class InsertingInterval {
    public int[][] insert(int[][] interval,int[] newinterval){
        ArrayList<int[]> res=new ArrayList<>();
        int i=0;
        int n=interval.length;

        //Adding intervals before merging case
        while(i<n&&interval[i][1]<newinterval[0]){
            res.add(interval[i]);
            i++;
        }

        //Merging condition
        while(i<n&&newinterval[1]>=interval[i][0]){
            newinterval[0]=Math.min(newinterval[0],interval[i][0]);
            newinterval[1]=Math.max(newinterval[1],interval[i][1]);
            i++;
        }
        res.add(newinterval);

        //Adding all the remaining cases

        while(i<n){
            res.add(interval[i]);
            i++;
        }

        return res.toArray(new int[res.size()][2]);
    }


public static void main(String[] args) {
    InsertingInterval obj = new InsertingInterval();

    int[][] intervals = {
        {1, 3},
        {6, 9}
    };
    int[] newInterval = {2, 5};

    int[][] result = obj.insert(intervals, newInterval);

    // Print the result
    for (int[] interval : result) {
        System.out.print("[" + interval[0] + ", " + interval[1] + "] ");
    }
}

    
}
