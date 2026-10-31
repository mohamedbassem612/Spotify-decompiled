package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g6l1 {
    public final String a;
    public final List b;
    public final x360 c;
    public final String d;
    public final boolean e;
    public final String f;
    public final int g;

    public g6l1(String str, List list, x360 x360Var, String str2, boolean z, String str3, int i) {
        this.a = str;
        this.b = list;
        this.c = x360Var;
        this.d = str2;
        this.e = z;
        this.f = str3;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6l1)) {
            return false;
        }
        g6l1 g6l1Var = (g6l1) obj;
        return u890.j(this.a, g6l1Var.a) && this.b.equals(g6l1Var.b) && u890.j(this.c, g6l1Var.c) && u890.j(this.d, g6l1Var.d) && this.e == g6l1Var.e && u890.j(this.f, g6l1Var.f) && this.g == g6l1Var.g;
    }

    public final int hashCode() {
        int iB = f4i1.b(this.a.hashCode() * 31, 31, this.b);
        x360 x360Var = this.c;
        return Integer.hashCode(this.g) + cy30.d(xcg1.g(cy30.d((iB + (x360Var == null ? 0 : x360Var.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
    }
}
