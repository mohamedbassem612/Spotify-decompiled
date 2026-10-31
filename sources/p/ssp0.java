package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ssp0 {
    public final String a;
    public final String b;
    public final List c;
    public final int d;
    public final boolean e;
    public final String f;
    public final String g;
    public final int h;
    public final usp0 i;
    public final List j;
    public final long k;
    public final boolean l;

    public ssp0(String str, String str2, List list, int i, boolean z, String str3, String str4, int i2, usp0 usp0Var, List list2, long j, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = str3;
        this.g = str4;
        this.h = i2;
        this.i = usp0Var;
        this.j = list2;
        this.k = j;
        this.l = z2;
    }

    public final int a() {
        return this.h;
    }

    public final long b() {
        return this.k;
    }

    public final int c() {
        return this.d;
    }

    public final boolean d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssp0)) {
            return false;
        }
        ssp0 ssp0Var = (ssp0) obj;
        return u890.j(this.a, ssp0Var.a) && u890.j(this.b, ssp0Var.b) && u890.j(this.c, ssp0Var.c) && this.d == ssp0Var.d && this.e == ssp0Var.e && u890.j(this.f, ssp0Var.f) && u890.j(this.g, ssp0Var.g) && this.h == ssp0Var.h && u890.j(this.i, ssp0Var.i) && u890.j(this.j, ssp0Var.j) && this.k == ssp0Var.k && this.l == ssp0Var.l;
    }

    public final int hashCode() {
        int iF = kaa0.f(this.h, cy30.d(cy30.d(xcg1.g(ab80.k(this.d, f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g), 31);
        usp0 usp0Var = this.i;
        return Boolean.hashCode(this.l) + cy30.f(f4i1.b((iF + (usp0Var == null ? 0 : usp0Var.hashCode())) * 31, 31, this.j), this.k, 31);
    }

    public /* synthetic */ ssp0(String str, String str2, List list, int i, boolean z, String str3, String str4, int i2, usp0 usp0Var, List list2, long j, int i3) {
        this(str, str2, list, i, z, (i3 & 32) != 0 ? "" : str3, (i3 & 64) != 0 ? "" : str4, (i3 & 128) != 0 ? 0 : i2, (i3 & 256) != 0 ? null : usp0Var, list2, j, false);
    }
}
