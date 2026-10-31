package p;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ard1 {
    public static final Set d = Collections.singleton(c3h1.b);
    public final bcl1 a;
    public final b2r0 b;
    public final i8h1 c;

    public ard1(bcl1 bcl1Var, b2r0 b2r0Var, i8h1 i8h1Var) {
        this.a = bcl1Var;
        this.b = b2r0Var;
        this.c = i8h1Var;
    }

    public final c4m0 a(xhm1 xhm1Var) {
        return new c4m0(bcl1.b(this.a, xhm1Var.b, xhm1Var.a), (byte) 1);
    }

    public final void b(xhm1 xhm1Var, zqd1 zqd1Var, int i, String str, int i2) {
        c4m0 c4m0VarA = a(xhm1Var);
        int iZ = l0p1.z(zqd1Var);
        int iY = l0p1.y(i2);
        Integer numValueOf = Integer.valueOf(i);
        x6h1 x6h1VarC = c4m0VarA.c.c();
        x6h1VarC.i.add(new a7h1("tappable_entity", z3m0.f(iZ), numValueOf, str, z3m0.g(iY)));
        x6h1VarC.j = true;
        this.c.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("play_preview", 1, Collections.singletonMap("item_to_be_previewed", str == null ? "" : str)), x6h1VarC.a(), c4m0VarA.b, System.currentTimeMillis()), (xj61) null);
    }

    public final t480 c(xhm1 xhm1Var, zqd1 zqd1Var, int i, String str, int i2) {
        c4m0 c4m0VarA = a(xhm1Var);
        int iZ = l0p1.z(zqd1Var);
        int iY = l0p1.y(i2);
        Integer numValueOf = Integer.valueOf(i);
        x6h1 x6h1VarC = c4m0VarA.c.c();
        x6h1VarC.i.add(new a7h1("tappable_entity", z3m0.f(iZ), numValueOf, str, z3m0.g(iY)));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).b = c4m0VarA.b;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        return this.b.p(k7h1Var.a(), d);
    }

    public final void d(t480 t480Var) {
        if (t480Var != null) {
            this.b.o(t480Var, d);
        }
    }
}
