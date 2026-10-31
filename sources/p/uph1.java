package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uph1 {
    public final mvh1 a;
    public final boolean b;
    public final Function0 c;

    public uph1(mvh1 mvh1Var, boolean z, Function0 function0) {
        this.a = mvh1Var;
        this.b = z;
        this.c = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uph1)) {
            return false;
        }
        uph1 uph1Var = (uph1) obj;
        return u890.j(this.a, uph1Var.a) && this.b == uph1Var.b && u890.j(this.c, uph1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
