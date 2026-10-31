package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class ju5 extends cv5 {
    public static final iu5 Companion = new iu5();
    public static final ju5 u;
    public up5 b;
    public aq5 c;
    public Integer d;
    public String e;
    public Integer f;
    public String g;
    public String h;
    public Boolean i;
    public Integer j;
    public Boolean k;
    public Boolean l;
    public Boolean m;
    public Boolean n;
    public Boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Boolean f20p;
    public Boolean q;
    public Boolean r;
    public Boolean s;
    public String t;

    static {
        Boolean bool = Boolean.FALSE;
        u = new ju5(null, null, 0, "", 0, "no_track", "", bool, bool, bool, bool, bool, bool, bool, null);
    }

    public ju5(up5 up5Var, aq5 aq5Var, Integer num, String str, Integer num2, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, String str4) {
        Boolean bool8 = Boolean.FALSE;
        this.b = up5Var;
        this.c = aq5Var;
        this.d = num;
        this.e = str;
        this.f = num2;
        this.g = str2;
        this.h = str3;
        this.i = bool;
        this.j = 0;
        this.k = bool2;
        this.l = bool8;
        this.m = bool3;
        this.n = bool8;
        this.o = bool4;
        this.f20p = bool5;
        this.q = bool6;
        this.r = bool7;
        this.s = bool8;
        this.t = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ju5)) {
            return false;
        }
        ju5 ju5Var = (ju5) obj;
        return u890.j(this.b, ju5Var.b) && u890.j(this.c, ju5Var.c) && u890.j(this.d, ju5Var.d) && u890.j(this.e, ju5Var.e) && u890.j(this.f, ju5Var.f) && u890.j(this.g, ju5Var.g) && u890.j(this.h, ju5Var.h) && u890.j(this.i, ju5Var.i) && u890.j(this.j, ju5Var.j) && u890.j(this.k, ju5Var.k) && u890.j(this.l, ju5Var.l) && u890.j(this.m, ju5Var.m) && u890.j(this.n, ju5Var.n) && u890.j(this.o, ju5Var.o) && u890.j(this.f20p, ju5Var.f20p) && u890.j(this.q, ju5Var.q) && u890.j(this.r, ju5Var.r) && u890.j(this.s, ju5Var.s) && u890.j(this.t, ju5Var.t);
    }

    public final int hashCode() {
        up5 up5Var = this.b;
        int iHashCode = (up5Var == null ? 0 : up5Var.hashCode()) * 31;
        aq5 aq5Var = this.c;
        int iHashCode2 = (iHashCode + (aq5Var == null ? 0 : aq5Var.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.e;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.i;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num3 = this.j;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool2 = this.k;
        int iHashCode10 = (iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.l;
        int iHashCode11 = (iHashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.m;
        int iHashCode12 = (iHashCode11 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.n;
        int iHashCode13 = (iHashCode12 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.o;
        int iHashCode14 = (iHashCode13 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.f20p;
        int iHashCode15 = (iHashCode14 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.q;
        int iHashCode16 = (iHashCode15 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.r;
        int iHashCode17 = (iHashCode16 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.s;
        int iHashCode18 = (iHashCode17 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        String str4 = this.t;
        return iHashCode18 + (str4 != null ? str4.hashCode() : 0);
    }
}
