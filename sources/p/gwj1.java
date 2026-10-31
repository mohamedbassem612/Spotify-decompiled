package p;

import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gwj1 {
    public final boolean a;
    public final zvj1 b;
    public final Optional c;
    public final boolean d;
    public final boolean e;
    public final twj1 f;

    public gwj1(boolean z, zvj1 zvj1Var, Optional optional, boolean z2, boolean z3, twj1 twj1Var) {
        this.a = z;
        this.b = zvj1Var;
        this.c = optional;
        this.d = z2;
        this.e = z3;
        this.f = twj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwj1)) {
            return false;
        }
        gwj1 gwj1Var = (gwj1) obj;
        return this.a == gwj1Var.a && this.b.equals(gwj1Var.b) && this.c.equals(gwj1Var.c) && this.d == gwj1Var.d && this.e == gwj1Var.e && this.f.equals(gwj1Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + xcg1.g(xcg1.g((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31, 31, this.d), 31, this.e);
    }
}
