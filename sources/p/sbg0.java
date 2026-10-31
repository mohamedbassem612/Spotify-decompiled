package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sbg0 extends xpn1 {
    public final String d;
    public final ibg0 e;
    public final boolean f;

    public sbg0(String str, ibg0 ibg0Var, boolean z) {
        this.d = str;
        this.e = ibg0Var;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sbg0)) {
            return false;
        }
        sbg0 sbg0Var = (sbg0) obj;
        return this.d.equals(sbg0Var.d) && this.e == sbg0Var.e && this.f == sbg0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31);
    }
}
