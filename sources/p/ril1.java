package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ril1 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ qpj1 b;

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        qpj1 qpj1Var = this.b;
        switch (b) {
            case 0:
                xjl1 xjl1Var = (xjl1) qpj1Var.b;
                zrw0 zrw0Var = bsw0.a;
                bsw0.a(xjl1Var.a, c2u.a);
                ohd ohdVar = (ohd) qpj1Var.c;
                if (ohdVar.s() instanceof ago0) {
                    ohdVar.resumeWith(new e331(rih1.a));
                }
                break;
            default:
                xjl1 xjl1Var2 = (xjl1) qpj1Var.b;
                zrw0 zrw0Var2 = bsw0.a;
                bsw0.a(xjl1Var2.a, c2u.a);
                ohd ohdVar2 = (ohd) qpj1Var.c;
                if (ohdVar2.s() instanceof ago0) {
                    ohdVar2.resumeWith(new e331(rih1.a));
                }
                break;
        }
    }
}
