package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qbg0 extends xpn1 {
    public final String d;
    public final ibg0 e;
    public final boolean f;

    public qbg0(String str, ibg0 ibg0Var, boolean z) {
        this.d = str;
        this.e = ibg0Var;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qbg0)) {
            return false;
        }
        qbg0 qbg0Var = (qbg0) obj;
        return this.d.equals(qbg0Var.d) && this.e == qbg0Var.e && this.f == qbg0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31);
    }
}
