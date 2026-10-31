package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class set0 {
    public final String a;
    public final boolean b;
    public final String c;
    public final String d;
    public final Function0 e;
    public final boolean f;
    public final boolean g;
    public final Function0 h;
    public final String i;
    public final String j;
    public final boolean k;

    public /* synthetic */ set0(String str, boolean z, String str2, String str3, Function0 function0, boolean z2, boolean z3, Function0 function1, String str4, String str5, boolean z4, int i) {
        this(str, z, str2, str3, (i & 16) != 0 ? null : function0, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? null : function1, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? false : z4);
    }

    public static set0 a(set0 set0Var, Function0 function0, Function0 function1, int i) {
        String str = set0Var.a;
        boolean z = set0Var.b;
        String str2 = set0Var.c;
        String str3 = set0Var.d;
        boolean z2 = set0Var.f;
        boolean z3 = set0Var.g;
        if ((i & 128) != 0) {
            function1 = set0Var.h;
        }
        return new set0(str, z, str2, str3, function0, z2, z3, function1, set0Var.i, set0Var.j, set0Var.k);
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.j;
    }

    public final boolean d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof set0)) {
            return false;
        }
        set0 set0Var = (set0) obj;
        return u890.j(this.a, set0Var.a) && this.b == set0Var.b && u890.j(this.c, set0Var.c) && u890.j(this.d, set0Var.d) && u890.j(this.e, set0Var.e) && this.f == set0Var.f && this.g == set0Var.g && u890.j(this.h, set0Var.h) && u890.j(this.i, set0Var.i) && u890.j(this.j, set0Var.j) && this.k == set0Var.k;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        Function0 function0 = this.e;
        int iG = xcg1.g(xcg1.g((iD + (function0 == null ? 0 : function0.hashCode())) * 31, 31, this.f), 31, this.g);
        Function0 function1 = this.h;
        int iHashCode = (iG + (function1 == null ? 0 : function1.hashCode())) * 31;
        String str = this.i;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.j;
        return Boolean.hashCode(this.k) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public set0(String str, boolean z, String str2, String str3, Function0 function0, boolean z2, boolean z3, Function0 function1, String str4, String str5, boolean z4) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
        this.e = function0;
        this.f = z2;
        this.g = z3;
        this.h = function1;
        this.i = str4;
        this.j = str5;
        this.k = z4;
    }
}
