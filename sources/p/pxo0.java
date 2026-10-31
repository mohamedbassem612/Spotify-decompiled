package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pxo0 implements eyo0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final l5n0 e;
    public final String f;
    public final int g;
    public final String h;
    public final int i;

    public pxo0(String str, String str2, String str3, String str4, l5n0 l5n0Var, String str5, int i, String str6, int i2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = l5n0Var;
        this.f = str5;
        this.g = i;
        this.h = str6;
        this.i = i2;
    }

    public final List a() {
        return z6x.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxo0)) {
            return false;
        }
        pxo0 pxo0Var = (pxo0) obj;
        if (!this.a.equals(pxo0Var.a) || !this.b.equals(pxo0Var.b) || !this.c.equals(pxo0Var.c) || !this.d.equals(pxo0Var.d) || !this.e.equals(pxo0Var.e) || !u890.j(this.f, pxo0Var.f) || this.g != pxo0Var.g || !u890.j(this.h, pxo0Var.h) || this.i != pxo0Var.i) {
            return false;
        }
        z6x z6xVar = z6x.a;
        return z6xVar.equals(z6xVar);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31;
        String str = this.f;
        int iK = ab80.k(this.g, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.h;
        int iHashCode2 = (iK + (str2 == null ? 0 : str2.hashCode())) * 31;
        int i = this.i;
        return ((iHashCode2 + (i != 0 ? l1d.C(i) : 0)) * 31) + 1;
    }
}
