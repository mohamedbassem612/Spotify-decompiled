package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kbe1 {
    public final w3z0 a;
    public final boolean b;
    public final Function0 c;

    public kbe1(w3z0 w3z0Var, boolean z, Function0 function0) {
        this.a = w3z0Var;
        this.b = z;
        this.c = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbe1)) {
            return false;
        }
        kbe1 kbe1Var = (kbe1) obj;
        return u890.j(this.a, kbe1Var.a) && this.b == kbe1Var.b && u890.j(this.c, kbe1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.a.hashCode() * 31, 31, this.b);
    }
}
