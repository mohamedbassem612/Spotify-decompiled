package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pkh0 implements xpw {
    public final gw70 a;
    public final woa b;
    public final kma c;
    public final qkh0 d;
    public final rey0 e = new rey0(new otf0(this, (byte) 16));
    public final eih1 f = new eih1();
    public final psw g;

    public pkh0(gw70 gw70Var, woa woaVar, kma kmaVar, qkh0 qkh0Var) {
        this.a = gw70Var;
        this.b = woaVar;
        this.c = kmaVar;
        this.d = qkh0Var;
        j2i j2iVar = new j2i(-1038406190, new qcd0(this, (byte) 28), true);
        ien0 ien0Var = qsw.a;
        this.g = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.f;
    }

    public final jsw c() {
        return this.g;
    }

    public final void e(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-599794221);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.g(str2) ? 32 : 16) | (x340Var.g(qim0Var) ? 256 : 128) | (x340Var.i(this) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            mod.b(oi7.a.a(this.a), apo.r(689508627, new c4(str, qim0Var, str2), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new okh0(this, str, str2, qim0Var, i, (byte) 0);
        }
    }

    public final void f(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-52040013);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.g(str2) ? 32 : 16) | (x340Var.i(this) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            mod.c(new ely0[]{q7f0.a.a(this.b), q7f0.b.a(this.c)}, apo.r(1237262835, new c4(str, str2, qim0Var), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new okh0(this, str, str2, qim0Var, i, (byte) 1);
        }
    }

    public final mqw getBehavior() {
        return this.e;
    }
}
