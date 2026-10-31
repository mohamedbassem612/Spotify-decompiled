package p;

import android.content.Context;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rgc0 {
    public static final bma1 f;
    public final yqg a;
    public final Context b;
    public final dma1 c;
    public final kly0 d;
    public Set e;

    static {
        new q3c();
        f = bma1.b.q("limited_experience_indicator_key");
    }

    public rgc0(yqg yqgVar, Context context, dma1 dma1Var, thq thqVar) {
        this.a = yqgVar;
        this.b = context;
        this.c = dma1Var;
        this.d = thqVar;
        bma1 bma1Var = f;
        Set set = w7x.a;
        Set setB = dma1Var.b(bma1Var, set);
        this.e = setB != null ? setB : set;
    }

    public final boolean a(bma1 bma1Var) {
        long jG = this.c.g(bma1Var, -1L);
        Long lValueOf = Long.valueOf(jG);
        if (jG == -1) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            return this.a.b() - lValueOf.longValue() < ((Number) this.d.get()).longValue() * 60000;
        }
        return false;
    }
}
