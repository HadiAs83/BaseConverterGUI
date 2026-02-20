# BaseConverterGUI

یک برنامه **JavaFX** برای تبدیل اعداد بین مبناهای مختلف (Base) از 2 تا 16.  
این برنامه از اعداد منفی و حروف بزرگ/کوچک (`A-F / a-f`) پشتیبانی می‌کند و رابط کاربری فارسی با **راست‌چین** دارد.

---

## ویژگی‌ها

- پشتیبانی از اعداد منفی  
- انتخاب مبنای ورودی و خروجی از **منوی کشویی (ComboBox)** بین 2 تا 16  
- حروف بزرگ و کوچک معتبر (`A-F / a-f`)  
- رابط کاربری فارسی و راست‌چین  
- نمایش قوانین و نکات استفاده در پایین پنجره  
- رنگ‌بندی جذاب و نتیجه واضح  

---

## پیش‌نیازها

- **JDK 21**  
- **JavaFX 21**  

> JavaFX را می‌توانید از [OpenJFX](https://openjfx.io/) دانلود کنید.

---

## مسیرهای پروژه

- مسیر کد: `C:\Users\Hadi Ch\Desktop\BaseConverterGUI\BaseConverterGUI.java`  
- مسیر JavaFX: `C:\javafx-sdk-21.0.10\lib`  
- فایل JAR: `C:\Users\Hadi Ch\Desktop\BaseConverterGUI\BaseConverterGUI.jar`

---

## نحوه کامپایل و اجرا

### ویندوز، مک و لینوکس

#### ۱️⃣ کامپایل کد:

```bash
cd "C:\Users\Hadi Ch\Desktop\BaseConverterGUI"
# ویندوز
javac --module-path "C:\javafx-sdk-21.0.10\lib" --add-modules javafx.controls BaseConverterGUI.java
# مک / لینوکس (مسیر را به سیستم خود تغییر دهید)
# javac --module-path /path/to/javafx-sdk-21/lib --add-modules javafx.controls BaseConverterGUI.java
```


#### اجرای برنامه با کلاس مستقیم:
```bash
# ویندوز
java --module-path "C:\javafx-sdk-21.0.10\lib" --add-modules javafx.controls BaseConverterGUI
# مک / لینوکس
# java --module-path /path/to/javafx-sdk-21/lib --add-modules javafx.controls BaseConverterGUI
```


#### اجرای برنامه با فایل JAR:
```bash
# ویندوز
java --module-path "C:\javafx-sdk-21.0.10\lib" --add-modules javafx.controls -jar BaseConverterGUI.jar
# مک / لینوکس
# java --module-path /path/to/javafx-sdk-21/lib --add-modules javafx.controls -jar BaseConverterGUI.jar
```
