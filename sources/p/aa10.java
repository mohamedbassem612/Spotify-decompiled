package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class aa10 {
    public final Map a;
    public final boolean b;
    public final boolean c;
    public final Map d;
    public final boolean e;
    public final e4p1 f;

    public aa10(Map map, boolean z, boolean z2, Map map2, boolean z3, e4p1 e4p1Var) {
        this.a = map;
        this.b = z;
        this.c = z2;
        this.d = map2;
        this.e = z3;
        this.f = e4p1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa10)) {
            return false;
        }
        aa10 aa10Var = (aa10) obj;
        return this.a.equals(aa10Var.a) && this.b == aa10Var.b && this.c == aa10Var.c && u890.j(this.d, aa10Var.d) && this.e == aa10Var.e && this.f.equals(aa10Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + xcg1.g(cy30.e(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
