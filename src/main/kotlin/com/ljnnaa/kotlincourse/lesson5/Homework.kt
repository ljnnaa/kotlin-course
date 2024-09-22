package com.ljnnaa.kotlincourse.lesson5

fun main () {
    /*Простой уровень
     1. (14 - 4 <= 10) || (6 / 2 != 3)
     true || false = true
     2. (9 + 1 == 10) && (8 % 2 == 0)
     true && true = true
     3. (7 - 2 < 5) || (4 * 3 != 12)
     false || false = false
     4. (18 / 6 >= 3) && (5 + 5 == 10)
     true && true = true
     5. (11 % 3 != 2) || (9 - 3 == 6)
     false || true = true
     6. (5 * 2 < 11) && (14 / 2 == 7)
     true && true = true
     7. (8 + 2 <= 10) || (7 % 2 != 1)
     true || false = true
     8. (16 / 4 > 3) && (3 + 4 == 7)
     true && true = true
     9. (10 % 2 == 0) || (5 - 3 != 1)
     true || true = true


     Сложный уровень
     1. ((4 * 3) < 13) && !(8 / 4 == 2) || (10 % 3 != 1)
     true && false || false = false
     2. ((14 - 5) > 8) || (9 / 3 == 3) && !(7 + 0 != 7)
     true || true && true = true
     3. ((2 + 3) <= 5) && (16 / 4 == 4) || !(6 % 2 == 0)
     true && true || false = true
     4. ((5 * 3) != 15) && !(10 / 2 > 4) || (4 + 4 == 8)
     false && false || true = true
     5. ((12 / 4) >= 3) || (7 % 2 != 1) && !(3 + 3 == 6)
     true || false && true = true


     Продвинутый уровень
     1. (var f = 6; --f >= 5) || ((3 * 2 == 6) && (9 - 4 != 5))
     true || true && false = true
     2. ((var g = 0; g++ != 0) && (4 + 2 == 6)) || (5 / 1 == 5)
     false && true || true = true
     3. (var h = 7; h-- > 6) || (8 + 1 == 9) && (3 % 2 != 1)
     true || true && false = true
     4. ((var i = 5; i++ == 5) || (2 * 2 != 4)) && (10 / 2 == 5)
     true || false && true = true
     5. (var j = 4; j-- < 4) && ((6 + 0 == 6) || (5 % 2 != 1))
     false && true || false = false

      */

    /*Задача 1
    Рассчитать предполагаемую интенсивность звука после затухания.
    Интенсивность звука после затухания пропорциональна начальной интенсивности, умноженной на коэффициент затухания.
    Если коэффициент затухания неизвестен, использовать стандартное значение 0.5.
    */

    fun soundIntensity (coefficient: Double?, intensity: Double): Double {
        return intensity * (coefficient ?: 0.5)
    }

    /*Задача 2
    Клиент оплачивает доставку груза. К стоимости доставки добавляется страховка на груз, которая составляет 0,5% от его стоимости.
    В случае, если стоимость не указана, то берётся стандартная стоимость в $50
    Задача: Рассчитать полную стоимость доставки.
     */

    fun shippingCost (delivery: Double, itemPrice: Double?): Double {
        val insurance: Double = (itemPrice ?: 50) as Double / 200
        return delivery + insurance
    }

    /*Задача 3
    Вы проводите метеорологические измерения.
    Одним из важных показателей является атмосферное давление, которое должно быть зафиксировано.
    Лаборант приносит вам набор показателей, но по пути может что-нибудь потерять.
    Задача - сообщить об ошибке в случае отсутствия показаний атмосферного давления.
     */

    fun measurements (atmPressure: Double?, indikator1: Double, indikator2: Double): Double {
        return atmPressure ?: throw IllegalArgumentException("Нет значения атмосферного давления")
    }
}





