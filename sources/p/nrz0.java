package p;

import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class nrz0 {
    public final sks0 a;
    public volatile Object b;

    public nrz0(sks0 sks0Var) {
        this.a = sks0Var;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.b;
        if (obj2 != null) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.b;
                if (obj == null) {
                    obj = new Object();
                    this.b = obj;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final String toString() {
        double d;
        Locale locale = Locale.ROOT;
        synchronized (a()) {
            d = 1000000.0d / ((eq91) this).e;
        }
        return String.format(locale, "RateLimiter[stableRate=%3.1fqps]", Double.valueOf(d));
    }
}
