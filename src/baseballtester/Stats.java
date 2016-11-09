/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseballtester;

/**
 *
 * @author mukaz1657
 */
public class Stats extends BaseballTeam {

    public int overallPoints(int overallPoints){
        //overallPoints 
        gamesWon = gamesWon *2;
        overallPoints = gamesWon + gamesTied;
        return overallPoints;
    }
}
