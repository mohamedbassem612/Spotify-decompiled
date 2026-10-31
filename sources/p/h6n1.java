package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h6n1 implements jly0 {
    public final /* synthetic */ byte a;
    public final jly0 b;

    public /* synthetic */ h6n1(byte b, Object obj, jly0 jly0Var) {
        this.a = b;
        this.b = jly0Var;
    }

    @Override // p.kly0
    public final Object get() {
        byte b = this.a;
        jly0 jly0Var = this.b;
        switch (b) {
            case 0:
                return new c7n1((t7n1) jly0Var.get());
            case 1:
                return new kvg((zdp0) jly0Var.get());
            case 2:
                return new rug((s7n1) jly0Var.get());
            case 3:
                return new c7n1((t7n1) jly0Var.get());
            default:
                return new s7n1((tug) jly0Var.get());
        }
    }
}
