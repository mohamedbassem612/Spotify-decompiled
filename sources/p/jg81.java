package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jg81 implements xpw {
    public static final String f = nik1.Y4.a;
    public final lzn0 a;
    public final rhq b;
    public final rey0 c = new rey0(new k681(this, (byte) 5));
    public final ia00 d = n3o1.q(this).a(c781.Y, c781.Z);
    public final psw e;

    public jg81(lzn0 lzn0Var, rhq rhqVar) {
        this.a = lzn0Var;
        this.b = rhqVar;
        j2i j2iVar = new j2i(-1671503587, new c771(this, (byte) 22), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.d;
    }

    public final jsw c() {
        return this.e;
    }

    public final void e(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1694922966);
        int i2 = i & 1;
        if (x340Var.Y(i2, i2 != 0)) {
            w8p1.f(new fh51(cwl1.o0(x340Var, 2131962454)), (qim0) null, (iu30) null, x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dj71(this, i, (byte) 13);
        }
    }

    public final mqw getBehavior() {
        return this.c;
    }
}
