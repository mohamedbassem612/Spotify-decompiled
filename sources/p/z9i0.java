package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z9i0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Function0 g;
    public final String h;
    public final String i;
    public final Function0 j;

    public z9i0(String str, String str2, String str3, String str4, String str5, String str6, Function0 function0, String str7, String str8, Function0 function1) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = function0;
        this.h = str7;
        this.i = str8;
        this.j = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9i0)) {
            return false;
        }
        z9i0 z9i0Var = (z9i0) obj;
        return u890.j(this.a, z9i0Var.a) && u890.j(this.b, z9i0Var.b) && u890.j(this.c, z9i0Var.c) && u890.j(this.d, z9i0Var.d) && u890.j(this.e, z9i0Var.e) && u890.j(this.f, z9i0Var.f) && u890.j(this.g, z9i0Var.g) && u890.j(this.h, z9i0Var.h) && u890.j(this.i, z9i0Var.i) && u890.j(this.j, z9i0Var.j);
    }

    public final int hashCode() {
        int iN = rjx.n(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        int iHashCode = (iN + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Function0 function0 = this.j;
        return iHashCode2 + (function0 != null ? function0.hashCode() : 0);
    }
}
