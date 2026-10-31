package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f89 implements io20, x4f0 {
    public final /* synthetic */ byte a;
    public final kly0 b;

    public /* synthetic */ f89(kly0 kly0Var, byte b) {
        this.a = b;
        this.b = kly0Var;
    }

    public Object b() {
        byte b = this.a;
        kly0 kly0Var = this.b;
        switch (b) {
            case 1:
                return Integer.valueOf(((dhb) kly0Var.get()).e());
            default:
                return Long.valueOf(((p3l) kly0Var.get()).K());
        }
    }
}
