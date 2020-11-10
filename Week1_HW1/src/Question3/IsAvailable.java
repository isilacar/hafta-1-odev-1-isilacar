package Question3;

public class IsAvailable {

    /*
    3- kurucu methodlarda private erişim belirteci ile method oluşturabilir miyiz?
    OIuşturabiliyorsak buna neden ihtiyacımız var.
     */

    /*
    Cevap = Evet oluşturabiliriz. Constructorların amacı o sınıftan bir nesne oluşturmaktır.
    Eğer o sınıfın dışında başka bir yerde nesne oluşturmak istemiyorsak private tanımlayabilirz.
    Böyle birşeyi yapma nedenimiz de,o sınıftan sadece ve sadece tek bir nesne oluşmasını istemek ve
    bu nesneyi bizim kontrol etmek istemimizdir. Mesela bir proje için tek bir database isteyebiliriz.
    Constructorı private yapıp,bu sınıfın içinde public static olarak bir method tanımlayıp,
    o sınıfa dışardan erişim sağlatabiliriz. Constructora ordan erişim sağlayıp,1 defaya mahsus orada
    oluşturulan nesneye ulaşabiliriz. Mesela bir ülkeBaşbakanı diye sınıfımız olabilr. Ülkelerin tek bir
    başbakanı olacağı için bunu private constructor ile yapmamız daha mantıklı olacaktır.
    Ayrıca böyle yapılara Singleton Design Pattern denmektedir.
     */

}
