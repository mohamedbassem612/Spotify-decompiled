package p;

import java.util.Date;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cr01 {
    public final List A;
    public final boolean B;
    public final String a;
    public final String b;
    public final String c;
    public final Date d;
    public final br01 e;
    public final List f;
    public final m87 g;
    public final String h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final yq01 m;
    public final Boolean n;
    public final List o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Map f11p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final String v;
    public final zq01 w;
    public final String x;
    public final de71 y;
    public final String z;

    public cr01(String str, String str2, String str3, Date date, br01 br01Var, List list, m87 m87Var, String str4, String str5, boolean z, boolean z2, boolean z3, yq01 yq01Var, Boolean bool, List list2, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str6, zq01 zq01Var, String str7, de71 de71Var, String str8, List list3, boolean z9, int i) {
        boolean z10 = (i & 2048) != 0 ? false : z2;
        boolean z11 = (i & 4096) != 0 ? false : z3;
        boolean z12 = (2097152 & i) != 0 ? false : z8;
        List list4 = (134217728 & i) != 0 ? z6x.a : list3;
        boolean z13 = (i & 268435456) == 0 ? z9 : false;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = date;
        this.e = br01Var;
        this.f = list;
        this.g = m87Var;
        this.h = str4;
        this.i = str5;
        this.j = z;
        this.k = z10;
        this.l = z11;
        this.m = yq01Var;
        this.n = bool;
        this.o = list2;
        this.f11p = b7x.a;
        this.q = z4;
        this.r = z5;
        this.s = z6;
        this.t = z7;
        this.u = z12;
        this.v = str6;
        this.w = zq01Var;
        this.x = str7;
        this.y = de71Var;
        this.z = str8;
        this.A = list4;
        this.B = z13;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cr01)) {
            return false;
        }
        cr01 cr01Var = (cr01) obj;
        if (!u890.j(this.a, cr01Var.a) || !u890.j(this.b, cr01Var.b) || !u890.j(this.c, cr01Var.c) || !this.d.equals(cr01Var.d) || this.e != cr01Var.e || !this.f.equals(cr01Var.f)) {
            return false;
        }
        x47 x47Var = x47.a;
        return x47Var.equals(x47Var) && u890.j(this.g, cr01Var.g) && u890.j(this.h, cr01Var.h) && u890.j(this.i, cr01Var.i) && this.j == cr01Var.j && this.k == cr01Var.k && this.l == cr01Var.l && u890.j(this.m, cr01Var.m) && this.n.equals(cr01Var.n) && this.o.equals(cr01Var.o) && this.f11p.equals(cr01Var.f11p) && this.q == cr01Var.q && this.r == cr01Var.r && this.s == cr01Var.s && this.t == cr01Var.t && this.u == cr01Var.u && u890.j(this.v, cr01Var.v) && this.w.equals(cr01Var.w) && u890.j(this.x, cr01Var.x) && u890.j(this.y, cr01Var.y) && u890.j(this.z, cr01Var.z) && this.A.equals(cr01Var.A) && this.B == cr01Var.B;
    }

    public final int hashCode() {
        int iHashCode = (((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31)) * 31) - 1076158992) * 31;
        m87 m87Var = this.g;
        int iHashCode2 = (iHashCode + (m87Var == null ? 0 : m87Var.hashCode())) * 31;
        String str = this.h;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int iG = xcg1.g(xcg1.g(xcg1.g((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.j), 31, this.k), 31, this.l);
        yq01 yq01Var = this.m;
        int iG2 = xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(cy30.e(f4i1.b((this.n.hashCode() + ((iG + (yq01Var == null ? 0 : yq01Var.hashCode())) * 31)) * 31, 31, this.o), 31, this.f11p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u);
        String str3 = this.v;
        int iHashCode4 = (this.w.hashCode() + ((iG2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.x;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        de71 de71Var = this.y;
        int iHashCode6 = (iHashCode5 + (de71Var == null ? 0 : de71Var.hashCode())) * 31;
        String str5 = this.z;
        return Boolean.hashCode(this.B) + f4i1.b((iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31, 31, this.A);
    }
}
