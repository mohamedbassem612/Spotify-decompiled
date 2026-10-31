package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class pwj1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bih1 b;
    public final /* synthetic */ far c;

    public /* synthetic */ pwj1(bih1 bih1Var, far farVar, byte b) {
        this.a = b;
        this.b = bih1Var;
        this.c = farVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bih1 bih1Var = this.b;
                far farVar = this.c;
                qwj1 qwj1Var = (qwj1) bih1Var.c;
                String str = zoi1.a;
                qwj1Var.v(farVar);
                break;
            default:
                bih1 bih1Var2 = this.b;
                far farVar2 = this.c;
                synchronized (farVar2) {
                }
                qwj1 qwj1Var2 = (qwj1) bih1Var2.c;
                String str2 = zoi1.a;
                qwj1Var2.d(farVar2);
                break;
        }
    }
}
