package com.ntech.practicecollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionFeatures {
    /**
     *         👉 1. Collections.nCopies()
     *         👉 2. Collections.frequency()
     *         👉 3. Collections.disjoint()
     *         👉 4. Collections.singleton()
     *         👉 5. Collections.rotate()
     */

        public static void main(String[] args) {

            List<String> numberOfCopies = Collections.nCopies(3, "Ntech");
            System.out.println("Number of copies: " + numberOfCopies );
            List<String> lines = new ArrayList<String>();
            lines.add("straight");
            lines.add("curved");
            lines.add("circle");
            List<List<String>> listsOfCopies = Collections.nCopies(3, lines);
            System.out.println(listsOfCopies);

        }

}
