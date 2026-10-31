package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ber {
    public final i8h1 a;
    public final zc80 b;

    public ber(i8h1 i8h1Var, zc80 zc80Var) {
        this.a = i8h1Var;
        this.b = zc80Var;
    }

    public final void a() {
        py9 py9Var = (py9) this.b.b;
        x6h1 x6h1VarC = py9Var.c.c();
        x6h1VarC.i.add(new a7h1("snackbar", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).b = py9Var.b;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        this.a.f(k7h1Var.a(), (Set) null);
    }
}
