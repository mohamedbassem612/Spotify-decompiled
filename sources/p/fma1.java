package p;

import android.content.Context;
import android.content.SharedPreferences;
import java.nio.charset.Charset;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fma1 implements ut71 {
    public static final HashMap d = new HashMap(4);
    public static final yrg0 e = new yrg0((byte) 19);
    public final hfb a;
    public final boolean b;
    public final String c;

    public fma1(hfb hfbVar, boolean z, String str) {
        this.a = hfbVar;
        this.b = z;
        this.c = str;
    }

    @Override // p.ut71
    public final dma1 a(Context context) {
        return d(context, this.c);
    }

    @Override // p.ut71
    public final dma1 b(Context context, String str) {
        lma1 lma1Var;
        if (str.length() <= 0) {
            hhg1.n("Username cannot be empty");
            return null;
        }
        HashMap map = d;
        synchronized (map) {
            try {
                Object sharedPreferences = map.get(str);
                if (sharedPreferences == null) {
                    Context applicationContext = context.getApplicationContext();
                    int i = hu50.a;
                    sharedPreferences = applicationContext.getSharedPreferences("user-".concat(fu50.a.F(str, Charset.defaultCharset()).toString()), 0);
                    map.put(str, sharedPreferences);
                }
                lma1Var = new lma1(new ema1((SharedPreferences) sharedPreferences, (byte) 1), d(context, this.c), this.a, this.b, e);
            } catch (Throwable th) {
                throw th;
            }
        }
        return lma1Var;
    }

    @Override // p.ut71
    public final dma1 c(Context context) {
        return d(context, this.c);
    }

    public final ima1 d(Context context, String str) {
        ima1 ima1Var;
        HashMap map = d;
        synchronized (map) {
            try {
                Object sharedPreferences = map.get(str);
                if (sharedPreferences == null) {
                    sharedPreferences = context.getSharedPreferences(str, 0);
                    map.put(str, sharedPreferences);
                }
                ima1Var = new ima1(new ema1((SharedPreferences) sharedPreferences, (byte) 0), this.a, this.b, e);
            } catch (Throwable th) {
                throw th;
            }
        }
        return ima1Var;
    }
}
