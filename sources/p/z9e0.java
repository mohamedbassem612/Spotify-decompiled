package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class z9e0 {
    public final int a;
    public final int b;
    public final x9e0 c;
    public final String d;
    public final String e;
    public final List f;
    public final pbf0 g;
    public final String h;
    public final pbf0 i;
    public final Function0 j;
    public final Function0 k;

    public z9e0(int i, int i2, x9e0 x9e0Var, String str, String str2, List list, pbf0 pbf0Var, String str3, pbf0 pbf0Var2, Function0 function0, Function0 function1) {
        this.a = i;
        this.b = i2;
        this.c = x9e0Var;
        this.d = str;
        this.e = str2;
        this.f = list;
        this.g = pbf0Var;
        this.h = str3;
        this.i = pbf0Var2;
        this.j = function0;
        this.k = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9e0)) {
            return false;
        }
        z9e0 z9e0Var = (z9e0) obj;
        return this.a == z9e0Var.a && this.b == z9e0Var.b && this.c.equals(z9e0Var.c) && u890.j(this.d, z9e0Var.d) && u890.j(this.e, z9e0Var.e) && this.f.equals(z9e0Var.f) && this.g.equals(z9e0Var.g) && u890.j(this.h, z9e0Var.h) && u890.j(this.i, z9e0Var.i) && u890.j(this.j, z9e0Var.j) && u890.j(this.k, z9e0Var.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + rjx.n((this.i.hashCode() + cy30.d((this.g.hashCode() + f4i1.b(cy30.d(cy30.d((this.c.hashCode() + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31)) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31, 31, this.h)) * 31, 31, this.j);
    }
}
