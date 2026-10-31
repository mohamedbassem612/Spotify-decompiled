package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oxf1 {
    public final jo70 a;
    public final List b;
    public final Long c;

    public oxf1(jo70 jo70Var, List list, Long l) {
        this.a = jo70Var;
        this.b = list;
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxf1)) {
            return false;
        }
        oxf1 oxf1Var = (oxf1) obj;
        return u890.j(this.a, oxf1Var.a) && u890.j(this.b, oxf1Var.b) && u890.j(this.c, oxf1Var.c);
    }

    public final int hashCode() {
        jo70 jo70Var = this.a;
        int iHashCode = (jo70Var == null ? 0 : jo70Var.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.c;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }
}
