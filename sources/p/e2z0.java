package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e2z0 {
    public final String a;
    public final k1z0 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final Function0 f;
    public final Function0 g;

    public e2z0(String str, k1z0 k1z0Var, boolean z, boolean z2, boolean z3, Function0 function0, Function0 function1) {
        this.a = str;
        this.b = k1z0Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = function0;
        this.g = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2z0)) {
            return false;
        }
        e2z0 e2z0Var = (e2z0) obj;
        return u890.j(this.a, e2z0Var.a) && u890.j(this.b, e2z0Var.b) && this.c == e2z0Var.c && this.d == e2z0Var.d && this.e == e2z0Var.e && u890.j(this.f, e2z0Var.f) && u890.j(this.g, e2z0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + rjx.n(xcg1.g(xcg1.g(xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }
}
