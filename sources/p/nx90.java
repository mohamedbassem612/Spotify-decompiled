package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nx90 implements xpw {
    public final d6o0 a;
    public final y5a0 b;
    public final js20 c;
    public final ia00 d;
    public final psw e;

    public nx90(xw90 xw90Var, ven0 ven0Var, i6o0 i6o0Var, y5a0 y5a0Var) {
        this.a = i6o0Var;
        this.b = y5a0Var;
        fey feyVar = xw90Var.a;
        c9c0 c9c0Var = (c9c0) feyVar.b;
        this.c = x3p1.m(new x010(new any(c9c0Var.b.current(), (byte) 18), c9c0Var.d.b(), new qr0(feyVar, null, (byte) 26), (byte) 1), mr90.h, ul90.i, (o8n) null, new hu90(xw90Var, (byte) 3), 8);
        this.d = n3o1.q(this).a(mx90.b, mx90.c);
        j2i j2iVar = new j2i(159679257, new t20(ven0Var, this, (byte) 13), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.d;
    }

    public final jsw c() {
        return this.e;
    }

    public final mqw getBehavior() {
        return this.c;
    }
}
