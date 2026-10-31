package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gmg0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final c380 e;
    public final String f;
    public final String g;
    public final Integer h;
    public final long i;
    public final long j;
    public final boolean k;
    public final Function0 l;
    public final Integer m;
    public final Integer n;
    public final xm6 o;

    public gmg0(String str, String str2, String str3, boolean z, c380 c380Var, String str4, String str5, Integer num, long j, long j2, boolean z2, Function0 function0, Integer num2, Integer num3, xm6 xm6Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = c380Var;
        this.f = str4;
        this.g = str5;
        this.h = num;
        this.i = j;
        this.j = j2;
        this.k = z2;
        this.l = function0;
        this.m = num2;
        this.n = num3;
        this.o = xm6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gmg0)) {
            return false;
        }
        gmg0 gmg0Var = (gmg0) obj;
        if (!u890.j(this.a, gmg0Var.a) || !u890.j(this.b, gmg0Var.b) || !u890.j(this.c, gmg0Var.c) || this.d != gmg0Var.d || !u890.j(this.e, gmg0Var.e) || !u890.j(this.f, gmg0Var.f) || !u890.j(this.g, gmg0Var.g) || !u890.j(this.h, gmg0Var.h)) {
            return false;
        }
        long j = gmg0Var.i;
        int i = u7h.l;
        return z4h1.b(this.i, j) && z4h1.b(this.j, gmg0Var.j) && this.k == gmg0Var.k && this.l.equals(gmg0Var.l) && u890.j(this.m, gmg0Var.m) && u890.j(this.n, gmg0Var.n) && u890.j(this.o, gmg0Var.o);
    }

    public final int hashCode() {
        String str = this.a;
        int iD = cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int iD2 = cy30.d(kk0.f(this.e, xcg1.g((iD + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d), 31), 31, this.f);
        String str3 = this.g;
        int iHashCode = (iD2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.h;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        int i = u7h.l;
        int iN = rjx.n(xcg1.g(cy30.f(cy30.f(iHashCode2, this.i, 31), this.j, 31), 31, this.k), 31, this.l);
        Integer num2 = this.m;
        int iHashCode3 = (iN + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.n;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        xm6 xm6Var = this.o;
        return iHashCode4 + (xm6Var != null ? xm6Var.hashCode() : 0);
    }
}
