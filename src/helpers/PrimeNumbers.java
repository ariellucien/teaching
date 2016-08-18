/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * @author administrador1
 */
public class PrimeNumbers {
    public Boolean isPrime(Integer num)
    {
        for (int i = 2; i < (num/2); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
