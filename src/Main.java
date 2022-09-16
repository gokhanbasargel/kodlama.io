public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("Senior yazılım Geliştirici yetiştirme kampı.",".NET 6 üzerinde, clean architecture, CQRS, event güdümlü geliştirme, birim testleri, code first geliştirme, docker ve çok daha fazlasını içeren 2 aylık ileri bir kamp sizi bekliyor. Yine ücretsiz.","2 mounths","Engin Demiroğ");

        Course course2 = new Course("(2022) Yazılım Geliştirici Yetiştirme Kampı - JAVA","Gerçek hayatla ilişkilendirilmiş programlamaya giriş","2 mounths","Engin Demiroğ");

        Course course3 = new Course("Yazılım Geliştirici Yetiştirme Kampı (JavaScript)","Programlamayı gerçek hayatla ilişkilendirme","1.5 mouths","Engin Demiroğ");


        Course[] courses ={course1,course2,course3};

        for (Course course: courses
             ) {
            System.out.println(course.name);


    }

}
}