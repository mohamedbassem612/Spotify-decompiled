package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class y0e implements d6o0 {
    public final /* synthetic */ iu30 a;
    public final /* synthetic */ ven0 b;

    public y0e(iu30 iu30Var, ven0 ven0Var) {
        this.a = iu30Var;
        this.b = ven0Var;
    }

    public final long M(int i, long j) {
        ven0 ven0Var = this.b;
        if (((Boolean) ven0Var.getValue()).booleanValue()) {
            return 0L;
        }
        Boolean bool = Boolean.TRUE;
        this.a.invoke(bool);
        ven0Var.setValue(bool);
        return 0L;
    }

    public final Object Q0(long j, long j2, lnm lnmVar) {
        this.a.invoke(Boolean.FALSE);
        return new qui1(0L);
    }

    public final Object k0(long j, lnm lnmVar) {
        this.b.setValue(Boolean.FALSE);
        return new qui1(0L);
    }
}
