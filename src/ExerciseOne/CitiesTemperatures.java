package ExerciseOne;

public class CitiesTemperatures {

    public static void main (String[] args) {
        int[][] tempMatrix = {{-2, 33},{-3, 32},{-8, 27},{4, 37},{6, 42},{5, 43},{0, 39},{-7, 26},{-1, 31},{-10, 35}};
        String[] citiesArray = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción", "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
        int iLow = 0;
        int iHigh = 0;
        int lowestTemp = tempMatrix[0][0];
        int highestTemp = tempMatrix[0][1];

        for (int i = 0; i < tempMatrix.length; i++) {
            if(tempMatrix[i][0] < lowestTemp) {
                lowestTemp = tempMatrix[i][0];
                iLow = i;
            }
            if(tempMatrix[i][1] > highestTemp) {
                highestTemp = tempMatrix[i][1];
                iHigh = i;
            }
        }
        System.out.println("The highest temperature was of " + highestTemp + " and it was registered in: " + citiesArray[iHigh] + ".");
        System.out.println("The lowest temperature was of " + lowestTemp + " and it was registered in: " + citiesArray[iLow] + ".");
    }
}
