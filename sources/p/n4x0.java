package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class n4x0 extends i541 {
    public final String d;
    public final String e;

    public n4x0(String str, String str2) {
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4x0)) {
            return false;
        }
        n4x0 n4x0Var = (n4x0) obj;
        return u890.j(this.d, n4x0Var.d) && u890.j(this.e, n4x0Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        String str = this.e;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
