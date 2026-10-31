package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class hrn1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ krn1 b;

    public /* synthetic */ hrn1(krn1 krn1Var, byte b) {
        this.a = b;
        this.b = krn1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        fwh0 fwh0Var = this.b;
        switch (b) {
            case 0:
                fwh0Var.n();
                break;
            default:
                ((krn1) fwh0Var).e.p(fwh0Var);
                break;
        }
    }
}
