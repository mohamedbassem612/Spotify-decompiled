package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vyn {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final int f;
    public final tn30 g;
    public final Long h;
    public final yoy0 i;
    public final Integer j;
    public final String k;
    public final hyn l;
    public final kyn m;
    public final kyn n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f15p;

    public vyn(String str, String str2, int i, String str3, String str4, int i2, tn30 tn30Var, Long l, yoy0 yoy0Var, Integer num, String str5, hyn hynVar, kyn kynVar, kyn kynVar2, boolean z, String str6) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
        this.f = i2;
        this.g = tn30Var;
        this.h = l;
        this.i = yoy0Var;
        this.j = num;
        this.k = str5;
        this.l = hynVar;
        this.m = kynVar;
        this.n = kynVar2;
        this.o = z;
        this.f15p = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vyn)) {
            return false;
        }
        vyn vynVar = (vyn) obj;
        return u890.j(this.a, vynVar.a) && this.b.equals(vynVar.b) && this.c == vynVar.c && this.d.equals(vynVar.d) && u890.j(this.e, vynVar.e) && this.f == vynVar.f && u890.j(this.g, vynVar.g) && u890.j(this.h, vynVar.h) && u890.j(this.i, vynVar.i) && u890.j(this.j, vynVar.j) && u890.j(this.k, vynVar.k) && this.l.equals(vynVar.l) && u890.j(this.m, vynVar.m) && u890.j(this.n, vynVar.n) && this.o == vynVar.o && this.f15p.equals(vynVar.f15p);
    }

    public final int hashCode() {
        int iD = cy30.d(ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
        String str = this.e;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        int i = this.f;
        int iC = (iHashCode + (i == 0 ? 0 : l1d.C(i))) * 31;
        tn30 tn30Var = this.g;
        int iG = xcg1.g((iC + (tn30Var == null ? 0 : tn30Var.hashCode())) * 31, 31, false);
        Long l = this.h;
        int iHashCode2 = (iG + (l == null ? 0 : l.hashCode())) * 31;
        yoy0 yoy0Var = this.i;
        int iHashCode3 = (iHashCode2 + (yoy0Var == null ? 0 : yoy0Var.hashCode())) * 31;
        Integer num = this.j;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.k;
        return this.f15p.hashCode() + xcg1.g((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31)) * 31, 31, this.o);
    }
}
