public class Main {
    public static void main(String[] args) {
        String [] array = {"Мистер и миссис Дурсль проживали в доме номер четыре по Тисовой улице",
                " и всегда с гордостью заявляли,",
                " что они, слава богу, абсолютно нормальные люди. ",
                " и всегда с гордостью заявляли,",
                " Уж от кого-кого, а от них никак нельзя было ожидать, ",
                "чтобы они попали в какую-нибудь странную или загадочную ситуацию. ",
                " Уж от кого-кого, а от них никак нельзя было ожидать, ",
                " что они, слава богу, абсолютно нормальные люди. ",
                "Мистер и миссис Дурсль проживали в доме номер четыре по Тисовой улице",
                " и всегда с гордостью заявляли,"};

        for(int i = array.length - 1; i>=0; i--) {
            System.out.println("Зашли в первый цикл " + i);
            for (int j = 0; j < array.length && j<i; j++){
                System.out.println("Зашли во второй цикл " + j);
                    if (array[i].equals(array[j])) {
                        System.out.println("Зашли в условие");
                        array[i]="";
                    }
            }
        }

       for(int i = 0; i< array.length;i++){
            System.out.println(array[i]);
        }

        String finalString = array[0];
        for(int i = 1; i< array.length;i++) {
            finalString+=array[i];
        }
        System.out.println(finalString);


    }

}