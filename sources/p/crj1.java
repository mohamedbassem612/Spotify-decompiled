package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@o661
public final class crj1 {
    public static final brj1 Companion = new brj1();
    public static final znb0[] e = {dm5.S(2, vbh1.c1), dm5.S(2, vbh1.d1), null, null};
    public final sg01 a;
    public final yjh1 b;
    public final String c;
    public final Long d;

    public /* synthetic */ crj1(int i, sg01 sg01Var, yjh1 yjh1Var, String str, Long l) {
        if (1 != (i & 1)) {
            o6p1.t(i, 1, arj1.a.getDescriptor());
            throw null;
        }
        this.a = sg01Var;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = yjh1Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crj1)) {
            return false;
        }
        crj1 crj1Var = (crj1) obj;
        return this.a == crj1Var.a && this.b == crj1Var.b && u890.j(this.c, crj1Var.c) && u890.j(this.d, crj1Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        yjh1 yjh1Var = this.b;
        int iHashCode2 = (iHashCode + (yjh1Var == null ? 0 : yjh1Var.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.d;
        return iHashCode3 + (l != null ? l.hashCode() : 0);
    }

    public crj1(sg01 sg01Var, yjh1 yjh1Var, String str, Long l, int i) {
        yjh1Var = (i & 2) != 0 ? null : yjh1Var;
        l = (i & 8) != 0 ? null : l;
        this.a = sg01Var;
        this.b = yjh1Var;
        this.c = str;
        this.d = l;
    }
}
