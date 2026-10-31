package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cll {
    public final int a;
    public final long b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cll() {
        this(-1, 0L);
        ytw0 ytw0Var = jfv.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cll)) {
            return false;
        }
        cll cllVar = (cll) obj;
        return this.a == cllVar.a && jfv.f(this.b, cllVar.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        ytw0 ytw0Var = jfv.b;
        return Long.hashCode(this.b) + iHashCode;
    }

    public cll(int i, long j) {
        this.a = i;
        this.b = j;
    }
}
