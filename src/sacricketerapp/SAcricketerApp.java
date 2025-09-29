
package sacricketerapp;

/**
 *
 * @author RC_Student_Lab
 */
public class SAcricketerApp {
    public static void main(String[] args) {
  
        String [] names = {"Jacques Kallis", "Hashim Amla", "AB De Villiers"};
        String [] stadiums = {"Kingsmead", "St Georges", "Wanderers"};
        int [][] runs = {
            {5000, 3800, 4200}, //Kingsmead
            {3500, 3700, 3900}, //St Georges
            {6200, 5000, 5200}, //Wanderers
        };
        
        int[] namesTotals = new int[names.length];
        int[] stadiumsTotals = new int[stadiums.length];
        
for(int i=0; i< stadiums.length;i++){
    for(int j=0; j< names.length;j++){
        stadiumsTotals[i]+= runs[i][j];
        namesTotals[j]+= runs[i][j];
    }
}   

//Display Report
System.out.println("===Runs Report===");
for(int i=0; i< stadiums.length;i++){
    System.out.println("\nstadiums: "+stadiums[i]);
    for(int j=0; j< names.length;j++){
        System.out.println(" "+ names[j]+ ":"+ runs[i][j]);
    }
    System.out.println(" Total runs at " + stadiums[i]+ ":" + stadiumsTotals[i]);
    }
//Highest runs per stadium
System.out.println("\n===Highest Runs Per Stadium===");
for(int i=0; i< stadiums.length;i++){
    int maxRuns = runs[i][0];
    String topnames = names[0];
    
    for (int j = 1; j< names.length;j++){
        if(runs[i][j]> maxRuns){
            maxRuns = runs[i][j];
            topnames = names[j];
        }
    }
    System.out.println(stadiums[i]+ ": " + topnames + "with "+maxRuns);
}
//Total Runs By Each name
System.out.println("\n===Total Runs By Each names===");
for(int j=0;j< names.length;j++){
    System.out.println(names[j]+ ":"+namesTotals[j]);
}
    }
    
}
