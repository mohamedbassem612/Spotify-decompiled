package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p2u implements qw40 {
    public final /* synthetic */ q2u a;
    public final /* synthetic */ int b;

    public p2u(q2u q2uVar, int i) {
        this.a = q2uVar;
        this.b = i;
    }

    public final void b() {
        sgz sgzVar = this.a.b;
        String strC = f4i1.c(this.b, "pin_limit_reached_");
        r6h1 r6h1VarA = sgzVar.b.a();
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-your-library-error-dialog";
        x6h1VarI.f = "1.0.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.e = strC;
        y6h1 y6h1VarA = x6h1VarI.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).b = r6h1VarA;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        ((i8h1) sgzVar.a.get()).f(k7h1Var.a(), (Set) null);
    }

    public final void a() {
    }
}
