package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class crx0 extends frx0 {
    public final long a;
    public final boolean b;

    public crx0(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crx0)) {
            return false;
        }
        crx0 crx0Var = (crx0) obj;
        return this.a == crx0Var.a && this.b == crx0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
