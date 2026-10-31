package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class owj1 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ bih1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ owj1(bih1 bih1Var, int i, long j) {
        this.b = bih1Var;
        this.d = i;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.d;
        long j = this.c;
        bih1 bih1Var = this.b;
        switch (b) {
            case 0:
                qwj1 qwj1Var = (qwj1) bih1Var.c;
                String str = zoi1.a;
                qwj1Var.M(i, j);
                break;
            default:
                qwj1 qwj1Var2 = (qwj1) bih1Var.c;
                String str2 = zoi1.a;
                qwj1Var2.F(i, j);
                break;
        }
    }

    public /* synthetic */ owj1(bih1 bih1Var, long j, int i) {
        this.b = bih1Var;
        this.c = j;
        this.d = i;
    }
}
