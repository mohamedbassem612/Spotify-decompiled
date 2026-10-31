package p;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fhe0 {
    public static final fhe0 b = d(n8p1.j(new Locale[0]));
    public final ghe0 a;

    public fhe0(ghe0 ghe0Var) {
        this.a = ghe0Var;
    }

    public static fhe0 a(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(strArrSplit[i]);
        }
        return d(n8p1.j(localeArr));
    }

    public static fhe0 d(LocaleList localeList) {
        return new fhe0(new ghe0(localeList));
    }

    public final Locale b(int i) {
        return this.a.a.get(i);
    }

    public final int c() {
        return this.a.a.size();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fhe0) {
            return this.a.equals(((fhe0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a.toString();
    }
}
