package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class byf1 {
    public final jo70 a;
    public final List b;
    public final Long c;
    public final qtt0 d;
    public final zoy0 e;

    public byf1(jo70 jo70Var, List list, Long l, qtt0 qtt0Var, zoy0 zoy0Var) {
        this.a = jo70Var;
        this.b = list;
        this.c = l;
        this.d = qtt0Var;
        this.e = zoy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof byf1)) {
            return false;
        }
        byf1 byf1Var = (byf1) obj;
        return u890.j(this.a, byf1Var.a) && u890.j(this.b, byf1Var.b) && u890.j(this.c, byf1Var.c) && this.d == byf1Var.d && u890.j(this.e, byf1Var.e);
    }

    public final int hashCode() {
        jo70 jo70Var = this.a;
        int iHashCode = (jo70Var == null ? 0 : jo70Var.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        qtt0 qtt0Var = this.d;
        int iHashCode4 = (iHashCode3 + (qtt0Var == null ? 0 : qtt0Var.hashCode())) * 31;
        zoy0 zoy0Var = this.e;
        return iHashCode4 + (zoy0Var != null ? zoy0Var.hashCode() : 0);
    }
}
