package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String fulltext="У лукоморья дуб зелёный;\n" +
                "Златая цепь на дубе том:\n" +
                "И днём и ночью кот учёный\n" +
                "Всё ходит по цепи кругом;\n" +
                "Идёт направо — песнь заводит,\n" +
                "Налево — сказку говорит.\n" +
                "Там чудеса: там леший бродит,\n" +
                "Русалка на ветвях сидит;";
        String[] words=fulltext.split(" ");
        Object[] wordsdistinct=unique(words);
        int i;
        for(Object distword: wordsdistinct)
        {
            i=0;
            for(String oneword: words)
                if(oneword.equals(distword))
                    i++;
            System.out.println("Слово:\"" + distword + "\" встречается "+i+" раз(а)");
        }
    }

    private static Object[] unique(String[] arrayName)
    {
        ArrayList distinct=new ArrayList ();
        for(int i=0; i<arrayName.length;i++ )
        {
            if(!distinct.contains(arrayName[i]))
                distinct.add(arrayName[i]);
        }
        return distinct.toArray();
    }
}


