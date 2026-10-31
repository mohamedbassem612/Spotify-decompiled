package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cz41 extends q151 {
    public final List a;
    public final String b;
    public final boolean c;
    public final tv80 d;

    public cz41(List list, String str, boolean z, tv80 tv80Var) {
        this.a = list;
        this.b = str;
        this.c = z;
        this.d = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz41)) {
            return false;
        }
        cz41 cz41Var = (cz41) obj;
        return this.a.equals(cz41Var.a) && u890.j(this.b, cz41Var.b) && this.c == cz41Var.c && u890.j(this.d, cz41Var.d);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(this.a.hashCode() * 31, 961, this.b), 31, this.c);
        tv80 tv80Var = this.d;
        return iG + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
