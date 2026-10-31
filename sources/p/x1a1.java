package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class x1a1 implements q2a1 {
    public final String a;
    public final boolean b;
    public final wea0 c;
    public final Set d;
    public final int e;

    public x1a1(String str, boolean z, wea0 wea0Var, Set set, int i) {
        this.a = str;
        this.b = z;
        this.c = wea0Var;
        this.d = set;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1a1)) {
            return false;
        }
        x1a1 x1a1Var = (x1a1) obj;
        return u890.j(this.a, x1a1Var.a) && this.b == x1a1Var.b && u890.j(this.c, x1a1Var.c) && this.d.equals(x1a1Var.d) && this.e == x1a1Var.e;
    }

    public final int hashCode() {
        return l1d.C(this.e) + gvg.c((this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
    }
}
