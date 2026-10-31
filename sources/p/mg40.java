package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mg40 {
    public final nmu0 a;
    public final boolean b;
    public final Function0 c;

    public mg40(nmu0 nmu0Var, boolean z, Function0 function0) {
        this.a = nmu0Var;
        this.b = z;
        this.c = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mg40)) {
            return false;
        }
        mg40 mg40Var = (mg40) obj;
        return this.a == mg40Var.a && this.b == mg40Var.b && u890.j(this.c, mg40Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
