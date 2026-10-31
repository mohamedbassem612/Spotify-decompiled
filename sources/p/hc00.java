package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hc00 implements kly0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lc00 b;

    public /* synthetic */ hc00(lc00 lc00Var, byte b) {
        this.a = b;
        this.b = lc00Var;
    }

    public final Object get() {
        byte b = this.a;
        lc00 lc00Var = this.b;
        switch (b) {
            case 0:
                return (mb00) lc00Var.w.getValue();
            default:
                return (trz0) lc00Var.z.getValue();
        }
    }
}
