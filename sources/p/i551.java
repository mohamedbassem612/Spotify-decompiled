package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i551 {
    public final int a;
    public final List b;
    public final int c;
    public final boolean d;
    public final xb51 e;

    public i551(int i, List list, int i2, boolean z, xb51 xb51Var) {
        this.a = i;
        this.b = list;
        this.c = i2;
        this.d = z;
        this.e = xb51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i551)) {
            return false;
        }
        i551 i551Var = (i551) obj;
        return this.a == i551Var.a && u890.j(this.b, i551Var.b) && this.c == i551Var.c && this.d == i551Var.d && u890.j(this.e, i551Var.e);
    }

    public final int hashCode() {
        int iG = xcg1.g(kaa0.f(this.c, f4i1.b(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d);
        xb51 xb51Var = this.e;
        return iG + (xb51Var == null ? 0 : Integer.hashCode(xb51Var.a));
    }
}
