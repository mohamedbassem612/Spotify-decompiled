package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class qjx0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xjx0 b;

    public /* synthetic */ qjx0(xjx0 xjx0Var, byte b) {
        this.a = b;
        this.b = xjx0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        xjx0 xjx0Var = this.b;
        switch (b) {
            case 0:
                xjx0Var.D();
                break;
            case 1:
                if (!xjx0Var.u1) {
                    zqh0 zqh0Var = xjx0Var.T0;
                    zqh0Var.getClass();
                    zqh0Var.c(xjx0Var);
                }
                break;
            default:
                xjx0Var.o1 = true;
                break;
        }
    }
}
