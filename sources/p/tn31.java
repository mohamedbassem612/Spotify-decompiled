package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tn31 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final t380 g;
    public final Bundle h;

    public /* synthetic */ tn31(String str, String str2, String str3, boolean z, boolean z2, t380 t380Var, Bundle bundle, int i) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : z, (i & 16) == 0, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : t380Var, (i & 128) != 0 ? null : bundle);
    }

    public static tn31 a(tn31 tn31Var, String str, t380 t380Var, int i) {
        if ((i & 1) != 0) {
            str = tn31Var.a;
        }
        String str2 = str;
        String str3 = tn31Var.b;
        String str4 = tn31Var.c;
        boolean z = tn31Var.d;
        boolean z2 = tn31Var.e;
        boolean z3 = tn31Var.f;
        if ((i & 64) != 0) {
            t380Var = tn31Var.g;
        }
        Bundle bundle = tn31Var.h;
        tn31Var.getClass();
        return new tn31(str2, str3, str4, z, z2, z3, t380Var, bundle);
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final boolean d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tn31)) {
            return false;
        }
        tn31 tn31Var = (tn31) obj;
        return u890.j(this.a, tn31Var.a) && u890.j(this.b, tn31Var.b) && u890.j(this.c, tn31Var.c) && this.d == tn31Var.d && this.e == tn31Var.e && this.f == tn31Var.f && u890.j(this.g, tn31Var.g) && u890.j(this.h, tn31Var.h);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iG = xcg1.g(xcg1.g(xcg1.g((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        t380 t380Var = this.g;
        int iHashCode3 = (iG + (t380Var == null ? 0 : t380Var.hashCode())) * 31;
        Bundle bundle = this.h;
        return iHashCode3 + (bundle != null ? bundle.hashCode() : 0);
    }

    public tn31(String str, String str2, String str3, boolean z, boolean z2, boolean z3, t380 t380Var, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = t380Var;
        this.h = bundle;
    }
}
