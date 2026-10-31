package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ztm1 {
    public final List a;
    public final List b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;

    public ztm1(List list, List list2, int i, int i2, boolean z, boolean z2) {
        this.a = list;
        this.b = list2;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ztm1)) {
            return false;
        }
        ztm1 ztm1Var = (ztm1) obj;
        return u890.j(this.a, ztm1Var.a) && this.b.equals(ztm1Var.b) && this.c == ztm1Var.c && this.d == ztm1Var.d && this.e == ztm1Var.e && this.f == ztm1Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + xcg1.g(kaa0.f(this.d, kaa0.f(this.c, f4i1.b(this.a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e);
    }
}
