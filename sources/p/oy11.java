package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class oy11 implements d6o0 {
    public final /* synthetic */ iu30 a;
    public final /* synthetic */ ven0 b;

    public oy11(iu30 iu30Var, ven0 ven0Var) {
        this.a = iu30Var;
        this.b = ven0Var;
    }

    public final long M(int i, long j) {
        ven0 ven0Var = this.b;
        if (((Boolean) ven0Var.getValue()).booleanValue()) {
            return 0L;
        }
        Boolean bool = Boolean.TRUE;
        ven0Var.setValue(bool);
        this.a.invoke(bool);
        return 0L;
    }

    public final Object Q0(long j, long j2, lnm lnmVar) {
        ven0 ven0Var = this.b;
        if (((Boolean) ven0Var.getValue()).booleanValue()) {
            Boolean bool = Boolean.FALSE;
            ven0Var.setValue(bool);
            this.a.invoke(bool);
        }
        return new qui1(0L);
    }
}
