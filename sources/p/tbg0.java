package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tbg0 extends xpn1 {
    public final String d;
    public final ibg0 e;
    public final boolean f;

    public tbg0(String str, ibg0 ibg0Var, boolean z) {
        this.d = str;
        this.e = ibg0Var;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tbg0)) {
            return false;
        }
        tbg0 tbg0Var = (tbg0) obj;
        return this.d.equals(tbg0Var.d) && this.e == tbg0Var.e && this.f == tbg0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31);
    }
}
