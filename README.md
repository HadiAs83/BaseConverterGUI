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

- **JDK 17 یا بالاتر**  
- **JavaFX 21** (مستقل از JDK)  

> JavaFX را می‌توانید از [OpenJFX](https://openjfx.io/) دانلود کنید.

---

## مسیرهای احتمالی

- مسیر کد: `path/to/your/project/BaseConverterGUI.java`  
- مسیر JavaFX: `path/to/javafx-sdk-21/lib`

> مسیرها را با مسیر واقعی سیستم خودتان جایگزین کنید.

---

## نحوه کامپایل و اجرا

### ویندوز، مک و لینوکس

#### کامپایل:

```bash
cd /path/to/your/project
# ویندوز
javac --module-path "path/to/javafx-sdk-21/lib" --add-modules javafx.controls BaseConverterGUI.java
# مک / لینوکس
# javac --module-path /path/to/javafx-sdk-21/lib --add-modules javafx.controls BaseConverterGUI.java


# ویندوز
java --module-path "path/to/javafx-sdk-21/lib" --add-modules javafx.controls BaseConverterGUI
# مک / لینوکس
# java --module-path /path/to/javafx-sdk-21/lib --add-modules javafx.controls BaseConverterGUI