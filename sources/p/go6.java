package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class go6 implements i8l {
    public final /* synthetic */ byte a = 0;
    public final xfx b;
    public final gw70 c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public go6(em3 em3Var, xfx xfxVar, qfl1 qfl1Var, gw70 gw70Var, q7r0 q7r0Var, bnr bnrVar, ggr ggrVar) {
        this.d = em3Var;
        this.b = xfxVar;
        this.e = qfl1Var;
        this.c = gw70Var;
        this.f = q7r0Var;
        this.g = bnrVar;
        this.h = ggrVar;
    }

    public final h8l a(Context context, Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        byte b = this.a;
        Object obj = this.h;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                return new co6(this.b, (qfl1) obj4, (em3) obj5, this.c, layoutInflater, (q7r0) obj3, (bnr) obj2, (ggr) obj);
            default:
                return new ljk(this.b, this.c, layoutInflater, (ga00) obj5, (rxk0) obj4, (cfd) obj3, (i7d) obj2, (yqg) obj);
        }
    }

    public go6(xfx xfxVar, gw70 gw70Var, ga00 ga00Var, rxk0 rxk0Var, cfd cfdVar, qfl1 qfl1Var, i7d i7dVar, yqg yqgVar) {
        this.b = xfxVar;
        this.c = gw70Var;
        this.d = ga00Var;
        this.e = rxk0Var;
        this.f = cfdVar;
        this.g = i7dVar;
        this.h = yqgVar;
    }
}
