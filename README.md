# Activitylerin çalışma prensibi

Activity sınıfı altı callback’lerden oluşan temel bir set sağlar: onCreate(), onStart(), onResume(), onPause(), onStop() ve onDestroy().
Lifecycle Callbacks:

onCreate(): Activity ilk başladığında çağrılır bu yüzden activity yaşam döngüsü boyunca sadece bir kez çağrılmış olur. Activity’nin ne zaman oluşturulduğunu ve başlatıldığını gösterir. Kısaca, ekinlik oluşturulduğunda çağrılır ve etkinliğin başlatma işlemlerini gerçekleştirir.

onStart(): Uygulamamızı açtığımızda onCreate() methodundan sonra çalışan methodtur. Burası kullanıcın gördüğü UI’ ı başlatıldığı gösterildiği yerdir. Kullanıcı activity’den uzaklaşırken veya geri geldiğinde birden çok kez çağrılabilir. Bu method devamında onResume() methoduna yerini bırakır.

onResume(): Bu metod, uygulama kapatılmadığı sürece devam eden bir süreci temsil eder. Eğer uygulamada akışı değiştiren bir olay gerçekleşirse, onPause() metodu devreye girer. Sistem tekrar eski durumuna döndüğünde ise onResume() metodu çağrılır. Kısacası, kullanıcı activity’e odaklandığında ve onunla etkileşim halinde olduğunda çağrılır.

onPause(): Sistem uygulamanın arkaplana atıldığını veya başka bir olayın gerçekleştiğini bildirdiğinde çalışır. onResume() methodunda olduğu gibi uygulama kesintiye uğradığında oluşur. Örneğin, geri veya home tuşuna basıldığında ya da bir dialog(çağrı) düştüğünden. Ayrıca uygulama üzerinde bir uyarı penceresi veya dialog açıldığında uygulama duraklatılmış ve kesintiye uğramış gibi görünse de onPause() methodunda belirtilen işlemler gerçekleştirilir. Sistem uygulama arkaplandan silindiğinde veya başka bir durumda onStop() methodunu çağırır.

onStop(): Kullanıcı çıkış yaptığında bu kodlar çalışır. İşlemleri kapatmak için kullanabiliriz. Bu method, kullanıcının haberi olmadan gereksiz CPU işlemlerini sonlandırarak kullanıcı dostu bir deneyim sunar. Kullanıcı etkileşimi tamamen sona erdiğinde onDestory() methodu çalışır.

onRestart(): Bir aktivite durdurulduktan sonra kendini yeniden başlattığında sistem onRestart() metodunu çağırır. onRestart() metodu, durdurulduğu zamandan itibaren aktivite durumunu geri yükler. Android etkinliğindeki onRestart() callback metodunu her zaman onStart() ve ardından onResume() metodu izleyecektir.

onDestroy(): Activity yok edilmeden önce çağrılan kısımdır. Kullanıcı ile uygulama arasında bir bağlantı kalmamıştır. Arka planın temizlenmesi için çağrılan metottur.


<img width="513" height="663" alt="activity_lifecycle" src="https://github.com/user-attachments/assets/2eb93ff9-df80-45ba-bfcf-829a4512f417" />

