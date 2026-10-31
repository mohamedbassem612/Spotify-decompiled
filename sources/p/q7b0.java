package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public class q7b0 extends u7b0 implements ima0 {
    public final znb0 X;

    public q7b0(mla0 mla0Var, String str, Object obj, w3b0 w3b0Var) {
        super(mla0Var, str, obj, w3b0Var);
        this.X = dm5.S(2, new o7b0(this, (byte) 0));
        dm5.S(2, new o7b0(this, (byte) 1));
    }

    public final gma0 b() {
        return (p7b0) this.X.getValue();
    }

    public final Object get() {
        return ((p7b0) this.X.getValue()).call(new Object[0]);
    }

    public final Object invoke() {
        return get();
    }

    @Override // p.u7b0
    public final k7b0 t() {
        return (p7b0) this.X.getValue();
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public final hma0 m1282b() {
        return (p7b0) this.X.getValue();
    }
}
