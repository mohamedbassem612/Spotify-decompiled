package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z39 {
    public final String a;
    public final ArrayList b;
    public final String c;
    public final d8r0 d;
    public final String e;
    public final int f;
    public final boolean g;

    public z39(String str, ArrayList arrayList, String str2, d8r0 d8r0Var, String str3, int i, boolean z) {
        this.a = str;
        this.b = arrayList;
        this.c = str2;
        this.d = d8r0Var;
        this.e = str3;
        this.f = i;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z39)) {
            return false;
        }
        z39 z39Var = (z39) obj;
        return u890.j(this.a, z39Var.a) && this.b.equals(z39Var.b) && u890.j(this.c, z39Var.c) && this.d.equals(z39Var.d) && this.e.equals(z39Var.e) && this.f == z39Var.f && this.g == z39Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ab80.k(this.f, cy30.d(hrt.i(this.d, cy30.d(p3d1.f(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31), 31, this.e), 31);
    }
}
