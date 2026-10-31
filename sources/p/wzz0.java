package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wzz0 {
    public final vzz0 a;
    public final vzz0 b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final uzz0 f;
    public final String g;
    public final String h;
    public final List i;
    public final Function0 j;
    public final iu30 k;
    public final boolean l;
    public final qzz0 m;
    public final boolean n;
    public final String o;

    public wzz0(vzz0 vzz0Var, vzz0 vzz0Var2, String str, boolean z, boolean z2, uzz0 uzz0Var, String str2, String str3, List list, Function0 function0, iu30 iu30Var, boolean z3, qzz0 qzz0Var, boolean z4, String str4) {
        this.a = vzz0Var;
        this.b = vzz0Var2;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = uzz0Var;
        this.g = str2;
        this.h = str3;
        this.i = list;
        this.j = function0;
        this.k = iu30Var;
        this.l = z3;
        this.m = qzz0Var;
        this.n = z4;
        this.o = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wzz0)) {
            return false;
        }
        wzz0 wzz0Var = (wzz0) obj;
        return this.a.equals(wzz0Var.a) && this.b.equals(wzz0Var.b) && u890.j(this.c, wzz0Var.c) && this.d == wzz0Var.d && this.e == wzz0Var.e && this.f.equals(wzz0Var.f) && u890.j(this.g, wzz0Var.g) && u890.j(this.h, wzz0Var.h) && u890.j(this.i, wzz0Var.i) && u890.j(this.j, wzz0Var.j) && u890.j(this.k, wzz0Var.k) && this.l == wzz0Var.l && this.m.equals(wzz0Var.m) && this.n == wzz0Var.n && u890.j(this.o, wzz0Var.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + xcg1.g((this.m.hashCode() + xcg1.g(ktd.g(this.k, rjx.n(f4i1.b(cy30.d(cy30.d((this.f.hashCode() + xcg1.g(xcg1.g(cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e)) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31), 31, this.l)) * 31, 31, this.n);
    }
}
