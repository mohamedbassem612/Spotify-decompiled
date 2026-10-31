package p;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vhd0 {
    public static final Set d = Collections.singleton(c3h1.b);
    public final bcl1 a;
    public final b2r0 b;
    public final i8h1 c;

    public vhd0(bcl1 bcl1Var, b2r0 b2r0Var, i8h1 i8h1Var) {
        this.a = bcl1Var;
        this.b = b2r0Var;
        this.c = i8h1Var;
    }

    public final c4m0 a(xhm1 xhm1Var) {
        return new c4m0(bcl1.b(this.a, xhm1Var.b, xhm1Var.a), (byte) 1);
    }

    public final void b(xhm1 xhm1Var, uhd0 uhd0Var) {
        int i;
        c4m0 c4m0VarA = a(xhm1Var);
        int iOrdinal = uhd0Var.ordinal();
        if (iOrdinal != 0) {
            i = 2;
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    eg.o();
                    return;
                }
                i = 1;
            }
        } else {
            i = 3;
        }
        x6h1 x6h1VarC = c4m0VarA.c.c();
        x6h1VarC.i.add(new a7h1("quiz_option", "listening_age", (Integer) null, (String) null, z3m0.d(i)));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        this.c.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), y6h1VarA, c4m0VarA.b, System.currentTimeMillis()), (xj61) null);
    }
}
