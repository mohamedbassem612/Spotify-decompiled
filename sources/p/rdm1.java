package p;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rdm1 {
    public final kdm1 a;
    public final kdm1 b;
    public final vu30 c;
    public final kdm1 d;
    public final ddm1 e;
    public final ddm1 f;
    public final String g;
    public final String h;
    public final Bitmap i;
    public final qdm1 j;
    public final qdm1 k;
    public final String l;
    public final String m;
    public final String n;
    public final vu30 o;

    public rdm1(kdm1 kdm1Var, kdm1 kdm1Var2, kdm1 kdm1Var3, kdm1 kdm1Var4, ddm1 ddm1Var, ddm1 ddm1Var2, String str, String str2, Bitmap bitmap, qdm1 qdm1Var, qdm1 qdm1Var2, String str3, String str4, String str5, kdm1 kdm1Var5) {
        this.a = kdm1Var;
        this.b = kdm1Var2;
        this.c = kdm1Var3;
        this.d = kdm1Var4;
        this.e = ddm1Var;
        this.f = ddm1Var2;
        this.g = str;
        this.h = str2;
        this.i = bitmap;
        this.j = qdm1Var;
        this.k = qdm1Var2;
        this.l = str3;
        this.m = str4;
        this.n = str5;
        this.o = kdm1Var5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rdm1) {
            rdm1 rdm1Var = (rdm1) obj;
            if (this.a == rdm1Var.a && this.b == rdm1Var.b && u890.j(this.c, rdm1Var.c) && this.d == rdm1Var.d && this.e.equals(rdm1Var.e) && this.f.equals(rdm1Var.f) && this.g.equals(rdm1Var.g) && this.h.equals(rdm1Var.h) && u890.j(this.i, rdm1Var.i) && u890.j(this.j, rdm1Var.j) && u890.j(this.k, rdm1Var.k) && this.l.equals(rdm1Var.l) && this.m.equals(rdm1Var.m) && this.n.equals(rdm1Var.n) && u890.j(this.o, rdm1Var.o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        vu30 vu30Var = this.c;
        int iHashCode2 = (this.i.hashCode() + cy30.d(cy30.d((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((iHashCode + (vu30Var == null ? 0 : vu30Var.hashCode())) * 31)) * 31)) * 31)) * 31, 31, this.g), 31, this.h)) * 31;
        qdm1 qdm1Var = this.j;
        int iHashCode3 = (iHashCode2 + (qdm1Var == null ? 0 : qdm1Var.hashCode())) * 31;
        qdm1 qdm1Var2 = this.k;
        int iD = cy30.d(cy30.d(cy30.d((iHashCode3 + (qdm1Var2 == null ? 0 : qdm1Var2.hashCode())) * 31, 31, this.l), 31, this.m), 31, this.n);
        vu30 vu30Var2 = this.o;
        return iD + (vu30Var2 != null ? vu30Var2.hashCode() : 0);
    }
}
