package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uur0 {
    public final w0g a;
    public final a1g b;
    public final iwe0 c;
    public final pbk1 d;
    public final dwr0 e;
    public volatile boolean f;

    public uur0(w0g w0gVar, a1g a1gVar, iwe0 iwe0Var, pbk1 pbk1Var, dwr0 dwr0Var) {
        this.a = w0gVar;
        this.b = a1gVar;
        this.c = iwe0Var;
        this.d = pbk1Var;
        this.e = dwr0Var;
    }

    public static m441 a(uur0 uur0Var, Context context) {
        return new m441(new k1e0(uur0Var, context, (lnm) null, (byte) 19));
    }

    public final void b() {
        this.f = true;
    }
}
