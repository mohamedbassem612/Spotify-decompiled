package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pyg {
    public final Object a;
    public final boolean b;
    public final Function0 c;
    public final iu30 d;
    public final boolean e;

    public pyg(Object obj, boolean z, Function0 function0, iu30 iu30Var, boolean z2) {
        this.a = obj;
        this.b = z;
        this.c = function0;
        this.d = iu30Var;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pyg)) {
            return false;
        }
        pyg pygVar = (pyg) obj;
        return u890.j(this.a, pygVar.a) && this.b == pygVar.b && u890.j(this.c, pygVar.c) && u890.j(this.d, pygVar.d) && this.e == pygVar.e;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iN = rjx.n(xcg1.g((obj == null ? 0 : obj.hashCode()) * 31, 31, this.b), 31, this.c);
        iu30 iu30Var = this.d;
        return Boolean.hashCode(this.e) + ((iN + (iu30Var != null ? iu30Var.hashCode() : 0)) * 31);
    }
}
