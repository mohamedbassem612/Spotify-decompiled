package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zj30 {
    public final long a;
    public final int b;

    public zj30(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zj30)) {
            return false;
        }
        zj30 zj30Var = (zj30) obj;
        return this.a == zj30Var.a && this.b == zj30Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
