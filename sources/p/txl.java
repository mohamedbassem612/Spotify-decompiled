package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class txl implements uxl {
    public final int a;
    public final long b;

    public txl(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txl)) {
            return false;
        }
        txl txlVar = (txl) obj;
        if (this.a != txlVar.a) {
            return false;
        }
        long j = txlVar.b;
        int i = u7h.l;
        return z4h1.b(this.b, j);
    }

    public final int hashCode() {
        int iC = l1d.C(this.a) * 31;
        int i = u7h.l;
        return Long.hashCode(this.b) + iC;
    }
}
