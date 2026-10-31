package p;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tjz {
    public static final Set d = Collections.singleton(c3h1.b);
    public final bcl1 a;
    public final b2r0 b;
    public final i8h1 c;

    public tjz(bcl1 bcl1Var, b2r0 b2r0Var, i8h1 i8h1Var) {
        this.a = bcl1Var;
        this.b = b2r0Var;
        this.c = i8h1Var;
    }

    public final void a(xhm1 xhm1Var, sjz sjzVar) {
        r6h1 r6h1VarB = bcl1.b(this.a, xhm1Var.b, xhm1Var.a);
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-wrapped-watch-feed-story";
        x6h1VarI.f = "2.2.0";
        x6h1VarI.g = "22.0.0";
        y6h1 y6h1VarA = x6h1VarI.a();
        int iT = ezn1.t(sjzVar);
        x6h1 x6h1VarC = y6h1VarA.c();
        x6h1VarC.i.add(new a7h1("error_state", (String) null, (Integer) null, (String) null, z3m0.c(iT)));
        x6h1VarC.j = true;
        y6h1 y6h1VarA2 = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        this.c.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), y6h1VarA2, r6h1VarB, System.currentTimeMillis()), (xj61) null);
    }

    public final t480 b(xhm1 xhm1Var, sjz sjzVar) {
        r6h1 r6h1VarB = bcl1.b(this.a, xhm1Var.b, xhm1Var.a);
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-wrapped-watch-feed-story";
        x6h1VarI.f = "2.2.0";
        x6h1VarI.g = "22.0.0";
        y6h1 y6h1VarA = x6h1VarI.a();
        int iT = ezn1.t(sjzVar);
        x6h1 x6h1VarC = y6h1VarA.c();
        x6h1VarC.i.add(new a7h1("error_state", (String) null, (Integer) null, (String) null, z3m0.c(iT)));
        x6h1VarC.j = true;
        y6h1 y6h1VarA2 = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA2;
        ((xjn) k7h1Var).b = r6h1VarB;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        return this.b.p(k7h1Var.a(), d);
    }
}
