package p;

import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wq8 {
    public final String a;
    public final int b;
    public final String c;
    public final xig d;
    public final String e;
    public final List f;
    public final fyq0 g;
    public final boolean h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    public /* synthetic */ wq8(String str, int i, String str2, xig xigVar, String str3, List list, boolean z, int i2) {
        this(str, i, str2, xigVar, (i2 & 16) != 0 ? UUID.randomUUID().toString() : str3, list, null, (i2 & 128) != 0 ? false : z, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wq8)) {
            return false;
        }
        wq8 wq8Var = (wq8) obj;
        return u890.j(this.a, wq8Var.a) && this.b == wq8Var.b && u890.j(this.c, wq8Var.c) && u890.j(this.d, wq8Var.d) && u890.j(this.e, wq8Var.e) && u890.j(this.f, wq8Var.f) && u890.j(this.g, wq8Var.g) && this.h == wq8Var.h && u890.j(this.i, wq8Var.i) && u890.j(this.j, wq8Var.j) && u890.j(this.k, wq8Var.k) && u890.j(this.l, wq8Var.l);
    }

    public final int hashCode() {
        int iD = cy30.d(ab80.k(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        xig xigVar = this.d;
        int iB = f4i1.b(cy30.d((iD + (xigVar == null ? 0 : xigVar.hashCode())) * 31, 31, this.e), 31, this.f);
        fyq0 fyq0Var = this.g;
        int iG = xcg1.g((iB + (fyq0Var == null ? 0 : fyq0Var.hashCode())) * 31, 31, this.h);
        String str = this.i;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.j;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.k;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.l;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public wq8(String str, int i, String str2, xig xigVar, String str3, List list, fyq0 fyq0Var, boolean z, String str4, String str5, String str6, String str7) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = xigVar;
        this.e = str3;
        this.f = list;
        this.g = fyq0Var;
        this.h = z;
        this.i = str4;
        this.j = str5;
        this.k = str6;
        this.l = str7;
    }
}
