package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class e481 {
    public final int a;
    public final t881 b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;
    public final Boolean f;
    public final Boolean g;
    public final nia1 h;
    public final Boolean i;
    public final Integer j;
    public final Integer k;
    public final Double l;
    public final Integer m;
    public final String n;
    public final Integer o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f19p;
    public final nqz0 q;
    public final Boolean r;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ e481(t881 t881Var, nia1 nia1Var, nqz0 nqz0Var, int i) {
        Boolean bool = Boolean.TRUE;
        this(500, t881Var, (i & 4) != 0 ? null : bool, null, null, null, (i & 64) != 0 ? null : Boolean.FALSE, (i & 128) != 0 ? null : nia1Var, null, null, null, null, null, null, (i & 16384) != 0 ? null : 15, null, (65536 & i) != 0 ? null : nqz0Var, (i & 131072) != 0 ? null : bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e481)) {
            return false;
        }
        e481 e481Var = (e481) obj;
        return this.a == e481Var.a && u890.j(this.b, e481Var.b) && u890.j(this.c, e481Var.c) && u890.j(this.d, e481Var.d) && u890.j(this.e, e481Var.e) && u890.j(this.f, e481Var.f) && u890.j(this.g, e481Var.g) && u890.j(this.h, e481Var.h) && u890.j(this.i, e481Var.i) && u890.j(this.j, e481Var.j) && u890.j(this.k, e481Var.k) && u890.j(this.l, e481Var.l) && u890.j(this.m, e481Var.m) && u890.j(this.n, e481Var.n) && u890.j(this.o, e481Var.o) && u890.j(this.f19p, e481Var.f19p) && u890.j(this.q, e481Var.q) && u890.j(this.r, e481Var.r);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        t881 t881Var = this.b;
        int iHashCode2 = (iHashCode + (t881Var == null ? 0 : t881Var.hashCode())) * 31;
        Boolean bool = this.c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.d;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.e;
        int iHashCode5 = (iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f;
        int iHashCode6 = (iHashCode5 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.g;
        int iHashCode7 = (iHashCode6 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        nia1 nia1Var = this.h;
        int iHashCode8 = (iHashCode7 + (nia1Var == null ? 0 : nia1Var.hashCode())) * 31;
        Boolean bool6 = this.i;
        int iHashCode9 = (iHashCode8 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Integer num = this.j;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.k;
        int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d = this.l;
        int iHashCode12 = (iHashCode11 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num3 = this.m;
        int iHashCode13 = (iHashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.n;
        int iHashCode14 = (iHashCode13 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num4 = this.o;
        int iHashCode15 = (iHashCode14 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.f19p;
        int iHashCode16 = (iHashCode15 + (str2 == null ? 0 : str2.hashCode())) * 31;
        nqz0 nqz0Var = this.q;
        int iHashCode17 = (iHashCode16 + (nqz0Var == null ? 0 : nqz0Var.hashCode())) * 31;
        Boolean bool7 = this.r;
        return iHashCode17 + (bool7 != null ? bool7.hashCode() : 0);
    }

    public e481(int i, t881 t881Var, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, nia1 nia1Var, Boolean bool6, Integer num, Integer num2, Double d, Integer num3, String str, Integer num4, String str2, nqz0 nqz0Var, Boolean bool7) {
        this.a = i;
        this.b = t881Var;
        this.c = bool;
        this.d = bool2;
        this.e = bool3;
        this.f = bool4;
        this.g = bool5;
        this.h = nia1Var;
        this.i = bool6;
        this.j = num;
        this.k = num2;
        this.l = d;
        this.m = num3;
        this.n = str;
        this.o = num4;
        this.f19p = str2;
        this.q = nqz0Var;
        this.r = bool7;
    }
}
