package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class se10 {
    public final List a;
    public final td10 b;
    public final List c;
    public final List d;

    public se10(int i, List list, List list2) {
        td10 td10Var = (td10) o7h.s0(list);
        List listSubList = list.isEmpty() ? null : list.subList(1, list.size());
        list2 = (i & 8) != 0 ? null : list2;
        this.a = list;
        this.b = td10Var;
        this.c = listSubList;
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se10)) {
            return false;
        }
        se10 se10Var = (se10) obj;
        return this.a.equals(se10Var.a) && u890.j(this.b, se10Var.b) && u890.j(this.c, se10Var.c) && u890.j(this.d, se10Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        td10 td10Var = this.b;
        int iHashCode2 = (iHashCode + (td10Var == null ? 0 : td10Var.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.d;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }
}
