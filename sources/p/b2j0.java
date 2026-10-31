package p;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class b2j0 {
    public final List a;
    public final ctf b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final jwm f;
    public final ArrayList g;
    public final Map h;

    public b2j0(List list, ctf ctfVar, boolean z, boolean z2, boolean z3, jwm jwmVar, ArrayList arrayList, Map map) {
        this.a = list;
        this.b = ctfVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = jwmVar;
        this.g = arrayList;
        this.h = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2j0)) {
            return false;
        }
        b2j0 b2j0Var = (b2j0) obj;
        return this.a.equals(b2j0Var.a) && u890.j(this.b, b2j0Var.b) && this.c == b2j0Var.c && this.d == b2j0Var.d && this.e == b2j0Var.e && this.f.equals(b2j0Var.f) && this.g.equals(b2j0Var.g) && u890.j(this.h, b2j0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + p3d1.f(this.g, (this.f.hashCode() + xcg1.g(xcg1.g(xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e)) * 31, 31);
    }
}
