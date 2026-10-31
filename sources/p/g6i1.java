package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g6i1 implements i6i1 {
    public final long a;
    public final String b;
    public final z5i1 c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final List h;
    public final String i;

    public g6i1(long j, String str, z5i1 z5i1Var, boolean z, String str2, String str3, String str4, List list, String str5) {
        this.a = j;
        this.b = str;
        this.c = z5i1Var;
        this.d = z;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = list;
        this.i = str5;
    }

    public static g6i1 b(g6i1 g6i1Var, long j, String str, z5i1 z5i1Var, boolean z, String str2, String str3, String str4, List list, String str5, int i) {
        if ((i & 1) != 0) {
            j = g6i1Var.a;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = g6i1Var.b;
        }
        String str6 = str;
        if ((i & 4) != 0) {
            z5i1Var = g6i1Var.c;
        }
        return new g6i1(j2, str6, z5i1Var, (i & 8) != 0 ? g6i1Var.d : z, (i & 16) != 0 ? g6i1Var.e : str2, (i & 32) != 0 ? g6i1Var.f : str3, (i & 64) != 0 ? g6i1Var.g : str4, (i & 128) != 0 ? g6i1Var.h : list, (i & 256) != 0 ? g6i1Var.i : str5);
    }

    public final z5i1 a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6i1)) {
            return false;
        }
        g6i1 g6i1Var = (g6i1) obj;
        return this.a == g6i1Var.a && u890.j(this.b, g6i1Var.b) && this.c.equals(g6i1Var.c) && this.d == g6i1Var.d && u890.j(this.e, g6i1Var.e) && u890.j(this.f, g6i1Var.f) && this.g.equals(g6i1Var.g) && u890.j(this.h, g6i1Var.h) && u890.j(this.i, g6i1Var.i);
    }

    public final String getEntityUri() {
        return this.b;
    }

    public final int hashCode() {
        int iD = cy30.d(xcg1.g((this.c.hashCode() + cy30.d(Long.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
        String str = this.f;
        int iB = f4i1.b(cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.g), 31, this.h);
        String str2 = this.i;
        return iB + (str2 != null ? str2.hashCode() : 0);
    }
}
