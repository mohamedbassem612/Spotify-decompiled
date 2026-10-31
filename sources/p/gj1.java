package p;

import android.os.Parcelable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gj1 implements ij1 {
    public final String a;
    public final int b;
    public final String c;
    public final w4i1 d;
    public final int e;
    public final int f;
    public final t7q0 g;
    public final Map h;
    public final List i;
    public final boolean j;

    static {
        Parcelable.Creator creator = w4i1.CREATOR;
    }

    public gj1(String str, int i, String str2, w4i1 w4i1Var, int i2, int i3, t7q0 t7q0Var, Map map, List list, boolean z) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = w4i1Var;
        this.e = i2;
        this.f = i3;
        this.g = t7q0Var;
        this.h = map;
        this.i = list;
        this.j = z;
    }

    public static gj1 d(gj1 gj1Var, int i, w4i1 w4i1Var, int i2, Map map, List list, boolean z, int i3) {
        String str = gj1Var.a;
        if ((i3 & 2) != 0) {
            i = gj1Var.b;
        }
        int i4 = i;
        String str2 = gj1Var.c;
        if ((i3 & 8) != 0) {
            w4i1Var = gj1Var.d;
        }
        w4i1 w4i1Var2 = w4i1Var;
        if ((i3 & 16) != 0) {
            i2 = gj1Var.e;
        }
        int i5 = i2;
        int i6 = gj1Var.f;
        t7q0 t7q0Var = gj1Var.g;
        Map map2 = (i3 & 128) != 0 ? gj1Var.h : map;
        List list2 = (i3 & 256) != 0 ? gj1Var.i : list;
        boolean z2 = (i3 & 512) != 0 ? gj1Var.j : z;
        gj1Var.getClass();
        return new gj1(str, i4, str2, w4i1Var2, i5, i6, t7q0Var, map2, list2, z2);
    }

    public final Map a() {
        return this.h;
    }

    public final int b() {
        return this.e;
    }

    public final int c() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gj1)) {
            return false;
        }
        gj1 gj1Var = (gj1) obj;
        return u890.j(this.a, gj1Var.a) && this.b == gj1Var.b && u890.j(this.c, gj1Var.c) && u890.j(this.d, gj1Var.d) && this.e == gj1Var.e && this.f == gj1Var.f && u890.j(this.g, gj1Var.g) && u890.j(this.h, gj1Var.h) && u890.j(this.i, gj1Var.i) && this.j == gj1Var.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + f4i1.b(cy30.e((this.g.hashCode() + kaa0.f(this.f, kaa0.f(this.e, ydh.d(this.d, cy30.d(ab80.k(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31), 31), 31)) * 31, 31, this.h), 31, this.i);
    }
}
