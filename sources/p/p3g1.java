package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p3g1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r3g1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ p3g1(r3g1 r3g1Var, int i, byte b) {
        this.a = b;
        this.b = r3g1Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        r3g1 r3g1Var = this.b;
        switch (b) {
            case 0:
                r3g1Var.i(i);
                break;
            case 1:
                ((z511) r3g1Var).a.e(i, 1);
                break;
            default:
                ((z511) r3g1Var).a.f(i, 1);
                break;
        }
    }
}
