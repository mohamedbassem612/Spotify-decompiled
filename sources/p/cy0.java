package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cy0 {
    public final String a;
    public final long b;

    public cy0(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cy0)) {
            return false;
        }
        cy0 cy0Var = (cy0) obj;
        return this.a.equals(cy0Var.a) && this.b == cy0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
