package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i3j1 {
    public final String a;
    public final z2a b;
    public final qn30 c;
    public final List d;

    public /* synthetic */ i3j1(String str, z2a z2aVar, List list, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? w2a.a : z2aVar, (qn30) null, (i & 8) != 0 ? z6x.a : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3j1)) {
            return false;
        }
        i3j1 i3j1Var = (i3j1) obj;
        return u890.j(this.a, i3j1Var.a) && u890.j(this.b, i3j1Var.b) && u890.j(this.c, i3j1Var.c) && u890.j(this.d, i3j1Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        qn30 qn30Var = this.c;
        return this.d.hashCode() + ((iHashCode + (qn30Var == null ? 0 : qn30Var.a.hashCode())) * 31);
    }

    public i3j1(String str, z2a z2aVar, qn30 qn30Var, List list) {
        this.a = str;
        this.b = z2aVar;
        this.c = qn30Var;
        this.d = list;
    }
}
