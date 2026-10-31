package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vb8 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final boolean f;
    public final String g;
    public final d8r0 h;
    public final boolean i;
    public final List j;

    public vb8(String str, String str2, String str3, String str4, int i, boolean z, String str5, d8r0 d8r0Var, boolean z2, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = z;
        this.g = str5;
        this.h = d8r0Var;
        this.i = z2;
        this.j = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb8)) {
            return false;
        }
        vb8 vb8Var = (vb8) obj;
        return u890.j(this.a, vb8Var.a) && u890.j(this.b, vb8Var.b) && u890.j(this.c, vb8Var.c) && u890.j(this.d, vb8Var.d) && this.e == vb8Var.e && this.f == vb8Var.f && u890.j(this.g, vb8Var.g) && this.h.equals(vb8Var.h) && this.i == vb8Var.i && this.j.equals(vb8Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + xcg1.g(hrt.i(this.h, cy30.d(xcg1.g(ab80.k(this.e, cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g), 31), 31, this.i);
    }
}
