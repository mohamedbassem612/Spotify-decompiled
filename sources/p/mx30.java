package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class mx30 implements nzc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n8d0 b;

    public /* synthetic */ mx30(n8d0 n8d0Var, byte b) {
        this.a = b;
        this.b = n8d0Var;
    }

    public final Object attachCompleter(mzc mzcVar) {
        byte b = this.a;
        n8d0 n8d0Var = this.b;
        switch (b) {
            case 0:
                n8d0Var.b(new fss(mzcVar, (byte) 28), n5u.a());
                return "transformVoidFuture [" + n8d0Var + "]";
            default:
                poz0.G(false, n8d0Var, mzcVar, n5u.a());
                return "nonCancellationPropagating[" + n8d0Var + "]";
        }
    }
}
