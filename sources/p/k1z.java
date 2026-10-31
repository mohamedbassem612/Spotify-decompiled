package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class k1z implements lkj0 {
    public final ben a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final ltt0 f;
    public final boolean g;
    public final int h;
    public final Integer i;
    public final boolean j;
    public final Long k;
    public final boolean l;
    public final int m;
    public final f1z n;
    public final e1z o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h1z f47p;

    public k1z(ben benVar, String str, String str2, boolean z, boolean z2, ltt0 ltt0Var, boolean z3, int i, Integer num, boolean z4, Long l, boolean z5, int i2, f1z f1zVar, e1z e1zVar, h1z h1zVar) {
        this.a = benVar;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = ltt0Var;
        this.g = z3;
        this.h = i;
        this.i = num;
        this.j = z4;
        this.k = l;
        this.l = z5;
        this.m = i2;
        this.n = f1zVar;
        this.o = e1zVar;
        this.f47p = h1zVar;
    }

    public final String a(int i) {
        String strA = this.a.a(i);
        return strA.length() == 0 ? this.n.d.a(i) : strA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1z)) {
            return false;
        }
        k1z k1zVar = (k1z) obj;
        return this.a.equals(k1zVar.a) && this.b.equals(k1zVar.b) && u890.j(this.c, k1zVar.c) && this.d == k1zVar.d && this.e == k1zVar.e && this.f == k1zVar.f && this.g == k1zVar.g && this.h == k1zVar.h && u890.j(this.i, k1zVar.i) && this.j == k1zVar.j && u890.j(this.k, k1zVar.k) && this.l == k1zVar.l && this.m == k1zVar.m && this.n.equals(k1zVar.n) && this.o == k1zVar.o && this.f47p == k1zVar.f47p;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iF = kaa0.f(this.h, xcg1.g((this.f.hashCode() + xcg1.g(xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e)) * 31, 31, this.g), 31);
        Integer num = this.i;
        int iG = xcg1.g((iF + (num == null ? 0 : num.hashCode())) * 31, 31, this.j);
        Long l = this.k;
        return this.f47p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + kaa0.f(this.m, xcg1.g((iG + (l != null ? l.hashCode() : 0)) * 31, 31, this.l), 31)) * 31)) * 31);
    }
}
