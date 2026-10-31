package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nz31 {
    public final String a;
    public final jz31 b;

    public nz31(String str, jz31 jz31Var) {
        this.a = str;
        this.b = jz31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nz31)) {
            return false;
        }
        nz31 nz31Var = (nz31) obj;
        return u890.j(this.a, nz31Var.a) && this.b == nz31Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
