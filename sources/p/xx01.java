package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xx01 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;

    public xx01(int i, String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xx01)) {
            return false;
        }
        xx01 xx01Var = (xx01) obj;
        return this.a.equals(xx01Var.a) && u890.j(this.b, xx01Var.b) && u890.j(this.c, xx01Var.c) && u890.j(this.d, xx01Var.d) && this.e == xx01Var.e;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return l1d.C(this.e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
