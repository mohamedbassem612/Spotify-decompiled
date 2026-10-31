package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zb51 {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final List e;
    public final int f;
    public final bc51 g;

    public zb51(int i, int i2, long j, long j2, List list, int i3, bc51 bc51Var) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
        this.e = list;
        this.f = i3;
        this.g = bc51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zb51)) {
            return false;
        }
        zb51 zb51Var = (zb51) obj;
        return this.a == zb51Var.a && this.b == zb51Var.b && this.c == zb51Var.c && this.d == zb51Var.d && u890.j(this.e, zb51Var.e) && this.f == zb51Var.f && u890.j(this.g, zb51Var.g);
    }

    public final int hashCode() {
        int iK = ab80.k(this.f, f4i1.b(cy30.f(cy30.f(ab80.k(this.b, l1d.C(this.a) * 31, 31), this.c, 31), this.d, 31), 31, this.e), 31);
        bc51 bc51Var = this.g;
        return iK + (bc51Var == null ? 0 : bc51Var.hashCode());
    }
}
