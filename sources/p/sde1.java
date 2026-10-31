package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sde1 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final z0e1 f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final List j;

    public sde1(String str, String str2, int i, int i2, String str3, z0e1 z0e1Var, boolean z, boolean z2, int i3, List list) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = str3;
        this.f = z0e1Var;
        this.g = z;
        this.h = z2;
        this.i = i3;
        this.j = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sde1)) {
            return false;
        }
        sde1 sde1Var = (sde1) obj;
        return u890.j(this.a, sde1Var.a) && u890.j(this.b, sde1Var.b) && this.c == sde1Var.c && this.d == sde1Var.d && u890.j(this.e, sde1Var.e) && this.f.equals(sde1Var.f) && this.g == sde1Var.g && this.h == sde1Var.h && this.i == sde1Var.i && this.j.equals(sde1Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ab80.k(this.i, xcg1.g(xcg1.g((this.f.hashCode() + cy30.d(kaa0.f(this.d, kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e)) * 31, 31, this.g), 31, this.h), 31);
    }
}
