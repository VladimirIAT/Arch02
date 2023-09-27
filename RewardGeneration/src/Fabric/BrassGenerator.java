package Fabric;

import Interface.iGameItem;
import Product.BrassReward;

public class BrassGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new BrassReward();
    }   
}
