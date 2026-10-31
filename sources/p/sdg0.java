package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sdg0 extends eqn1 {
    public final String d;
    public final ibg0 e;
    public final boolean f;

    public sdg0(String str, ibg0 ibg0Var, boolean z) {
        this.d = str;
        this.e = ibg0Var;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sdg0)) {
            return false;
        }
        sdg0 sdg0Var = (sdg0) obj;
        return u890.j(this.d, sdg0Var.d) && this.e == sdg0Var.e && this.f == sdg0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31);
    }
}
