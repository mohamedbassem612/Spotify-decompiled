package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bvs {
    public final lvc1 a;

    public bvs(lvc1 lvc1Var) {
        this.a = lvc1Var;
    }

    public final ug3 a(ymd0 ymd0Var) {
        a1q a1qVar = (a1q) ((zsq) ((jly0) new a1q(this.a).c).get()).a.b;
        xfx xfxVar = (xfx) ((lvc1) a1qVar.b).b;
        c8o.l(xfxVar);
        egx egxVar = new egx(xfxVar.b, (byte) 1);
        lvc1 lvc1Var = (lvc1) a1qVar.b;
        Context context = (Context) lvc1Var.c;
        c8o.l(context);
        lzn0 lzn0Var = (lzn0) lvc1Var.d;
        c8o.l(lzn0Var);
        return new ug3(egxVar, context, lzn0Var, ymd0Var);
    }
}
