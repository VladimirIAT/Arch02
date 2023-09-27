package Fabric;

import Interface.iGameItem;
import Product.WoodReward;

public class WoodGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new WoodReward();
    }    
}
