package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class f6l1 {
    public final String a;
    public final ArrayList b;
    public final x360 c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;

    public f6l1(String str, ArrayList arrayList, x360 x360Var, boolean z, String str2, String str3, int i, int i2) {
        String str4 = (i2 & 64) != 0 ? "" : "browse:carousel";
        i = (i2 & 128) != 0 ? 0 : i;
        this.a = str;
        this.b = arrayList;
        this.c = x360Var;
        this.d = z;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = i;
    }

    public final boolean a() {
        return this.d;
    }

    public final String b() {
        return this.g;
    }

    public final x360 c() {
        return this.c;
    }

    public final int d() {
        return this.h;
    }

    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6l1)) {
            return false;
        }
        f6l1 f6l1Var = (f6l1) obj;
        return u890.j(this.a, f6l1Var.a) && this.b.equals(f6l1Var.b) && u890.j(this.c, f6l1Var.c) && this.d == f6l1Var.d && u890.j(this.e, f6l1Var.e) && u890.j(this.f, f6l1Var.f) && this.g.equals(f6l1Var.g) && this.h == f6l1Var.h;
    }

    public final List f() {
        return this.b;
    }

    public final String g() {
        return this.f;
    }

    public final int hashCode() {
        int iF = p3d1.f(this.b, this.a.hashCode() * 31, 31);
        x360 x360Var = this.c;
        return Integer.hashCode(this.h) + cy30.d(cy30.d(cy30.d(xcg1.g((iF + (x360Var == null ? 0 : x360Var.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }
}
