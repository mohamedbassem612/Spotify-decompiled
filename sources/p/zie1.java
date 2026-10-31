package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zie1 {
    public final wr21 a;
    public final String b;
    public final pxk0 c;
    public final Function0 d;
    public final vu30 e;
    public final boolean f;

    public zie1(wr21 wr21Var, String str, pxk0 pxk0Var, Function0 function0, vu30 vu30Var, boolean z) {
        this.a = wr21Var;
        this.b = str;
        this.c = pxk0Var;
        this.d = function0;
        this.e = vu30Var;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zie1)) {
            return false;
        }
        zie1 zie1Var = (zie1) obj;
        return u890.j(this.a, zie1Var.a) && u890.j(this.b, zie1Var.b) && u890.j(this.c, zie1Var.c) && u890.j(this.d, zie1Var.d) && u890.j(this.e, zie1Var.e) && this.f == zie1Var.f;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        pxk0 pxk0Var = this.c;
        return Boolean.hashCode(this.f) + hrt.g(rjx.n((iD + (pxk0Var == null ? 0 : pxk0Var.hashCode())) * 31, 31, this.d), 31, this.e);
    }
}
