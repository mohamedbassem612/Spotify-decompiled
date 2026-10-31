package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class v3a1 implements h4a1 {
    public final String a;
    public final boolean b;
    public final wea0 c;
    public final Set d;
    public final int e;

    public v3a1(String str, boolean z, wea0 wea0Var, Set set, int i) {
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
        if (!(obj instanceof v3a1)) {
            return false;
        }
        v3a1 v3a1Var = (v3a1) obj;
        return u890.j(this.a, v3a1Var.a) && this.b == v3a1Var.b && u890.j(this.c, v3a1Var.c) && this.d.equals(v3a1Var.d) && this.e == v3a1Var.e;
    }

    public final int hashCode() {
        return l1d.C(this.e) + gvg.c((this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
    }
}
