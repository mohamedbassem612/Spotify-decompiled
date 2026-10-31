package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ad30 extends t0u0 implements o5s {
    public static final /* synthetic */ mma0[] y1 = {new een0(ad30.class, "inForeground", "getInForeground()Z", 0)};
    public final xu0 u1;
    public final x8c0 v1;
    public final ao0 w1;
    public final ce0 x1;

    public ad30(xu0 xu0Var, yu0 yu0Var, x8c0 x8c0Var, ao0 ao0Var) {
        super(yu0Var);
        this.u1 = xu0Var;
        this.v1 = x8c0Var;
        this.w1 = ao0Var;
        this.x1 = new ce0(Boolean.valueOf(x8c0Var.b().a(w8c0.e)), this, (byte) 8);
    }

    @Override // p.t0u0
    public final void R(r4t r4tVar, int i, long j, long j2) {
        super.R(r4tVar, i, j, j2);
        this.v1.d(this);
    }

    @Override // p.t0u0
    public final void V(long j) {
        this.v1.a(this);
    }

    public final void onPause(iac0 iac0Var) {
        this.x1.c(y1[0], this, Boolean.FALSE);
    }

    public final void onResume(iac0 iac0Var) {
        this.x1.c(y1[0], this, Boolean.TRUE);
    }
}
