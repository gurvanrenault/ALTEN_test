package fr.alten.products.application.utils;


import fr.alten.products.application.dto.ProductDTO;
import io.micrometer.common.util.StringUtils;

public class ProductVerificator {

    public static boolean checkProduct(ProductDTO p) {
        boolean ret = true;
        if (StringUtils.isEmpty(p.getCode())){
            ret=false;
        }
        if (StringUtils.isEmpty(p.getName())){
            ret=false;
        }
        if (StringUtils.isEmpty(p.getDescription())){
            ret=false;
        }
        if (p.getPrice()<0){
            ret=false;
        }
        if (p.getQuantity()<0){
            ret=false;
        }
        if (StringUtils.isEmpty(p.getInventoryStatus())){
            ret=false;
        }
        return ret;
    }
}
