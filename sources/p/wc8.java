package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wc8 implements hp8 {
    public final d0r a;
    public final to8 b;
    public final Context c;
    public final meq d;
    public final kc8 e;
    public final o3r f = w3p1.o(new l4r(hvm.c, 2, oc8.h, new j4r(oc8.f), oc8.i), oc8.g);

    public wc8(d0r d0rVar, to8 to8Var, Context context, meq meqVar, kc8 kc8Var) {
        this.a = d0rVar;
        this.b = to8Var;
        this.c = context;
        this.d = meqVar;
        this.e = kc8Var;
    }

    @Override // p.hp8
    public final void a(dnc0 dnc0Var, int i) {
        Integer numValueOf = Integer.valueOf(i);
        r6h1 r6h1Var = r6h1.c;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-audiobook-series-section";
        x6h1VarI.f = "1.0.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.c = numValueOf;
        y6h1 y6h1VarA = x6h1VarI.a();
        dnc0Var.b(new gj50(new uc8(this, (byte) 0), false), new oo6(this.d.a(this.a), this, y6h1VarA, (byte) 5));
    }
}
