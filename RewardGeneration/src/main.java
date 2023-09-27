import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Fabric.BrassGenerator;
import Fabric.BronseGenerator;
import Fabric.GemGenerator;
import Fabric.GoldGenerator;
import Fabric.IronGenerator;
import Fabric.ItemGenerator;
import Fabric.SilverGenerator;
import Fabric.TinGenerator;
import Fabric.WoodGenerator;

public class main {
    public static void main(String[] args) {

        ItemGenerator f1 = new GemGenerator();
        f1.openReward();
        ItemGenerator f2 = new GoldGenerator();
        f2.openReward();
        ItemGenerator f3 = new SilverGenerator();
        f3.openReward();
        ItemGenerator f4 = new BronseGenerator();
        f4.openReward();
        ItemGenerator f5 = new WoodGenerator();
        f5.openReward();
        ItemGenerator f6 = new TinGenerator();
        f6.openReward();
        ItemGenerator f7 = new BrassGenerator();
        f7.openReward();
        ItemGenerator f8 = new IronGenerator();
        f8.openReward();

        List<ItemGenerator> itemGeneratorList = new ArrayList<>();

        itemGeneratorList.add(f1);
        itemGeneratorList.add(f2);
        itemGeneratorList.add(f3);

        System.out.println("-------------------");

        Random random = ThreadLocalRandom.current();
        int gemCounter = 0;
        int goldCounter = 0;
        int silverCounter = 0;
       

        for (int i = 0; i < 10; i++) {
            int b = 2;
            int a = random.nextInt(3);
//            System.out.println(a);
            if (a == 0) {
                if (gemCounter < 1) {
                    gemCounter++;
                    b = 0;
                } 
            } else {
                if (a == 1) {
                    if (goldCounter < 3) {
                        goldCounter++;
                        b = 1;
                    }
                } else {
                    silverCounter++;
                    b = 2;
                }
            }
            itemGeneratorList.get(b).openReward();
        }
    }
}
