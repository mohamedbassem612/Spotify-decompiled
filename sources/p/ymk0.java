package p;

import android.content.Context;
import j$.time.Instant;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ymk0 {
    public final yqg a;
    public final dma1 b;

    public ymk0(Context context, yqg yqgVar, ut71 ut71Var, String str) {
        this.a = yqgVar;
        this.b = ut71Var.b(context.getApplicationContext(), str);
    }

    public static bma1 c(tm81 tm81Var, String str) {
        return bma1.b.n(gvg.h("signalling_", tm81Var.a, "_", str));
    }

    public xmk0 a(int i) {
        bma1 bma1Var = zmk0.a;
        ima1 ima1Var = this.b;
        if (!ima1Var.n(bma1Var) || ima1Var.l(zmk0.b, 0) != i) {
            return null;
        }
        long jG = ima1Var.g(bma1Var, 0L);
        long jB = this.a.b() - jG;
        long millis = TimeUnit.DAYS.toMillis(i);
        if (jB < 0 || jB >= millis) {
            return null;
        }
        int iL = ima1Var.l(zmk0.c, 0);
        bma1 bma1Var2 = zmk0.d;
        Set set = w7x.a;
        Set setB = ima1Var.b(bma1Var2, set);
        if (setB != null) {
            set = setB;
        }
        return new xmk0(iL, jG, set);
    }

    public Instant b(tm81 tm81Var) {
        long jG = this.b.g(c(tm81Var, "first_impression"), 0L);
        Long lValueOf = Long.valueOf(jG);
        if (jG == 0) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            return Instant.ofEpochMilli(lValueOf.longValue());
        }
        return null;
    }

    public ymk0(yqg yqgVar, dma1 dma1Var) {
        this.b = dma1Var;
        this.a = yqgVar;
    }
}
