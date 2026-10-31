package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rb51 {
    public final String a;
    public final iu30 b;
    public final Function0 c;
    public final iu30 d;
    public final String e;

    public rb51(String str, iu30 iu30Var, Function0 function0, iu30 iu30Var2, String str2) {
        this.a = str;
        this.b = iu30Var;
        this.c = function0;
        this.d = iu30Var2;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb51)) {
            return false;
        }
        rb51 rb51Var = (rb51) obj;
        return u890.j(this.a, rb51Var.a) && u890.j(this.b, rb51Var.b) && u890.j(this.c, rb51Var.c) && u890.j(this.d, rb51Var.d) && u890.j(this.e, rb51Var.e);
    }

    public final int hashCode() {
        int iG = ktd.g(this.d, rjx.n(ktd.g(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31);
        String str = this.e;
        return iG + (str == null ? 0 : str.hashCode());
    }
}
