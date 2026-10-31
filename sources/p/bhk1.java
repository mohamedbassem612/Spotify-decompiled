package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bhk1 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public /* synthetic */ bhk1(int i, String str, String str2, String str3, List list, boolean z) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? z6x.a : list, (i & 16) == 0, false, (i & 64) == 0, (i & 128) != 0 ? true : z);
    }

    public static bhk1 a(bhk1 bhk1Var, String str, String str2, String str3, int i) {
        if ((i & 1) != 0) {
            str = bhk1Var.a;
        }
        String str4 = str;
        if ((i & 2) != 0) {
            str2 = bhk1Var.b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = bhk1Var.c;
        }
        return new bhk1(str4, str5, str3, (i & 8) != 0 ? bhk1Var.d : z6x.a, bhk1Var.e, (i & 32) != 0 ? bhk1Var.f : true, bhk1Var.g, bhk1Var.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bhk1)) {
            return false;
        }
        bhk1 bhk1Var = (bhk1) obj;
        return u890.j(this.a, bhk1Var.a) && u890.j(this.b, bhk1Var.b) && u890.j(this.c, bhk1Var.c) && u890.j(this.d, bhk1Var.d) && this.e == bhk1Var.e && this.f == bhk1Var.f && this.g == bhk1Var.g && this.h == bhk1Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + xcg1.g(xcg1.g(xcg1.g(f4i1.b(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public bhk1(String str, String str2, String str3, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
    }
}
