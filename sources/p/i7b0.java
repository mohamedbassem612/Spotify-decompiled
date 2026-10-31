package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class i7b0 implements Function0 {
    public final /* synthetic */ byte a;
    public final u7b0 b;

    public /* synthetic */ i7b0(u7b0 u7b0Var, byte b) {
        this.a = b;
        this.b = u7b0Var;
    }

    public final Object invoke() {
        via0 via0Var;
        byte b = this.a;
        u7b0 u7b0Var = this.b;
        switch (b) {
            case 0:
                u7b0 u7b0Var2 = this.b;
                w3b0 w3b0Var = u7b0Var2.e;
                return i3o1.j(u7b0Var2, w3b0Var.h, w3b0Var.f, z6x.a, (c1h1) u7b0Var2.i.getValue(), true);
            case 1:
                u7b0 u7b0Var3 = this.b;
                if (!fc11.N(u7b0Var3)) {
                    return u7b0Var3.f();
                }
                w3b0 w3b0Var2 = u7b0Var3.e;
                return i3o1.j(u7b0Var3, w3b0Var2.h, w3b0Var2.f, z6x.a, (c1h1) u7b0Var3.i.getValue(), false);
            case 2:
                return ajo1.B(u7b0Var.e.c(), u7b0Var.b.n().getClassLoader(), (c1h1) u7b0Var.i.getValue(), u1p1.z(u7b0Var) ? null : new i7b0(u7b0Var, (byte) 5));
            case 3:
                bla0 bla0Var = u7b0Var.b;
                bla0 bla0Var2 = bla0Var instanceof bla0 ? bla0Var : null;
                Function0 function0D = bla0Var2 != null ? ((yka0) bla0Var2.c.getValue()).d() : null;
                c1h1 c1h1Var = c1h1.d;
                return xyn1.n(u7b0Var.e.e, function0D, u7b0Var, bla0Var.n().getClassLoader());
            case 4:
                if (u1p1.z(u7b0Var) || (via0Var = don1.v(u7b0Var.e).b) == null) {
                    return null;
                }
                mla0 mla0Var = u7b0Var.b;
                if (mla0Var instanceof ema0) {
                    try {
                        return ((ema0) mla0Var).b.getDeclaredField(via0Var.c);
                    } catch (NoSuchFieldException unused) {
                        return null;
                    }
                }
                bhn0.s(u7b0Var, "javaField is only supported for top-level properties for now: ");
                return null;
            default:
                return u7b0Var.getCaller().getReturnType();
        }
    }
}
