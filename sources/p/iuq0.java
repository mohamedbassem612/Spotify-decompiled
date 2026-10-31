package p;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class iuq0 implements g3e {
    public final kly0 a;

    public iuq0(a8p a8pVar) {
        this.a = a8pVar;
    }

    public final n3l a() {
        String str = Build.MANUFACTURER;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        String lowerCase2 = Build.BRAND.toLowerCase(locale);
        int i = Build.VERSION.SDK_INT;
        boolean zEquals = lowerCase.equals("lge");
        n3l n3lVar = n3l.OFF;
        if (zEquals || lowerCase2.equals("lge") || lowerCase.equals("huawei") || lowerCase2.equals("huawei") || i < 34 || ((lowerCase.equals("samsung") || lowerCase2.equals("samsung")) && i < 36)) {
            return n3lVar;
        }
        kly0 kly0Var = this.a;
        return (((n3l) kly0Var.get()) != n3l.GOS_SE || i >= 36) ? (n3l) kly0Var.get() : n3l.GOS;
    }

    public final boolean b() {
        return a() != n3l.OFF;
    }

    public final boolean c() {
        return a() == n3l.GOS_SE;
    }
}
