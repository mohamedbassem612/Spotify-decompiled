package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b3z0 {
    public final String a;
    public final String b;
    public final String c;
    public final a3z0 d;
    public final boolean e;
    public final Function0 f;
    public final Function0 g;

    public b3z0(String str, String str2, String str3, a3z0 a3z0Var, boolean z, Function0 function0, Function0 function1) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = a3z0Var;
        this.e = z;
        this.f = function0;
        this.g = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3z0)) {
            return false;
        }
        b3z0 b3z0Var = (b3z0) obj;
        return u890.j(this.a, b3z0Var.a) && u890.j(this.b, b3z0Var.b) && u890.j(this.c, b3z0Var.c) && this.d.equals(b3z0Var.d) && this.e == b3z0Var.e && u890.j(this.f, b3z0Var.f) && u890.j(this.g, b3z0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + rjx.n(xcg1.g((this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f);
    }
}
