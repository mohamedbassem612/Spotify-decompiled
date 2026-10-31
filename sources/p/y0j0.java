package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class y0j0 implements a2j0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;
    public final boolean g;
    public final Boolean h;
    public final String i;

    /* JADX WARN: Multi-variable type inference failed */
    public y0j0(String str, String str2, String str3, String str4, String str5, List list, int i, Boolean bool, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = list;
        this.g = i;
        this.h = bool;
        this.i = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0j0)) {
            return false;
        }
        y0j0 y0j0Var = (y0j0) obj;
        return u890.j(this.a, y0j0Var.a) && u890.j(this.b, y0j0Var.b) && this.c.equals(y0j0Var.c) && this.d.equals(y0j0Var.d) && this.e.equals(y0j0Var.e) && this.f.equals(y0j0Var.f) && this.g == y0j0Var.g && u890.j(this.h, y0j0Var.h) && u890.j(this.i, y0j0Var.i);
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int iF = kaa0.f(this.g ? 1 : 0, f4i1.b(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31);
        Boolean bool = this.h;
        int iHashCode = (iF + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.i;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
