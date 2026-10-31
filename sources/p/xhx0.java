package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xhx0 extends t0u0 {
    public final xu0 u1;
    public final yu0 v1;
    public final ao0 w1;

    public xhx0(xu0 xu0Var, yu0 yu0Var, ao0 ao0Var) {
        super(yu0Var);
        this.u1 = xu0Var;
        this.v1 = yu0Var;
        this.w1 = ao0Var;
    }

    @Override // p.t0u0
    public final void R(r4t r4tVar, int i, long j, long j2) {
        super.R(r4tVar, i, j, j2);
        lpa lpaVar = new lpa(this, j, (byte) 3);
        boolean z = this.r1;
        this.r1 = true;
        lpaVar.invoke();
        this.r1 = z;
    }
}
