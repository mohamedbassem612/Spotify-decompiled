package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class avt0 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    public final boolean f;
    public final wrt0 g = wrt0.c;
    public final boolean h;
    public final boolean i;

    public avt0(String str, String str2, String str3, List list, String str4, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = str4;
        this.f = z;
        this.h = z2;
        this.i = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avt0)) {
            return false;
        }
        avt0 avt0Var = (avt0) obj;
        return u890.j(this.a, avt0Var.a) && u890.j(this.b, avt0Var.b) && this.c.equals(avt0Var.c) && this.d.equals(avt0Var.d) && this.e.equals(avt0Var.e) && this.f == avt0Var.f && this.g == avt0Var.g && this.h == avt0Var.h && this.i == avt0Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + xcg1.g(xcg1.g((this.g.hashCode() + xcg1.g(cy30.d(f4i1.b(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31, 31, true), 31, this.h);
    }
}
