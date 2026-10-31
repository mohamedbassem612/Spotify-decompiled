package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yd90 {
    public final String a;
    public final long b;

    public yd90(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd90)) {
            return false;
        }
        yd90 yd90Var = (yd90) obj;
        return this.a.equals(yd90Var.a) && this.b == yd90Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
