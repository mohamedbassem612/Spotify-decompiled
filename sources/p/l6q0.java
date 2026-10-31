package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class l6q0 {
    public final a6q0 a;
    public final bb71 b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;

    public l6q0(a6q0 a6q0Var, bb71 bb71Var, int i, String str, String str2, String str3, boolean z) {
        this.a = a6q0Var;
        this.b = bb71Var;
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = z;
    }

    public final m6q0 a() {
        a6q0 z5q0Var;
        Set set = this.b.a.c.a;
        a6q0 a6q0Var = this.a;
        jnt jntVarA = set.contains(a6q0Var.g()) ? hnt.a : a6q0Var.a();
        if (a6q0Var instanceof y5q0) {
            y5q0 y5q0Var = (y5q0) a6q0Var;
            z5q0Var = new y5q0(y5q0Var.a, jntVarA, y5q0Var.c, y5q0Var.d);
        } else if (a6q0Var instanceof w5q0) {
            w5q0 w5q0Var = (w5q0) a6q0Var;
            z5q0Var = new w5q0(w5q0Var.a, w5q0Var.b, jntVarA, w5q0Var.d);
        } else if (a6q0Var instanceof x5q0) {
            x5q0 x5q0Var = (x5q0) a6q0Var;
            z5q0Var = new x5q0(x5q0Var.a, x5q0Var.b, jntVarA, x5q0Var.d);
        } else if (a6q0Var instanceof v5q0) {
            v5q0 v5q0Var = (v5q0) a6q0Var;
            z5q0Var = new v5q0(v5q0Var.a, v5q0Var.b, jntVarA, v5q0Var.d);
        } else {
            if (!(a6q0Var instanceof z5q0)) {
                eg.o();
                return null;
            }
            z5q0 z5q0Var2 = (z5q0) a6q0Var;
            z5q0Var = new z5q0(z5q0Var2.a, z5q0Var2.b, jntVarA, z5q0Var2.d);
        }
        return new m6q0(z5q0Var, this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6q0)) {
            return false;
        }
        l6q0 l6q0Var = (l6q0) obj;
        return u890.j(this.a, l6q0Var.a) && this.b.equals(l6q0Var.b) && this.c == l6q0Var.c && u890.j(this.d, l6q0Var.d) && u890.j(this.e, l6q0Var.e) && u890.j(this.f, l6q0Var.f) && this.g == l6q0Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + cy30.d(cy30.d(cy30.d(kaa0.f(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31, this.d), 31, this.e), 31, this.f);
    }
}
