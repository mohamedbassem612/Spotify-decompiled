package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class atq {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ atq(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final xpw a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                lzn0 lzn0Var = ((tbn) ((k2q) ((hsq) obj).b).b).a;
                c8o.l(lzn0Var);
                return new u7p0(lzn0Var);
            default:
                return ((atq) ((jly0) ((k2q) obj).c).get()).a();
        }
    }
}
