package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bgf0 {
    public final String a;
    public final List b;
    public final int c;
    public final List d;
    public final String e;
    public final boolean f;
    public final rff0 g;
    public final lff0 h;
    public final agf0 i;

    public bgf0(String str, List list, int i, List list2, String str2, boolean z, rff0 rff0Var, lff0 lff0Var, agf0 agf0Var) {
        this.a = str;
        this.b = list;
        this.c = i;
        this.d = list2;
        this.e = str2;
        this.f = z;
        this.g = rff0Var;
        this.h = lff0Var;
        this.i = agf0Var;
    }

    public final lff0 a() {
        return this.h;
    }

    public final String b() {
        return this.e;
    }

    public final List c() {
        return this.b;
    }

    public final rff0 d() {
        return this.g;
    }

    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgf0)) {
            return false;
        }
        bgf0 bgf0Var = (bgf0) obj;
        return u890.j(this.a, bgf0Var.a) && this.b.equals(bgf0Var.b) && this.c == bgf0Var.c && this.d.equals(bgf0Var.d) && u890.j(this.e, bgf0Var.e) && this.f == bgf0Var.f && this.g.equals(bgf0Var.g) && u890.j(this.h, bgf0Var.h) && this.i.equals(bgf0Var.i);
    }

    public final String f() {
        return this.a;
    }

    public final List g() {
        return this.d;
    }

    public final agf0 h() {
        return this.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i.a) + ((this.h.hashCode() + ((this.g.hashCode() + xcg1.g(cy30.d(f4i1.b(ab80.k(this.c, f4i1.b(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f)) * 31)) * 31);
    }

    public final boolean i() {
        return this.f;
    }
}
