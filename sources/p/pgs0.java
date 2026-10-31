package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pgs0 {
    public final String a;
    public final String b;
    public final String c;

    public pgs0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pgs0)) {
            return false;
        }
        pgs0 pgs0Var = (pgs0) obj;
        return u890.j(this.a, pgs0Var.a) && u890.j(this.b, pgs0Var.b) && u890.j(this.c, pgs0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
