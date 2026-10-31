package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vme0 {
    public static final vme0 g;
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final List e;
    public final cov0 f;

    static {
        cov0 cov0Var = cov0.d;
        z6x z6xVar = z6x.a;
        g = new vme0(z6xVar, 1, 1, 1, z6xVar, cov0Var);
    }

    public vme0(List list, int i, int i2, int i3, List list2, cov0 cov0Var) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = list2;
        this.f = cov0Var;
    }

    public static vme0 a(vme0 vme0Var, List list, int i, int i2, int i3, List list2, cov0 cov0Var, int i4) {
        if ((i4 & 1) != 0) {
            list = vme0Var.a;
        }
        List list3 = list;
        if ((i4 & 2) != 0) {
            i = vme0Var.b;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            i2 = vme0Var.c;
        }
        int i6 = i2;
        if ((i4 & 8) != 0) {
            i3 = vme0Var.d;
        }
        int i7 = i3;
        if ((i4 & 16) != 0) {
            list2 = vme0Var.e;
        }
        List list4 = list2;
        if ((i4 & 32) != 0) {
            cov0Var = vme0Var.f;
        }
        vme0Var.getClass();
        return new vme0(list3, i5, i6, i7, list4, cov0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vme0)) {
            return false;
        }
        vme0 vme0Var = (vme0) obj;
        return this.a.equals(vme0Var.a) && this.b == vme0Var.b && this.c == vme0Var.c && this.d == vme0Var.d && u890.j(this.e, vme0Var.e) && u890.j(this.f, vme0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + f4i1.b(ab80.k(this.d, ab80.k(this.c, ab80.k(this.b, this.a.hashCode() * 31, 31), 31), 31), 31, this.e);
    }
}
