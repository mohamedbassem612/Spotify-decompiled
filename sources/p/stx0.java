package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class stx0 implements ttx0 {
    public final String a;
    public final String b;

    public stx0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof stx0)) {
            return false;
        }
        stx0 stx0Var = (stx0) obj;
        return u890.j(this.a, stx0Var.a) && u890.j(this.b, stx0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
