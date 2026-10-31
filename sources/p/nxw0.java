package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nxw0 {
    public final String a;
    public final boolean b;

    public nxw0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxw0)) {
            return false;
        }
        nxw0 nxw0Var = (nxw0) obj;
        return u890.j(this.a, nxw0Var.a) && this.b == nxw0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
