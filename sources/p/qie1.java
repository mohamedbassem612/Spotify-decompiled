package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qie1 {
    public final wr21 a;
    public final String b;
    public final pxk0 c;
    public final boolean d;
    public final boolean e;
    public final iu30 f;
    public final Function0 g;

    public qie1(wr21 wr21Var, String str, pxk0 pxk0Var, boolean z, boolean z2, iu30 iu30Var, Function0 function0) {
        this.a = wr21Var;
        this.b = str;
        this.c = pxk0Var;
        this.d = z;
        this.e = z2;
        this.f = iu30Var;
        this.g = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qie1)) {
            return false;
        }
        qie1 qie1Var = (qie1) obj;
        return u890.j(this.a, qie1Var.a) && u890.j(this.b, qie1Var.b) && u890.j(this.c, qie1Var.c) && this.d == qie1Var.d && this.e == qie1Var.e && u890.j(this.f, qie1Var.f) && u890.j(this.g, qie1Var.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        pxk0 pxk0Var = this.c;
        return this.g.hashCode() + ktd.g(this.f, xcg1.g(xcg1.g((iHashCode2 + (pxk0Var != null ? pxk0Var.hashCode() : 0)) * 31, 31, this.d), 31, this.e), 31);
    }
}
