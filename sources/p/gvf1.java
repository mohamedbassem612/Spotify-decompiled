package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gvf1 {
    public final long a;
    public final long b;

    public gvf1(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvf1)) {
            return false;
        }
        gvf1 gvf1Var = (gvf1) obj;
        return this.a == gvf1Var.a && this.b == gvf1Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
