package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gpk1 {
    public final fpk1 a = dpk1.a;
    public final List b = z6x.a;
    public final int c = 1;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpk1)) {
            return false;
        }
        gpk1 gpk1Var = (gpk1) obj;
        return this.a.equals(gpk1Var.a) && Double.compare(0.0d, 0.0d) == 0 && Double.compare(0.0d, 0.0d) == 0 && this.b.equals(gpk1Var.b) && this.c == gpk1Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + cy30.f(f4i1.b(xcg1.e(0.0d, xcg1.e(0.0d, xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, false), 31, true), 31), 29791), 31, this.b), 0L, 31);
    }
}
