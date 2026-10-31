package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ndb1 {
    public final String a;
    public final boolean b;

    public ndb1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ndb1)) {
            return false;
        }
        ndb1 ndb1Var = (ndb1) obj;
        return u890.j(this.a, ndb1Var.a) && this.b == ndb1Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
