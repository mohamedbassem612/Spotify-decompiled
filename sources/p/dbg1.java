package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dbg1 {
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final int e;
    public final int f;
    public final boolean g;
    public final int h;
    public final tcd1 i;

    public dbg1(String str, String str2, String str3, ArrayList arrayList, int i, int i2, boolean z, int i3, tcd1 tcd1Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
        this.e = i;
        this.f = i2;
        this.g = z;
        this.h = i3;
        this.i = tcd1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbg1)) {
            return false;
        }
        dbg1 dbg1Var = (dbg1) obj;
        return u890.j(this.a, dbg1Var.a) && u890.j(this.b, dbg1Var.b) && u890.j(this.c, dbg1Var.c) && this.d.equals(dbg1Var.d) && this.e == dbg1Var.e && this.f == dbg1Var.f && this.g == dbg1Var.g && this.h == dbg1Var.h && this.i == dbg1Var.i;
    }

    public final int hashCode() {
        return this.i.hashCode() + ab80.k(this.h, xcg1.g(xcg1.g(kaa0.f(this.f, kaa0.f(this.e, p3d1.f(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31), 31, true), 31, this.g), 31);
    }
}
