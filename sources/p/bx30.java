package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bx30 implements l4h1 {
    public final zw30 a;
    public final xfx b;
    public final acq c;
    public final cgr0 d;
    public final ur41 e;
    public final cir0 f;
    public final pe g;
    public final ti31 h;
    public final kj31 i;
    public final wen0 j;
    public final b35 k;
    public final boolean l;
    public final q7r0 m;
    public final mbm1 n;

    public bx30(zw30 zw30Var, xfx xfxVar, acq acqVar, cgr0 cgr0Var, ur41 ur41Var, cir0 cir0Var, pe peVar, ti31 ti31Var, kj31 kj31Var, wen0 wen0Var, b35 b35Var, boolean z, q7r0 q7r0Var, mbm1 mbm1Var, uo11 uo11Var) {
        this.a = zw30Var;
        this.b = xfxVar;
        this.c = acqVar;
        this.d = cgr0Var;
        this.e = ur41Var;
        this.f = cir0Var;
        this.g = peVar;
        this.h = ti31Var;
        this.i = kj31Var;
        this.j = wen0Var;
        this.k = b35Var;
        this.l = z;
        this.m = q7r0Var;
        this.n = mbm1Var;
    }

    @Override // p.l4h1
    public final f4h1 a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, Object obj) {
        iw30 iw30Var = (iw30) obj;
        cir0 cir0Var = this.f;
        cir0Var.h().a(iwe.e, new wj1(iw30Var, (byte) 20));
        String str = this.a.a;
        kdn0 kdn0Var = iw30Var.i;
        pe peVar = this.g;
        boolean zB = peVar.b(5);
        aod aodVarA = jyo1.a(this.h, this.i);
        b35 b35Var = this.k;
        return new ax30(new hw30(str, context, new u830(iw30Var, (byte) 14), this.b, this.c, this.e, kdn0Var, this.d, bundle, this.j, peVar, aodVarA, b6p1.p(b35Var.h()), zB, b35Var, this.l, b35Var.e() ? (l3h1) this.m.b(l3h1.class) : null, this.n), cir0Var);
    }
}
