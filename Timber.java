/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_system;

import java.util.*;

/**
 *
 * @author Muhammad Ismail
 */
 class Timber {
    char zone;
    int timberID;
    String kind;
    float weight;
    float height;
    int quantity;
    int price;

    Timber(char zone, int timberID, String kind, float weight, float height, int quantity, int price) {
        this.zone = zone;
        this.timberID = timberID;
        this.kind = kind;
        this.weight = weight;
        this.height = height;
        this.quantity = quantity;
        this.price = price;
    }


}


