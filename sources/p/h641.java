package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h641 {
    public final jo70 a;
    public final String b;
    public final List c;
    public final Long d;
    public final d7u0 e;

    public h641(jo70 jo70Var, String str, List list, Long l, d7u0 d7u0Var) {
        this.a = jo70Var;
        this.b = str;
        this.c = list;
        this.d = l;
        this.e = d7u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h641)) {
            return false;
        }
        h641 h641Var = (h641) obj;
        return u890.j(this.a, h641Var.a) && u890.j(this.b, h641Var.b) && u890.j(this.c, h641Var.c) && u890.j(this.d, h641Var.d) && u890.j(this.e, h641Var.e);
    }

    public final int hashCode() {
        jo70 jo70Var = this.a;
        int iHashCode = (jo70Var == null ? 0 : jo70Var.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.d;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        d7u0 d7u0Var = this.e;
        return iHashCode4 + (d7u0Var != null ? d7u0Var.hashCode() : 0);
    }
}
