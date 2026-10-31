package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l281 extends e6p1 {
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public l281(String str, String str2, String str3, String str4, String str5) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l281)) {
            return false;
        }
        l281 l281Var = (l281) obj;
        return this.c.equals(l281Var.c) && this.d.equals(l281Var.d) && this.e.equals(l281Var.e) && u890.j(this.f, l281Var.f) && u890.j(this.g, l281Var.g);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.c.hashCode() * 31, 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
