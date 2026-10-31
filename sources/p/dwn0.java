package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dwn0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;
    public final boolean g;
    public final a690 h;
    public final Bundle i;
    public final cwn0 j;

    public dwn0(String str, String str2, boolean z, boolean z2, int i, int i2, boolean z3, a690 a690Var, Bundle bundle, cwn0 cwn0Var) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = i;
        this.f = i2;
        this.g = z3;
        this.h = a690Var;
        this.i = bundle;
        this.j = cwn0Var;
    }

    public final cwn0 a() {
        return this.j;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwn0)) {
            return false;
        }
        dwn0 dwn0Var = (dwn0) obj;
        return u890.j(this.a, dwn0Var.a) && u890.j(this.b, dwn0Var.b) && this.c == dwn0Var.c && this.d == dwn0Var.d && this.e == dwn0Var.e && this.f == dwn0Var.f && this.g == dwn0Var.g && u890.j(this.h, dwn0Var.h) && u890.j(this.i, dwn0Var.i) && u890.j(this.j, dwn0Var.j);
    }

    public final int hashCode() {
        int iG = xcg1.g(kaa0.f(this.f, kaa0.f(this.e, xcg1.g(xcg1.g(cy30.d(this.a.hashCode() * 31, 961, this.b), 31, this.c), 31, this.d), 31), 31), 961, this.g);
        a690 a690Var = this.h;
        int iHashCode = (iG + (a690Var == null ? 0 : a690Var.a.hashCode())) * 31;
        Bundle bundle = this.i;
        int iHashCode2 = (iHashCode + (bundle == null ? 0 : bundle.hashCode())) * 31;
        cwn0 cwn0Var = this.j;
        return iHashCode2 + (cwn0Var != null ? cwn0Var.hashCode() : 0);
    }
}
