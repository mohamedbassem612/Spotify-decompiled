package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uf3 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final List i;
    public final String j;

    public uf3(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, int i, List list, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = i;
        this.i = list;
        this.j = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uf3)) {
            return false;
        }
        uf3 uf3Var = (uf3) obj;
        return u890.j(this.a, uf3Var.a) && u890.j(this.b, uf3Var.b) && u890.j(this.c, uf3Var.c) && u890.j(this.d, uf3Var.d) && this.e == uf3Var.e && this.f == uf3Var.f && this.g == uf3Var.g && this.h == uf3Var.h && this.i.equals(uf3Var.i) && u890.j(this.j, uf3Var.j);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return this.j.hashCode() + f4i1.b(ab80.k(this.h, xcg1.g(xcg1.g(xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31), 31, this.i);
    }
}
