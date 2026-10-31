package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zwn0 implements ywn0 {
    public final yun0 a;
    public final pwn0 b;

    public zwn0(yun0 yun0Var, pwn0 pwn0Var) {
        this.a = yun0Var;
        this.b = pwn0Var;
    }

    public final void a(iu30 iu30Var) {
        a761 a761Var = this.b;
        a761 a761Var2 = a761Var instanceof a761 ? a761Var : null;
        if (a761Var2 == null) {
            iu30Var.invoke(new n0g0(a761Var, (byte) 26));
        } else {
            a761.b(a761Var2, new s2n0(iu30Var, a761Var2, (byte) 17));
        }
    }

    @Override // p.ywn0
    public final void b(b3i1 b3i1Var) {
        this.a.l().removeIf(new l61(b3i1Var, (byte) 2));
        a(new j9n0(this, b3i1Var, (byte) 13));
    }

    @Override // p.ywn0
    public final void c() {
        this.a.l().clear();
        a(new xkm0(this, (byte) 24));
    }

    @Override // p.ywn0
    public final void d(blc0 blc0Var) {
        this.a.l().removeIf(new l61(blc0Var, (byte) 1));
        a(new j9n0(this, blc0Var, (byte) 12));
    }
}
