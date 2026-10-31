package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xr61 {
    public final hux a;
    public final jx21 b;
    public final gn10 c;
    public final List d;
    public final List e;

    public /* synthetic */ xr61(hux huxVar, jx21 jx21Var, List list, List list2, int i) {
        this(huxVar, jx21Var, (gn10) null, list, (i & 16) != 0 ? z6x.a : list2);
    }

    public final gn10 a() {
        return this.c;
    }

    public final ryn1 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr61)) {
            return false;
        }
        xr61 xr61Var = (xr61) obj;
        return u890.j(this.a, xr61Var.a) && u890.j(this.b, xr61Var.b) && u890.j(this.c, xr61Var.c) && u890.j(this.d, xr61Var.d) && u890.j(this.e, xr61Var.e);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.b.c, this.a.hashCode() * 31, 31);
        gn10 gn10Var = this.c;
        return this.e.hashCode() + f4i1.b((iF + (gn10Var == null ? 0 : gn10Var.hashCode())) * 31, 31, this.d);
    }

    public xr61(hux huxVar, jx21 jx21Var, gn10 gn10Var, List list, List list2) {
        this.a = huxVar;
        this.b = jx21Var;
        this.c = gn10Var;
        this.d = list;
        this.e = list2;
    }
}
