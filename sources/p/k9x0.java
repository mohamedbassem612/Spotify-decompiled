package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k9x0 extends w361 {
    public final String c;
    public final boolean d;

    public k9x0(String str, boolean z) {
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k9x0)) {
            return false;
        }
        k9x0 k9x0Var = (k9x0) obj;
        return u890.j(this.c, k9x0Var.c) && this.d == k9x0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (this.c.hashCode() * 31);
    }
}
