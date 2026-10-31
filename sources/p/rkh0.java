package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class rkh0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xkh0 b;
    public final /* synthetic */ tkh0 c;

    public /* synthetic */ rkh0(xkh0 xkh0Var, tkh0 tkh0Var, byte b) {
        this.a = b;
        this.b = xkh0Var;
        this.c = tkh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        tkh0 tkh0Var = this.c;
        xkh0 xkh0Var = this.b;
        switch (b) {
            case 0:
                xkh0Var.f = tkh0Var;
                if (xkh0Var.g) {
                    xkh0Var.u(tkh0Var);
                }
                xkh0Var.b(new rkh0(xkh0Var, tkh0Var, (byte) 1), new wkh0(xkh0Var, (byte) 0));
                break;
            default:
                if (xkh0Var.isCancelled()) {
                    tkh0Var.f1();
                }
                break;
        }
    }
}
