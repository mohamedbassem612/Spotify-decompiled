package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s1k1 extends q5u0 {
    public final /* synthetic */ ven0 N0;
    public final /* synthetic */ wen0 X;
    public final /* synthetic */ ven0 Y;
    public final /* synthetic */ ven0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1k1(m0u0 m0u0Var, oot0 oot0Var, wen0 wen0Var, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3) {
        super(m0u0Var, oot0Var);
        this.X = wen0Var;
        this.Y = ven0Var;
        this.Z = ven0Var2;
        this.N0 = ven0Var3;
    }

    @Override // p.q5u0
    public final void J(long j, long j2) {
        super.J(j, j2);
        this.Y.setValue(xqj1.a);
        this.Z.setValue(Boolean.TRUE);
    }

    @Override // p.q5u0
    public final void O(long j, long j2) {
        super.O(j, j2);
        this.Y.setValue(wqj1.a);
        if (((Boolean) this.N0.getValue()).booleanValue()) {
            return;
        }
        this.Z.setValue(Boolean.FALSE);
    }

    @Override // p.q5u0
    public final void R(r4t r4tVar, int i, long j, long j2) {
        super.R(r4tVar, i, j, j2);
        this.Y.setValue(vqj1.a);
        if (((Boolean) this.N0.getValue()).booleanValue()) {
            return;
        }
        this.Z.setValue(Boolean.FALSE);
    }

    @Override // p.q5u0
    public final void m(long j, long j2) {
        super.m(j, j2);
        k5u0 k5u0VarA = a();
        if (k5u0VarA == null || k5u0VarA.g) {
            return;
        }
        this.Y.setValue(xqj1.a);
        this.Z.setValue(Boolean.TRUE);
    }

    @Override // p.q5u0
    public final void q(k5u0 k5u0Var) {
        bpb1 bpb1Var = this.X;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, k5u0Var);
    }
}
