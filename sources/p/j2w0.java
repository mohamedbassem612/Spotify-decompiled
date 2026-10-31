package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j2w0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final boolean f;
    public final List g;
    public final long h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final List m;
    public final boolean n;

    public j2w0(String str, String str2, boolean z, String str3, String str4, boolean z2, List list, long j, String str5, boolean z3, boolean z4, String str6, List list2, boolean z5) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        this.f = z2;
        this.g = list;
        this.h = j;
        this.i = str5;
        this.j = z3;
        this.k = z4;
        this.l = str6;
        this.m = list2;
        this.n = z5;
    }

    public static j2w0 a(j2w0 j2w0Var, boolean z, boolean z2, int i) {
        String str = j2w0Var.a;
        String str2 = j2w0Var.b;
        boolean z3 = (i & 4) != 0 ? j2w0Var.c : z;
        String str3 = j2w0Var.d;
        boolean z4 = z3;
        String str4 = j2w0Var.e;
        boolean z5 = j2w0Var.f;
        List list = j2w0Var.g;
        long j = j2w0Var.h;
        String str5 = j2w0Var.i;
        boolean z6 = (i & 512) != 0 ? j2w0Var.j : z2;
        boolean z7 = (i & 1024) != 0 ? j2w0Var.k : false;
        String str6 = j2w0Var.l;
        List list2 = j2w0Var.m;
        boolean z8 = j2w0Var.n;
        j2w0Var.getClass();
        return new j2w0(str, str2, z4, str3, str4, z5, list, j, str5, z6, z7, str6, list2, z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2w0)) {
            return false;
        }
        j2w0 j2w0Var = (j2w0) obj;
        return this.a.equals(j2w0Var.a) && this.b.equals(j2w0Var.b) && this.c == j2w0Var.c && this.d.equals(j2w0Var.d) && this.e.equals(j2w0Var.e) && this.f == j2w0Var.f && u890.j(this.g, j2w0Var.g) && this.h == j2w0Var.h && this.i.equals(j2w0Var.i) && this.j == j2w0Var.j && this.k == j2w0Var.k && u890.j(this.l, j2w0Var.l) && u890.j(this.m, j2w0Var.m) && this.n == j2w0Var.n;
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(cy30.d(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        List list = this.g;
        int iG2 = xcg1.g(xcg1.g(cy30.d(cy30.f((iG + (list == null ? 0 : list.hashCode())) * 31, this.h, 31), 31, this.i), 31, this.j), 31, this.k);
        String str = this.l;
        return Boolean.hashCode(this.n) + f4i1.b((iG2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.m);
    }
}
