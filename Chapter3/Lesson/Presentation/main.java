
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.NumberFormat;
//https://www.kaggle.com/datasets/prajwaldongre/quantum-circuit-fault-logs-100k-nisq-simulations?select=NISQ-FaultLogs-100K.csv
public class main{
    public static void main(String[] args)throws FileNotFoundException{
        File dataFile = new File(""); // need file
        Scanner fileScan = new Scanner(dataFile);
        
        int count = 0;
        String circuit_id = null;
        int qubit_count = 0;
        int gate_depth = 0;
        String gate_type = null;
        double error_rate_gate = 0.0;
        double t1_time = 0.0;
        double t2_time = 0.0;
        double readout_error = 0.0;
        int shot = 0;
        int bitstring = 0;
        
        
        System.out.println("=== Simulation circuit condition ===");
    }
}
