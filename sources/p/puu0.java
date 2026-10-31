package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class puu0 {
    public final zuu0 a;
    public final tom b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final List f;
    public final Function0 g;
    public final boolean h;
    public final mvn0 i;

    public puu0(zuu0 zuu0Var, tom tomVar, boolean z, boolean z2, boolean z3, List list, Function0 function0, boolean z4, mvn0 mvn0Var) {
        this.a = zuu0Var;
        this.b = tomVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = list;
        this.g = function0;
        this.h = z4;
        this.i = mvn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof puu0) {
            puu0 puu0Var = (puu0) obj;
            return this.a.equals(puu0Var.a) && this.b.equals(puu0Var.b) && this.c == puu0Var.c && this.d == puu0Var.d && this.e == puu0Var.e && u890.j(this.f, puu0Var.f) && this.g.equals(puu0Var.g) && this.h == puu0Var.h && this.i == puu0Var.i;
        }
        return false;
    }

    public final int hashCode() {
        return this.i.hashCode() + xcg1.g(rjx.n(f4i1.b(xcg1.g(xcg1.g(xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }
}
