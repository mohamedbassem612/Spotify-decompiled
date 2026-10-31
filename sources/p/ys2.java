package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ys2 {
    public final String a;
    public final String b;
    public final Long c;
    public final ijg1 d;
    public final h290 e;
    public final int f;

    public ys2(String str, String str2, Long l, ijg1 ijg1Var, h290 h290Var, int i) {
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = ijg1Var;
        this.e = h290Var;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ys2)) {
            return false;
        }
        ys2 ys2Var = (ys2) obj;
        return this.a.equals(ys2Var.a) && u890.j(this.b, ys2Var.b) && u890.j(this.c, ys2Var.c) && this.d == ys2Var.d && this.e.equals(ys2Var.e) && this.f == ys2Var.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        ijg1 ijg1Var = this.d;
        int iG = kk0.g(this.e, (iHashCode3 + (ijg1Var == null ? 0 : ijg1Var.hashCode())) * 31, 31);
        int i = this.f;
        return iG + (i != 0 ? l1d.C(i) : 0);
    }
}
