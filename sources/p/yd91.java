package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yd91 {
    public final vu30 a;
    public final j2i b;
    public final Function0 c;

    public yd91(int i, Function0 function0) {
        this((i & 1) != 0 ? null : igi.a, tij.a, function0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd91)) {
            return false;
        }
        yd91 yd91Var = (yd91) obj;
        return u890.j(this.a, yd91Var.a) && u890.j(this.b, yd91Var.b) && u890.j(this.c, yd91Var.c);
    }

    public final int hashCode() {
        vu30 vu30Var = this.a;
        int iHashCode = vu30Var == null ? 0 : vu30Var.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (iHashCode * 31)) * 31);
    }

    public yd91(vu30 vu30Var, j2i j2iVar, Function0 function0) {
        this.a = vu30Var;
        this.b = j2iVar;
        this.c = function0;
    }
}
