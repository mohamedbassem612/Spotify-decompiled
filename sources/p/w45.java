package p;

import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class w45 {
    public static final j380 a;
    public static final j380 b;
    public static final j380 c;

    static {
        h380 h380VarA = j380.a();
        h380VarA.e("es_ES", "es-es");
        h380VarA.e("es_AR", "es-ar");
        h380VarA.e("fr_CA", "fr-ca");
        h380VarA.e("pt_PT", "pt-pt");
        h380VarA.e("zh_HK", "zh-tw");
        h380VarA.e("zh_TW", "zh-tw");
        h380VarA.e("es_MX", "es-mx");
        a = h380VarA.b(true);
        h380 h380VarA2 = j380.a();
        h380VarA2.e("ca", "ca-es");
        h380VarA2.e("es", "es-419");
        h380VarA2.e("pt", "pt-br");
        b = h380VarA2.b(true);
        h380 h380VarA3 = j380.a();
        h380VarA3.e("in", "id");
        h380VarA3.e("ji", "yi");
        h380VarA3.e("iw", "he");
        c = h380VarA3.b(true);
    }

    public static final String a(String str, Locale locale) {
        boolean z;
        String strB = "en";
        String language = locale != null ? locale.getLanguage() : "en";
        language.getClass();
        if (c(language)) {
            z = true;
        } else {
            strB = b(locale);
            z = false;
        }
        if (a.containsValue(strB) || b.containsValue(strB) || locale == null || z || locale.getCountry().length() == 0) {
            return strB;
        }
        if (str.length() == 0) {
            str = "_";
        }
        return f4i1.f(strB, str, locale.getCountry());
    }

    public static final String b(Locale locale) {
        if (locale == null) {
            return "en";
        }
        String string = locale.toString();
        if (string.length() < 2) {
            return "en";
        }
        String str = (String) a.get(string);
        if (str != null) {
            return str;
        }
        String language = locale.getLanguage();
        language.getClass();
        if (c(language)) {
            return "en";
        }
        String str2 = (String) b.get(language);
        if (str2 != null) {
            return str2;
        }
        String str3 = (String) c.get(language);
        return str3 != null ? str3 : language;
    }

    public static boolean c(String str) {
        return str.length() < 2 || u890.q(str.charAt(0), 97) < 0 || u890.q(str.charAt(0), 122) > 0 || u890.q(str.charAt(1), 97) < 0 || u890.q(str.charAt(1), 122) > 0;
    }
}
