package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class th91 {
    public final c380 a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final List e;

    public th91(c380 c380Var, boolean z, int i, boolean z2, List list) {
        this.a = c380Var;
        this.b = z;
        this.c = i;
        this.d = z2;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof th91)) {
            return false;
        }
        th91 th91Var = (th91) obj;
        return u890.j(this.a, th91Var.a) && this.b == th91Var.b && this.c == th91Var.c && this.d == th91Var.d && u890.j(this.e, th91Var.e);
    }

    public final int hashCode() {
        int iG = xcg1.g(kaa0.f(this.c, xcg1.g(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
        List list = this.e;
        return iG + (list == null ? 0 : list.hashCode());
    }
}
