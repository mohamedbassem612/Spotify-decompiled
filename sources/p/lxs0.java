package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lxs0 {
    public final Function0 a;
    public final j2i b;

    public lxs0(Function0 function0, j2i j2iVar) {
        this.a = function0;
        this.b = j2iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lxs0) {
            lxs0 lxs0Var = (lxs0) obj;
            return u890.j(this.a, lxs0Var.a) && this.b == lxs0Var.b;
        }
        return false;
    }

    public final int hashCode() {
        Function0 function0 = this.a;
        return this.b.hashCode() + ((function0 == null ? 0 : function0.hashCode()) * 31);
    }
}
