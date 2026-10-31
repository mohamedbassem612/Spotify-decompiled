package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hx90 extends jx90 {
    public final String a;
    public final pp90 b;
    public final List c;
    public final boolean d;
    public final gx90 e;

    public hx90(String str, pp90 pp90Var, c380 c380Var, boolean z, gx90 gx90Var) {
        this.a = str;
        this.b = pp90Var;
        this.c = c380Var;
        this.d = z;
        this.e = gx90Var;
    }

    @Override // p.jx90
    public final boolean a() {
        return this.d;
    }

    @Override // p.jx90
    public final pp90 b() {
        return this.b;
    }

    @Override // p.jx90
    public final List c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hx90)) {
            return false;
        }
        hx90 hx90Var = (hx90) obj;
        return this.a.equals(hx90Var.a) && u890.j(this.b, hx90Var.b) && this.c.equals(hx90Var.c) && this.d == hx90Var.d && u890.j(this.e, hx90Var.e);
    }

    public final int hashCode() {
        int iG = xcg1.g(f4i1.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        gx90 gx90Var = this.e;
        return iG + (gx90Var == null ? 0 : gx90Var.hashCode());
    }
}
