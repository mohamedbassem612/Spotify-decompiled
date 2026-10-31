package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bt3 {
    public final vu30 a;
    public final Function0 b;
    public final Function0 c;
    public final iu30 d;
    public final iu30 e;

    public bt3(vu30 vu30Var, Function0 function0, Function0 function1, iu30 iu30Var, iu30 iu30Var2) {
        this.a = vu30Var;
        this.b = function0;
        this.c = function1;
        this.d = iu30Var;
        this.e = iu30Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt3)) {
            return false;
        }
        bt3 bt3Var = (bt3) obj;
        return this.a.equals(bt3Var.a) && u890.j(this.b, bt3Var.b) && u890.j(this.c, bt3Var.c) && u890.j(this.d, bt3Var.d) && u890.j(this.e, bt3Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ktd.g(this.d, rjx.n(rjx.n(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }
}
