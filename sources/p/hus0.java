package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hus0 implements eck1 {
    public final /* synthetic */ byte a;
    public final kly0 b;

    public /* synthetic */ hus0(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final xbk1 b(Class cls) {
        byte b = this.a;
        kly0 kly0Var = this.b;
        switch (b) {
            case 0:
                return (xbk1) kly0Var.get();
            default:
                Object obj = kly0Var.get();
                xbk1 xbk1Var = obj instanceof xbk1 ? (xbk1) obj : null;
                if (xbk1Var != null) {
                    return xbk1Var;
                }
                i9p1.D();
                throw null;
        }
    }
}
