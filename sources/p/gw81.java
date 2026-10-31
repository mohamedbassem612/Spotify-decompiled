package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gw81 implements ez00 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final ell e;
    public final ArrayList f;
    public final ArrayList g;
    public final String h;
    public final long i;
    public final long j;
    public final String k;
    public final String l;

    public gw81(String str, String str2, String str3, String str4, ell ellVar, ArrayList arrayList, ArrayList arrayList2, String str5, long j, long j2, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = ellVar;
        this.f = arrayList;
        this.g = arrayList2;
        this.h = str5;
        this.i = j;
        this.j = j2;
        this.k = str6;
        this.l = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gw81)) {
            return false;
        }
        gw81 gw81Var = (gw81) obj;
        return this.a.equals(gw81Var.a) && this.b.equals(gw81Var.b) && this.c.equals(gw81Var.c) && this.d.equals(gw81Var.d) && this.e == gw81Var.e && this.f.equals(gw81Var.f) && this.g.equals(gw81Var.g) && this.h.equals(gw81Var.h) && this.i == gw81Var.i && this.j == gw81Var.j && u890.j(this.k, gw81Var.k) && u890.j(this.l, gw81Var.l);
    }

    public final int hashCode() {
        int iF = cy30.f(cy30.f(cy30.d(p3d1.f(this.g, p3d1.f(this.f, (this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31), 31), 31, this.h), this.i, 31), this.j, 31);
        String str = this.k;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.l;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
