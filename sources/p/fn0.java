package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fn0 {
    public final List a;
    public final List b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public fn0(List list, List list2, int i, int i2, int i3, int i4, int i5) {
        this.a = list;
        this.b = list2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn0)) {
            return false;
        }
        fn0 fn0Var = (fn0) obj;
        return this.a.equals(fn0Var.a) && this.b.equals(fn0Var.b) && this.c == fn0Var.c && this.d == fn0Var.d && this.e == fn0Var.e && this.f == fn0Var.f && this.g == fn0Var.g;
    }

    public final int hashCode() {
        return l1d.C(this.g) + ab80.k(this.f, kaa0.f(this.e, kaa0.f(this.d, kaa0.f(this.c, f4i1.b(this.a.hashCode() * 31, 31, this.b), 31), 31), 31), 31);
    }
}
