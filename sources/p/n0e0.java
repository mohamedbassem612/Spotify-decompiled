package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class n0e0 implements o0e0 {
    public final String a;
    public final boolean b;

    public n0e0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0e0)) {
            return false;
        }
        n0e0 n0e0Var = (n0e0) obj;
        return this.a.equals(n0e0Var.a) && this.b == n0e0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
