package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r0e0 {
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final String e;
    public final int f;
    public final String g;
    public final boolean h;

    public r0e0(String str, String str2, List list, String str3, String str4, int i, String str5, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = str5;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0e0)) {
            return false;
        }
        r0e0 r0e0Var = (r0e0) obj;
        return this.a.equals(r0e0Var.a) && this.b.equals(r0e0Var.b) && this.c.equals(r0e0Var.c) && this.d.equals(r0e0Var.d) && this.e.equals(r0e0Var.e) && this.f == r0e0Var.f && this.g.equals(r0e0Var.g) && this.h == r0e0Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + cy30.d(ab80.k(this.f, cy30.d(cy30.d(f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g);
    }
}
