package main.com.exadel.epolschikov.lection3.math;

/**
 * Created by ypolshchykau on 27.11.2014.
 * power operation implementation
 */
public class Power extends BinaryOperation {

    /**
     * @param left
     * @param right
     * @return left ^ right
     * methods returning left^right value
     */
    public double resultFor(double left, double right) {
        return Math.pow(left, right);
    }


}
