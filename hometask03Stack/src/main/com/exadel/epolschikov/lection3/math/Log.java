package main.com.exadel.epolschikov.lection3.math;



/**
 * Created by ypolshchykau on 27.11.2014.
 *  logarithm operation implementation
 */
public class Log extends BinaryOperation {

    /**
     *
     * @param left
     * @param right is a base for log calculation
     * @return
     */
    public double resultFor(double left, double right) {
//        return left * right;
        return Math.log(left) / Math.log(right);
    }

}
