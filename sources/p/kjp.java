package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kjp {
    public final /* synthetic */ chp a;

    public kjp(chp chpVar) {
        this.a = chpVar;
    }

    public final gc60 a() {
        g1i g1iVar = (g1i) this.a.c;
        Context context = (Context) ((yb60) g1iVar.b).a.get();
        c8o.l(context);
        xh71 xh71Var = (xh71) ((yb60) g1iVar.b).e.get();
        c8o.l(xh71Var);
        xf60 xf60Var = new xf60(xh71Var);
        luk lukVar = (luk) ((yb60) g1iVar.b).f.get();
        c8o.l(lukVar);
        return new gc60(context, xf60Var, new u25(lukVar).a());
    }
}
