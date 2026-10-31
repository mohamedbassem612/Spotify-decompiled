package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sp91 {
    public final rp91 a;
    public final rp91 b;
    public final rp91 c;
    public final rp91 d;
    public final rp91 e;
    public final int f;
    public final rp91 g;
    public final int h;
    public final Set i;
    public final boolean j;
    public final int k;
    public final int l;

    public sp91(rp91 rp91Var, rp91 rp91Var2, rp91 rp91Var3, rp91 rp91Var4, rp91 rp91Var5, int i, rp91 rp91Var6, int i2, Set set, boolean z, int i3, int i4) {
        this.a = rp91Var;
        this.b = rp91Var2;
        this.c = rp91Var3;
        this.d = rp91Var4;
        this.e = rp91Var5;
        this.f = i;
        this.g = rp91Var6;
        this.h = i2;
        this.i = set;
        this.j = z;
        this.k = i3;
        this.l = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sp91)) {
            return false;
        }
        sp91 sp91Var = (sp91) obj;
        return this.a == sp91Var.a && this.b == sp91Var.b && this.c == sp91Var.c && this.d == sp91Var.d && this.e == sp91Var.e && this.f == sp91Var.f && this.g == sp91Var.g && this.h == sp91Var.h && u890.j(this.i, sp91Var.i) && this.j == sp91Var.j && this.k == sp91Var.k && this.l == sp91Var.l;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        rp91 rp91Var = this.d;
        int iHashCode2 = (iHashCode + (rp91Var == null ? 0 : rp91Var.hashCode())) * 31;
        rp91 rp91Var2 = this.e;
        int iHashCode3 = (iHashCode2 + (rp91Var2 == null ? 0 : rp91Var2.hashCode())) * 31;
        int i = this.f;
        int iC = (iHashCode3 + (i == 0 ? 0 : l1d.C(i))) * 31;
        rp91 rp91Var3 = this.g;
        int iHashCode4 = (iC + (rp91Var3 == null ? 0 : rp91Var3.hashCode())) * 31;
        int i2 = this.h;
        int iK = ab80.k(this.k, xcg1.g(gvg.c((iHashCode4 + (i2 == 0 ? 0 : l1d.C(i2))) * 31, 31, this.i), 31, this.j), 31);
        int i3 = this.l;
        return iK + (i3 != 0 ? l1d.C(i3) : 0);
    }

    public /* synthetic */ sp91(rp91 rp91Var, rp91 rp91Var2, rp91 rp91Var3) {
        this(rp91Var, rp91Var2, rp91Var3, null, null, 0, null, 0, w7x.a, false, 4, 0);
    }
}
