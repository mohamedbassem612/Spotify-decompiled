package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k3n0 {
    public final u3z0 a;
    public final boolean b;
    public final boolean c;
    public final Function0 d;

    public k3n0(u3z0 u3z0Var, boolean z, boolean z2, Function0 function0) {
        this.a = u3z0Var;
        this.b = z;
        this.c = z2;
        this.d = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3n0)) {
            return false;
        }
        k3n0 k3n0Var = (k3n0) obj;
        return u890.j(this.a, k3n0Var.a) && this.b == k3n0Var.b && this.c == k3n0Var.c && u890.j(this.d, k3n0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
