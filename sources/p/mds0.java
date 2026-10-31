package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mds0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ods0 b;
    public final /* synthetic */ double c;

    public /* synthetic */ mds0(ods0 ods0Var, double d, byte b) {
        this.a = b;
        this.b = ods0Var;
        this.c = d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        double d = this.c;
        ods0 ods0Var = this.b;
        switch (b) {
            case 0:
                ods0Var.a.h(d);
                break;
            default:
                ods0Var.a.f(d);
                break;
        }
    }
}
