package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n1x0 extends fn31 {
    public final String g;
    public final boolean h;

    public n1x0(String str, boolean z) {
        this.g = str;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1x0)) {
            return false;
        }
        n1x0 n1x0Var = (n1x0) obj;
        return u890.j(this.g, n1x0Var.g) && this.h == n1x0Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + (this.g.hashCode() * 31);
    }
}
