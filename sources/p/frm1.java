package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class frm1 {
    public final List a;
    public final List b;
    public final pr61 c;
    public final pr61 d;
    public final pr61 e;

    public frm1(List list, List list2, pr61 pr61Var, pr61 pr61Var2, pr61 pr61Var3) {
        this.a = list;
        this.b = list2;
        this.c = pr61Var;
        this.d = pr61Var2;
        this.e = pr61Var3;
    }

    public static frm1 a(frm1 frm1Var, pr61 pr61Var, pr61 pr61Var2, int i) {
        List list = frm1Var.a;
        List list2 = frm1Var.b;
        if ((i & 4) != 0) {
            pr61Var = frm1Var.c;
        }
        pr61 pr61Var3 = pr61Var;
        if ((i & 8) != 0) {
            pr61Var2 = frm1Var.d;
        }
        return new frm1(list, list2, pr61Var3, pr61Var2, frm1Var.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frm1)) {
            return false;
        }
        frm1 frm1Var = (frm1) obj;
        return u890.j(this.a, frm1Var.a) && u890.j(this.b, frm1Var.b) && this.c.equals(frm1Var.c) && this.d.equals(frm1Var.d) && this.e.equals(frm1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31);
    }
}
