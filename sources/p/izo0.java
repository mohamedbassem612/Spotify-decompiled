package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class izo0 {
    public final boolean a;
    public final hzo0 b;
    public final Function0 c;

    public izo0(boolean z, hzo0 hzo0Var, Function0 function0) {
        this.a = z;
        this.b = hzo0Var;
        this.c = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof izo0)) {
            return false;
        }
        izo0 izo0Var = (izo0) obj;
        return this.a == izo0Var.a && this.b == izo0Var.b && u890.j(this.c, izo0Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31;
        Function0 function0 = this.c;
        return iHashCode + (function0 == null ? 0 : function0.hashCode());
    }
}
