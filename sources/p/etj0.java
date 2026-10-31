package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class etj0 {
    public final long a;
    public final btj0 b;
    public final c380 c;
    public final vu30 d;
    public final wj31 e;
    public final List f;
    public final boolean g;

    public etj0(long j, btj0 btj0Var, c380 c380Var, btj0 btj0Var2, wj31 wj31Var, List list, boolean z) {
        this.a = j;
        this.b = btj0Var;
        this.c = c380Var;
        this.d = btj0Var2;
        this.e = wj31Var;
        this.f = list;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof etj0) {
            etj0 etj0Var = (etj0) obj;
            if (this.a == etj0Var.a && this.b == etj0Var.b && u890.j(this.c, etj0Var.c) && u890.j(this.d, etj0Var.d) && u890.j(this.e, etj0Var.e) && u890.j(this.f, etj0Var.f) && this.g == etj0Var.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iF = kk0.f(this.c, (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31);
        vu30 vu30Var = this.d;
        return Boolean.hashCode(this.g) + f4i1.b((this.e.hashCode() + ((iF + (vu30Var == null ? 0 : vu30Var.hashCode())) * 31)) * 31, 31, this.f);
    }
}
