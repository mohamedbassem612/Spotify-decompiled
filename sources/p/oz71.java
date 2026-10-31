package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class oz71 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final iu30 d;
    public final Function0 e;
    public final Function0 f;
    public final String g;

    public oz71(String str, boolean z, boolean z2, iu30 iu30Var, Function0 function0, Function0 function1, String str2) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = iu30Var;
        this.e = function0;
        this.f = function1;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oz71)) {
            return false;
        }
        oz71 oz71Var = (oz71) obj;
        return u890.j(this.a, oz71Var.a) && this.b == oz71Var.b && this.c == oz71Var.c && u890.j(this.d, oz71Var.d) && u890.j(this.e, oz71Var.e) && u890.j(this.f, oz71Var.f) && u890.j(this.g, oz71Var.g);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        iu30 iu30Var = this.d;
        int iHashCode = (iG + (iu30Var == null ? 0 : iu30Var.hashCode())) * 31;
        Function0 function0 = this.e;
        int iHashCode2 = (iHashCode + (function0 == null ? 0 : function0.hashCode())) * 31;
        Function0 function1 = this.f;
        int iHashCode3 = (iHashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31;
        String str = this.g;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }
}
