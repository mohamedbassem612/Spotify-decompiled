package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dr30 implements fr30 {
    public final String a;
    public final long b;

    public dr30(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dr30)) {
            return false;
        }
        dr30 dr30Var = (dr30) obj;
        return this.a.equals(dr30Var.a) && this.b == dr30Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
