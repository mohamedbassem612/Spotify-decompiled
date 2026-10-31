package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xrn {
    public final String a;
    public final boolean b;

    public xrn(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xrn)) {
            return false;
        }
        xrn xrnVar = (xrn) obj;
        return u890.j(this.a, xrnVar.a) && this.b == xrnVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
