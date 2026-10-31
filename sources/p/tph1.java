package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tph1 {
    public final mvh1 a;
    public final boolean b;
    public final Function0 c;

    public tph1(mvh1 mvh1Var, boolean z, Function0 function0) {
        this.a = mvh1Var;
        this.b = z;
        this.c = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tph1)) {
            return false;
        }
        tph1 tph1Var = (tph1) obj;
        return u890.j(this.a, tph1Var.a) && this.b == tph1Var.b && u890.j(this.c, tph1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
