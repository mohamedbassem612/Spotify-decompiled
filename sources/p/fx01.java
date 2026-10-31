package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fx01 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gx01 b;

    public /* synthetic */ fx01(gx01 gx01Var, byte b) {
        this.a = b;
        this.b = gx01Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        xw01 xw01Var = xw01.a;
        gx01 gx01Var = this.b;
        switch (b) {
            case 0:
                gx01Var.m.onNext(xw01Var);
                break;
            default:
                gx01Var.m.onNext(xw01Var);
                break;
        }
    }
}
