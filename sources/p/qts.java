package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class qts implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j4d1 b;

    public /* synthetic */ qts(j4d1 j4d1Var, byte b) {
        this.a = b;
        this.b = j4d1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        j4d1 j4d1Var = this.b;
        switch (b) {
            case 0:
                j4d1Var.c();
                break;
            default:
                j4d1Var.f.cancel(true);
                break;
        }
    }
}
