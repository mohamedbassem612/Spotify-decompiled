package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qu61 {
    public final int a;
    public final int b;
    public final Set c;
    public final Integer d;
    public final gzl1 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public qu61(int i, int i2, Set set, Integer num, gzl1 gzl1Var, boolean z, boolean z2, boolean z3) {
        this.a = i;
        this.b = i2;
        this.c = set;
        this.d = num;
        this.e = gzl1Var;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qu61)) {
            return false;
        }
        qu61 qu61Var = (qu61) obj;
        return this.a == qu61Var.a && this.b == qu61Var.b && u890.j(this.c, qu61Var.c) && u890.j(this.d, qu61Var.d) && this.e == qu61Var.e && this.f == qu61Var.f && this.g == qu61Var.g && this.h == qu61Var.h;
    }

    public final int hashCode() {
        int iC = gvg.c(kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
        Integer num = this.d;
        return Boolean.hashCode(this.h) + xcg1.g(xcg1.g((this.e.hashCode() + ((iC + (num == null ? 0 : num.hashCode())) * 31)) * 31, 31, this.f), 31, this.g);
    }
}
