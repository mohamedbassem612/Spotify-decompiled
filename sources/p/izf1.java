package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class izf1 {
    public final String a;
    public final String b;
    public final List c;
    public final o1v d;
    public final k4m e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public boolean j = false;

    public izf1(String str, String str2, List list, o1v o1vVar, k4m k4mVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = o1vVar;
        this.e = k4mVar;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof izf1)) {
            return false;
        }
        izf1 izf1Var = (izf1) obj;
        return u890.j(this.a, izf1Var.a) && u890.j(this.b, izf1Var.b) && u890.j(this.c, izf1Var.c) && this.d == izf1Var.d && this.e == izf1Var.e && this.f == izf1Var.f && this.g == izf1Var.g && this.h == izf1Var.h && this.i == izf1Var.i && this.j == izf1Var.j;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.j) + xcg1.g(xcg1.g(xcg1.g(xcg1.g(p3d1.g(this.e, (this.d.hashCode() + f4i1.b(cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c)) * 31, 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }
}
