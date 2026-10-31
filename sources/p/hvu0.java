package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hvu0 {
    public final String a;
    public final String b;
    public final String c;
    public final gvu0 d;

    public hvu0(String str, String str2, String str3, gvu0 gvu0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = gvu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hvu0)) {
            return false;
        }
        hvu0 hvu0Var = (hvu0) obj;
        return u890.j(this.a, hvu0Var.a) && u890.j(this.b, hvu0Var.b) && u890.j(this.c, hvu0Var.c) && u890.j(this.d, hvu0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        gvu0 gvu0Var = this.d;
        return iHashCode3 + (gvu0Var != null ? gvu0Var.hashCode() : 0);
    }
}
