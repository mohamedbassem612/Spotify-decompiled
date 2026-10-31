package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class onv0 {
    public static final long e;
    public static final bma1 f;
    public static final bma1 g;
    public static final bma1 h;
    public final ut71 a;
    public final Context b;
    public final yqg c;
    public final idd1 d = new idd1(new z6v0(this, (byte) 10));

    static {
        ytw0 ytw0Var = jfv.b;
        e = jfv.h(fdg1.k0(1, ngv.h));
        nbc nbcVar = bma1.b;
        f = nbcVar.q("registration_app_attribution_referrer");
        g = nbcVar.q("registration_app_attribution_referrer_timestamp");
        h = nbcVar.q("registration_install_attribution_referrer");
    }

    public onv0(ut71 ut71Var, Context context, yqg yqgVar) {
        this.a = ut71Var;
        this.b = context;
        this.c = yqgVar;
    }

    public final String a() {
        idd1 idd1Var = this.d;
        long jG = ((dma1) idd1Var.getValue()).g(g, 0L);
        String strE = ((dma1) idd1Var.getValue()).e(f, null);
        return (strE == null || jG + e <= this.c.b()) ? "" : strE;
    }

    public final String b() {
        String strE = ((dma1) this.d.getValue()).e(h, "");
        return strE == null ? "" : strE;
    }
}
