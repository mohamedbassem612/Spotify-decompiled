package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wj0 implements xpw {
    public final gw70 a;
    public final rey0 b = new rey0(o40.d);
    public final ia00 c = n3o1.q(this).a(n1.Z0, n1.a1);
    public final psw d;

    public wj0(gw70 gw70Var) {
        this.a = gw70Var;
        j2i j2iVar = new j2i(-366203029, new r1(this, (byte) 9), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.c;
    }

    public final jsw c() {
        return this.d;
    }

    public final void e(int i, String str, Function0 function0, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1677579583);
        byte b = 2;
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            mod.b(oi7.a.a(this.a), apo.r(-879855489, new ql(str, function0, b), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q1((Object) this, (Object) str, (Object) function0, i, (byte) 9);
        }
    }

    public final mqw getBehavior() {
        return this.b;
    }
}
