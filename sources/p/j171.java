package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class j171 {
    public final float a;
    public final i171 b;
    public final boolean c;
    public final Function0 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final e171 h;
    public final ny51 i;
    public final tom j;
    public final boolean k;
    public final List l;
    public final List m;

    public j171(float f, i171 i171Var, boolean z, Function0 function0, boolean z2, boolean z3, boolean z4, e171 e171Var, ny51 ny51Var, tom tomVar, boolean z5, List list, List list2) {
        this.a = f;
        this.b = i171Var;
        this.c = z;
        this.d = function0;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = e171Var;
        this.i = ny51Var;
        this.j = tomVar;
        this.k = z5;
        this.l = list;
        this.m = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j171) {
            j171 j171Var = (j171) obj;
            if (p3v.c(this.a, j171Var.a) && this.b.equals(j171Var.b) && this.c == j171Var.c && u890.j(this.d, j171Var.d) && this.e == j171Var.e && this.f == j171Var.f && this.g == j171Var.g && this.h.equals(j171Var.h) && this.i == j171Var.i && this.j.equals(j171Var.j) && this.k == j171Var.k && u890.j(this.l, j171Var.l) && this.m.equals(j171Var.m)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.m.hashCode() + f4i1.b(xcg1.g((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + xcg1.g(xcg1.g(xcg1.g(rjx.n(xcg1.g((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31)) * 31)) * 31, 31, this.k), 31, this.l);
    }
}
