package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jn51 {
    public final String a;
    public final int b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final List h;
    public final List i;
    public final int j;

    public jn51(String str, int i, String str2, int i2, int i3, int i4, int i5, List list, List list2, int i6) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = list;
        this.i = list2;
        this.j = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jn51)) {
            return false;
        }
        jn51 jn51Var = (jn51) obj;
        return u890.j(this.a, jn51Var.a) && this.b == jn51Var.b && u890.j(this.c, jn51Var.c) && this.d == jn51Var.d && this.e == jn51Var.e && this.f == jn51Var.f && this.g == jn51Var.g && this.h.equals(jn51Var.h) && u890.j(this.i, jn51Var.i) && this.j == jn51Var.j;
    }

    public final int hashCode() {
        return Integer.hashCode(this.j) + f4i1.b(f4i1.b(kaa0.f(this.g, kaa0.f(this.f, kaa0.f(this.e, kaa0.f(this.d, cy30.d(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31), 31), 31), 31), 31, this.h), 31, this.i);
    }
}
