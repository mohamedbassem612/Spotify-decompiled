package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class doh0 {
    public final vy30 a;
    public final int b;
    public final Function0 c;

    public doh0(vy30 vy30Var, int i, Function0 function0) {
        this.a = vy30Var;
        this.b = i;
        this.c = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doh0)) {
            return false;
        }
        doh0 doh0Var = (doh0) obj;
        return u890.j(this.a, doh0Var.a) && this.b == doh0Var.b && u890.j(this.c, doh0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
