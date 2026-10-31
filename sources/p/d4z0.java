package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d4z0 {
    public final String a;
    public final int b;
    public final h4z0 c;
    public final boolean d;
    public final Function0 e;

    public d4z0(String str, int i, h4z0 h4z0Var, boolean z, Function0 function0) {
        this.a = str;
        this.b = i;
        this.c = h4z0Var;
        this.d = z;
        this.e = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4z0)) {
            return false;
        }
        d4z0 d4z0Var = (d4z0) obj;
        return u890.j(this.a, d4z0Var.a) && this.b == d4z0Var.b && u890.j(this.c, d4z0Var.c) && this.d == d4z0Var.d && u890.j(this.e, d4z0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xcg1.g((this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31)) * 31, 31, this.d);
    }
}
