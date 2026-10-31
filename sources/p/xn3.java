package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xn3 extends qxd0 {
    public final List d;
    public final boolean e;
    public final u0p1 f;

    public xn3(List list, boolean z, u0p1 u0p1Var) {
        this.d = list;
        this.e = z;
        this.f = u0p1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xn3)) {
            return false;
        }
        xn3 xn3Var = (xn3) obj;
        return u890.j(this.d, xn3Var.d) && this.e == xn3Var.e && this.f.equals(xn3Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + xcg1.g(this.d.hashCode() * 31, 31, this.e);
    }
}
