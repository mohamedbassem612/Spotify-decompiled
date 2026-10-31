package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zc0 {
    public final yv31 a;
    public final int b;
    public final String c;
    public final List d;
    public final yc0 e;

    public zc0(yv31 yv31Var, int i, String str, List list, yc0 yc0Var) {
        this.a = yv31Var;
        this.b = i;
        this.c = str;
        this.d = list;
        this.e = yc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zc0)) {
            return false;
        }
        zc0 zc0Var = (zc0) obj;
        return u890.j(this.a, zc0Var.a) && this.b == zc0Var.b && u890.j(this.c, zc0Var.c) && u890.j(this.d, zc0Var.d) && u890.j(this.e, zc0Var.e);
    }

    public final int hashCode() {
        int iB = f4i1.b(cy30.d(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
        yc0 yc0Var = this.e;
        return iB + (yc0Var == null ? 0 : yc0Var.hashCode());
    }
}
