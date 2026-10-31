package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class g0h1 extends ltn1 {
    public static final g0h1 d = new g0h1(0);
    public static final g0h1 e = new g0h1(1);
    public static final g0h1 f = new g0h1(2);
    public final /* synthetic */ byte c;

    public /* synthetic */ g0h1(byte b) {
        this.c = b;
    }

    public final qh31 D(teb tebVar, e8b0 e8b0Var) {
        switch (this.c) {
            case 0:
                return ((m1h1) tebVar.d).X(e8b0Var);
            case 1:
                throw new UnsupportedOperationException("Should not be called");
            default:
                return ((m1h1) tebVar.d).O(e8b0Var);
        }
    }
}
