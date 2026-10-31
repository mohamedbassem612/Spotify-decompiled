package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ol20 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final j9k1 i;
    public final boolean j;
    public final boolean k;
    public final List l;
    public final int m;
    public final nl20 n;
    public final bm20 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f28p;
    public final Integer q;

    public ol20(String str, String str2, int i, String str3, String str4, int i2, boolean z, boolean z2, j9k1 j9k1Var, boolean z3, boolean z4, List list, int i3, nl20 nl20Var, bm20 bm20Var, int i4, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
        this.f = i2;
        this.g = z;
        this.h = z2;
        this.i = j9k1Var;
        this.j = z3;
        this.k = z4;
        this.l = list;
        this.m = i3;
        this.n = nl20Var;
        this.o = bm20Var;
        this.f28p = i4;
        this.q = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ol20)) {
            return false;
        }
        ol20 ol20Var = (ol20) obj;
        return u890.j(this.a, ol20Var.a) && this.b.equals(ol20Var.b) && this.c == ol20Var.c && u890.j(this.d, ol20Var.d) && this.e.equals(ol20Var.e) && this.f == ol20Var.f && this.g == ol20Var.g && this.h == ol20Var.h && this.i.equals(ol20Var.i) && this.j == ol20Var.j && this.k == ol20Var.k && this.l.equals(ol20Var.l) && this.m == ol20Var.m && this.n.equals(ol20Var.n) && this.o.equals(ol20Var.o) && this.f28p == ol20Var.f28p && u890.j(this.q, ol20Var.q);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        int i = this.c;
        int iK = ab80.k(this.f28p, (this.o.hashCode() + ((this.n.hashCode() + ab80.k(this.m, f4i1.b(xcg1.g(xcg1.g((this.i.hashCode() + xcg1.g(xcg1.g(ab80.k(this.f, cy30.d(cy30.d((iD + (i == 0 ? 0 : l1d.C(i))) * 31, 31, this.d), 31, this.e), 31), 31, this.g), 31, this.h)) * 31, 31, this.j), 31, this.k), 31, this.l), 31)) * 31)) * 31, 31);
        Integer num = this.q;
        return iK + (num != null ? num.hashCode() : 0);
    }
}
