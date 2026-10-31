package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f9m {
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final iu30 i;
    public final Function0 j;
    public final Function0 k;
    public final String l;
    public final xu30 m;

    public f9m(String str, String str2, String str3, Integer num, boolean z, boolean z2, boolean z3, iu30 iu30Var, Function0 function0, Function0 function1, String str4, otf0 otf0Var, int i) {
        str2 = (i & 2) != 0 ? "" : str2;
        String str5 = (i & 4) == 0 ? str3 : "";
        Integer num2 = (i & 8) != 0 ? null : num;
        boolean z4 = (i & 16) != 0 ? false : z;
        boolean z5 = (i & 32) != 0 ? false : z2;
        boolean z6 = (i & 64) != 0 ? false : z3;
        boolean z7 = (i & 128) == 0;
        iu30 iu30Var2 = (i & 256) != 0 ? null : iu30Var;
        Function0 function2 = (i & 512) != 0 ? null : function0;
        Function0 function3 = (i & 1024) != 0 ? null : function1;
        String str6 = (i & 2048) != 0 ? null : str4;
        otf0 otf0Var2 = (i & 4096) == 0 ? otf0Var : null;
        this.a = str;
        this.b = str2;
        this.c = str5;
        this.d = num2;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = iu30Var2;
        this.j = function2;
        this.k = function3;
        this.l = str6;
        this.m = otf0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9m)) {
            return false;
        }
        f9m f9mVar = (f9m) obj;
        return u890.j(this.a, f9mVar.a) && this.b.equals(f9mVar.b) && this.c.equals(f9mVar.c) && u890.j(this.d, f9mVar.d) && this.e == f9mVar.e && this.f == f9mVar.f && this.g == f9mVar.g && this.h == f9mVar.h && u890.j(this.i, f9mVar.i) && u890.j(this.j, f9mVar.j) && u890.j(this.k, f9mVar.k) && u890.j(this.l, f9mVar.l) && u890.j(this.m, f9mVar.m);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Integer num = this.d;
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g((iD + (num == null ? 0 : num.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        iu30 iu30Var = this.i;
        int iHashCode = (iG + (iu30Var == null ? 0 : iu30Var.hashCode())) * 31;
        Function0 function0 = this.j;
        int iHashCode2 = (iHashCode + (function0 == null ? 0 : function0.hashCode())) * 31;
        Function0 function1 = this.k;
        int iHashCode3 = (iHashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31;
        String str = this.l;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        xu30 xu30Var = this.m;
        return iHashCode4 + (xu30Var != null ? xu30Var.hashCode() : 0);
    }
}
