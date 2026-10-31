package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xs2 {
    public final String a;
    public final String b;
    public final Long c;
    public final String d;
    public final h290 e;
    public final String f;

    public xs2(String str, String str2, Long l, String str3, h290 h290Var, String str4) {
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = str3;
        this.e = h290Var;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs2)) {
            return false;
        }
        xs2 xs2Var = (xs2) obj;
        return this.a.equals(xs2Var.a) && u890.j(this.b, xs2Var.b) && u890.j(this.c, xs2Var.c) && u890.j(this.d, xs2Var.d) && this.e.equals(xs2Var.e) && u890.j(this.f, xs2Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.d;
        int iG = kk0.g(this.e, (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f;
        return iG + (str3 != null ? str3.hashCode() : 0);
    }
}
