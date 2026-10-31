package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class f7b0 implements Function0 {
    public final /* synthetic */ byte a = 1;
    public final g7b0 b;
    public final mla0 c;

    public f7b0(mla0 mla0Var, g7b0 g7b0Var) {
        this.c = mla0Var;
        this.b = g7b0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        bla0 bla0Var = this.c;
        g7b0 g7b0Var = this.b;
        switch (b) {
            case 0:
                bla0 bla0Var2 = bla0Var instanceof bla0 ? bla0Var : null;
                c1h1 c1h1VarD = bla0Var2 != null ? ((yka0) bla0Var2.c.getValue()).d() : null;
                c1h1 c1h1Var = c1h1.d;
                return xyn1.n(g7b0Var.i.c, c1h1VarD, g7b0Var, bla0Var.n().getClassLoader());
            default:
                y3b0 y3b0Var = g7b0Var.i.h;
                if (y3b0Var != null) {
                    return ajo1.B(y3b0Var, bla0Var.n().getClassLoader(), g7b0Var.z(), new x5u(g7b0Var, (byte) 24));
                }
                u890.C("returnType");
                throw null;
        }
    }

    public f7b0(g7b0 g7b0Var, mla0 mla0Var) {
        this.b = g7b0Var;
        this.c = mla0Var;
    }
}
