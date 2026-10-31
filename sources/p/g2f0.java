package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class g2f0 implements xpw {
    public final lzn0 a;
    public final boolean b;
    public final rey0 c = new rey0(new k2d0(this, (byte) 24));
    public final ia00 d = n3o1.q(this).a(wud0.U0, new kmd0(this, 14));
    public final psw e;

    public g2f0(lzn0 lzn0Var, boolean z) {
        this.a = lzn0Var;
        this.b = z;
        j2i j2iVar = vxi.b;
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.d;
    }

    public final jsw c() {
        return this.e;
    }

    public final String e(e2f0 e2f0Var) {
        String str = e2f0Var.a;
        return this.b ? f4i1.f("spotify:internal:parental-control:child-login:", str, "") : nik1.n0.b("spotify:internal:parental-control:login-choice:".concat(str)).a;
    }

    public final mqw getBehavior() {
        return this.c;
    }
}
