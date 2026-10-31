package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lkn implements okn {
    public final String a;
    public final String b;
    public final tv80 c;
    public final t7q0 d;
    public final List e;

    public lkn(String str, String str2, tv80 tv80Var, t7q0 t7q0Var, List list) {
        this.a = str;
        this.b = str2;
        this.c = tv80Var;
        this.d = t7q0Var;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lkn)) {
            return false;
        }
        lkn lknVar = (lkn) obj;
        return u890.j(this.a, lknVar.a) && this.b.equals(lknVar.b) && u890.j(this.c, lknVar.c) && u890.j(this.d, lknVar.d) && this.e.equals(lknVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iD = cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        tv80 tv80Var = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((iD + (tv80Var != null ? tv80Var.hashCode() : 0)) * 31)) * 31);
    }
}
