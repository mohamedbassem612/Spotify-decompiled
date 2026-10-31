package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xom1 implements bpm1 {
    public final String a;
    public final String b;
    public final boolean c;
    public final Long d;

    public xom1(Long l, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xom1)) {
            return false;
        }
        xom1 xom1Var = (xom1) obj;
        return u890.j(this.a, xom1Var.a) && u890.j(this.b, xom1Var.b) && this.c == xom1Var.c && u890.j(this.d, xom1Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iG = xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        Long l = this.d;
        return iG + (l != null ? l.hashCode() : 0);
    }
}
