package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ls50 {
    public final String a;
    public final String b;
    public final Long c;
    public final ijg1 d;
    public final h290 e;
    public final String f;

    public ls50(String str, String str2, Long l, ijg1 ijg1Var, h290 h290Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = ijg1Var;
        this.e = h290Var;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ls50)) {
            return false;
        }
        ls50 ls50Var = (ls50) obj;
        return this.a.equals(ls50Var.a) && u890.j(this.b, ls50Var.b) && u890.j(this.c, ls50Var.c) && this.d == ls50Var.d && this.e.equals(ls50Var.e) && u890.j(this.f, ls50Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        ijg1 ijg1Var = this.d;
        int iG = kk0.g(this.e, (iHashCode3 + (ijg1Var == null ? 0 : ijg1Var.hashCode())) * 31, 31);
        String str2 = this.f;
        return iG + (str2 != null ? str2.hashCode() : 0);
    }
}
