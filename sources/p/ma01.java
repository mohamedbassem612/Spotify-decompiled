package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ma01 {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final List e;
    public final int f;
    public final int g;
    public final boolean h;
    public final qpe1 i;
    public final boolean j;

    public ma01(String str, int i, String str2, String str3, List list, int i2, int i3, boolean z, qpe1 qpe1Var, boolean z2) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = i2;
        this.g = i3;
        this.h = z;
        this.i = qpe1Var;
        this.j = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma01)) {
            return false;
        }
        ma01 ma01Var = (ma01) obj;
        return u890.j(this.a, ma01Var.a) && this.b == ma01Var.b && u890.j(this.c, ma01Var.c) && u890.j(this.d, ma01Var.d) && u890.j(this.e, ma01Var.e) && this.f == ma01Var.f && this.g == ma01Var.g && this.h == ma01Var.h && this.i == ma01Var.i && this.j == ma01Var.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + ((this.i.hashCode() + xcg1.g(kaa0.f(this.g, kaa0.f(this.f, f4i1.b(cy30.d(cy30.d(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31, this.h)) * 31);
    }

    public /* synthetic */ ma01() {
        this("", 0, "", "", z6x.a, 0, 0, false, qpe1.a, false);
    }
}
