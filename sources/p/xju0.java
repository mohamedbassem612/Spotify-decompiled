package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xju0 {
    public final String a;
    public final String b;
    public final Boolean c;
    public final boolean d;
    public final String e;
    public final List f;
    public final Boolean g;
    public final int h;
    public final String i;
    public final String j;
    public final vju0 k;
    public final bku0 l;

    public xju0(String str, String str2, Boolean bool, boolean z, String str3, List list, Boolean bool2, int i, String str4, String str5, vju0 vju0Var, bku0 bku0Var) {
        this.a = str;
        this.b = str2;
        this.c = bool;
        this.d = z;
        this.e = str3;
        this.f = list;
        this.g = bool2;
        this.h = i;
        this.i = str4;
        this.j = str5;
        this.k = vju0Var;
        this.l = bku0Var;
    }

    public static xju0 a(xju0 xju0Var, String str, Boolean bool, boolean z, String str2, ArrayList arrayList, Boolean bool2, int i, String str3, String str4, vju0 vju0Var, bku0 bku0Var, int i2) {
        if ((i2 & 1) != 0) {
            str = xju0Var.a;
        }
        String str5 = str;
        String str6 = xju0Var.b;
        if ((i2 & 4) != 0) {
            bool = xju0Var.c;
        }
        return new xju0(str5, str6, bool, (i2 & 8) != 0 ? xju0Var.d : z, (i2 & 16) != 0 ? xju0Var.e : str2, (i2 & 32) != 0 ? xju0Var.f : arrayList, (i2 & 64) != 0 ? xju0Var.g : bool2, (i2 & 128) != 0 ? xju0Var.h : i, (i2 & 256) != 0 ? xju0Var.i : str3, (i2 & 512) != 0 ? xju0Var.j : str4, (i2 & 1024) != 0 ? xju0Var.k : vju0Var, (i2 & 2048) != 0 ? xju0Var.l : bku0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xju0)) {
            return false;
        }
        xju0 xju0Var = (xju0) obj;
        return u890.j(this.a, xju0Var.a) && u890.j(this.b, xju0Var.b) && u890.j(this.c, xju0Var.c) && this.d == xju0Var.d && u890.j(this.e, xju0Var.e) && u890.j(this.f, xju0Var.f) && u890.j(this.g, xju0Var.g) && this.h == xju0Var.h && u890.j(this.i, xju0Var.i) && u890.j(this.j, xju0Var.j) && u890.j(this.k, xju0Var.k) && u890.j(this.l, xju0Var.l);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        Boolean bool = this.c;
        int iB = f4i1.b(cy30.d(xcg1.g((iD + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        Boolean bool2 = this.g;
        int iF = kaa0.f(this.h, (iB + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31);
        String str = this.i;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.j;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        vju0 vju0Var = this.k;
        int iHashCode3 = (iHashCode2 + (vju0Var == null ? 0 : vju0Var.hashCode())) * 31;
        bku0 bku0Var = this.l;
        return iHashCode3 + (bku0Var != null ? bku0Var.hashCode() : 0);
    }

    public /* synthetic */ xju0(int i, int i2, String str, String str2, String str3) {
        this(str, str2, null, false, "", z6x.a, null, (i2 & 128) != 0 ? 0 : i, null, str3, null, null);
    }
}
