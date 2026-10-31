package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class n13 {
    public final String a;
    public final boolean b;

    public n13(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n13)) {
            return false;
        }
        n13 n13Var = (n13) obj;
        return u890.j(this.a, n13Var.a) && this.b == n13Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
