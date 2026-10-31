package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ws00 {
    public final vs00 a;
    public final String b;
    public final List c;
    public final u7h d;

    public ws00(vs00 vs00Var, String str, List list, u7h u7hVar) {
        this.a = vs00Var;
        this.b = str;
        this.c = list;
        this.d = u7hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ws00)) {
            return false;
        }
        ws00 ws00Var = (ws00) obj;
        return this.a.equals(ws00Var.a) && this.b.equals(ws00Var.b) && u890.j(this.c, ws00Var.c) && u890.j(this.d, ws00Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        List list = this.c;
        int iHashCode = (iD + (list == null ? 0 : list.hashCode())) * 31;
        u7h u7hVar = this.d;
        return iHashCode + (u7hVar != null ? Long.hashCode(u7hVar.a) : 0);
    }
}
