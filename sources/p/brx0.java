package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class brx0 extends frx0 {
    public final long a;
    public final boolean b;

    public brx0(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof brx0)) {
            return false;
        }
        brx0 brx0Var = (brx0) obj;
        return this.a == brx0Var.a && this.b == brx0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
