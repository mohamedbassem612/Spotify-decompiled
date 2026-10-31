package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lvo0 {
    public final byte a;
    public final String b;
    public final String c;
    public final Boolean d;

    public lvo0(int i, String str, String str2) {
        Boolean bool = Boolean.FALSE;
        this.a = (byte) 20;
        this.b = str;
        this.c = str2;
        this.d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lvo0)) {
            return false;
        }
        lvo0 lvo0Var = (lvo0) obj;
        return this.a == lvo0Var.a && u890.j(this.b, lvo0Var.b) && u890.j(this.c, lvo0Var.c) && u890.j(this.d, lvo0Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(Integer.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 961;
        Boolean bool = this.d;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }
}
