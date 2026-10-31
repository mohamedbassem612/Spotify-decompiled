package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oe21 {
    public final /* synthetic */ qtb0 a;
    public final /* synthetic */ qqq0 b;

    public oe21(qtb0 qtb0Var, qqq0 qqq0Var) {
        this.a = qtb0Var;
        this.b = qqq0Var;
    }

    public final long a() {
        int i = this.a.p;
        int iOrdinal = this.b.ordinal();
        if (iOrdinal == 0) {
            return ((long) i) & 4294967295L;
        }
        if (iOrdinal == 1) {
            return ((long) i) << 32;
        }
        eg.o();
        return 0L;
    }

    public final long b() {
        int i = this.a.q;
        int iOrdinal = this.b.ordinal();
        if (iOrdinal == 0) {
            return ((long) i) & 4294967295L;
        }
        if (iOrdinal == 1) {
            return ((long) i) << 32;
        }
        eg.o();
        return 0L;
    }
}
