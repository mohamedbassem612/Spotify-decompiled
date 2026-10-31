package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class v0z0 {
    public final String a;
    public final long b;

    public v0z0(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0z0)) {
            return false;
        }
        v0z0 v0z0Var = (v0z0) obj;
        return u890.j(this.a, v0z0Var.a) && this.b == v0z0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
