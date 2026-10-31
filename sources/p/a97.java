package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a97 {
    public final yrd a;
    public final int b;
    public final i c;
    public final List d;
    public final tv80 e;

    public a97(yrd yrdVar, int i, i iVar, List list, tv80 tv80Var) {
        this.a = yrdVar;
        this.b = i;
        this.c = iVar;
        this.d = list;
        this.e = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a97)) {
            return false;
        }
        a97 a97Var = (a97) obj;
        return this.a.equals(a97Var.a) && this.b == a97Var.b && this.c.equals(a97Var.c) && this.d.equals(a97Var.d) && u890.j(this.e, a97Var.e);
    }

    public final int hashCode() {
        int iB = f4i1.b((this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31)) * 31, 31, this.d);
        tv80 tv80Var = this.e;
        return iB + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
