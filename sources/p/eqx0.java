package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eqx0 extends frx0 {
    public final String a;
    public final String b;

    public eqx0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqx0)) {
            return false;
        }
        eqx0 eqx0Var = (eqx0) obj;
        return u890.j(this.a, eqx0Var.a) && u890.j(this.b, eqx0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
