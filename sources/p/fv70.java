package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fv70 implements mj00 {
    public final hjc a;
    public final lo60 b;
    public final vgm c;
    public final kly0 d;
    public final w25 e;
    public final boolean f;
    public final l0x0 g;
    public final su70 h;
    public final ms00 i;
    public final hs00 j;

    public fv70(hjc hjcVar, lo60 lo60Var, vgm vgmVar, lbp lbpVar, w25 w25Var, uk00 uk00Var, boolean z, l0x0 l0x0Var, su70 su70Var, ms00 ms00Var, hs00 hs00Var) {
        this.a = hjcVar;
        this.b = lo60Var;
        this.c = vgmVar;
        this.d = lbpVar;
        this.e = w25Var;
        this.f = z;
        this.g = l0x0Var;
        this.h = su70Var;
        this.i = ms00Var;
        this.j = hs00Var;
    }

    @Override // p.mj00
    public final ji50 a(xk00 xk00Var, ji50 ji50Var) {
        w25 w25Var = this.e;
        boolean zQ = w25Var.Q();
        boolean zR = w25Var.R();
        boolean zY = w25Var.Y();
        boolean zO = w25Var.o();
        ms00 ms00Var = this.i;
        ji50Var.b.put(qu70.class, new r3r(mth1.D(kyo1.o(this.h.b(this.d, this.a, this.b, this.c, this.f, zQ, zR, zY, zO, ms00Var.b(), ms00Var.b() && ms00Var.a(), ms00Var.b() ? this.j : null, this.g), new z5z(this, (byte) 24)), vu70.Y), v30.Y0, (vu30) null));
        return ji50Var;
    }
}
