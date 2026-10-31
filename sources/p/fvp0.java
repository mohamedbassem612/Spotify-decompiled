package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fvp0 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    public final String f;
    public final int g;
    public final boolean h;
    public final fkt i;
    public final Float j;
    public final boolean k;

    public fvp0(String str, String str2, String str3, List list, String str4, String str5, int i, boolean z, fkt fktVar, Float f, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = str4;
        this.f = str5;
        this.g = i;
        this.h = z;
        this.i = fktVar;
        this.j = f;
        this.k = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvp0)) {
            return false;
        }
        fvp0 fvp0Var = (fvp0) obj;
        return u890.j(this.a, fvp0Var.a) && u890.j(this.b, fvp0Var.b) && u890.j(this.c, fvp0Var.c) && u890.j(this.d, fvp0Var.d) && u890.j(this.e, fvp0Var.e) && u890.j(this.f, fvp0Var.f) && this.g == fvp0Var.g && this.h == fvp0Var.h && this.i == fvp0Var.i && this.j.equals(fvp0Var.j) && this.k == fvp0Var.k;
    }

    public final int hashCode() {
        int iG = xcg1.g(ab80.k(this.g, cy30.d(cy30.d(f4i1.b(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31, this.h);
        fkt fktVar = this.i;
        return Boolean.hashCode(this.k) + ((this.j.hashCode() + ((iG + (fktVar == null ? 0 : fktVar.hashCode())) * 31)) * 31);
    }
}
