package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rbg0 extends xpn1 {
    public final String d;
    public final ibg0 e;
    public final boolean f;

    public rbg0(String str, ibg0 ibg0Var, boolean z) {
        this.d = str;
        this.e = ibg0Var;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbg0)) {
            return false;
        }
        rbg0 rbg0Var = (rbg0) obj;
        return this.d.equals(rbg0Var.d) && this.e == rbg0Var.e && this.f == rbg0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31);
    }
}
