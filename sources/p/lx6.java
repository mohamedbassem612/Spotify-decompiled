package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lx6 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final List i;

    public lx6(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx6)) {
            return false;
        }
        lx6 lx6Var = (lx6) obj;
        return u890.j(this.a, lx6Var.a) && u890.j(this.b, lx6Var.b) && u890.j(this.c, lx6Var.c) && this.d == lx6Var.d && this.e == lx6Var.e && this.f == lx6Var.f && this.g == lx6Var.g && this.h == lx6Var.h && this.i.equals(lx6Var.i);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.i.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }
}
