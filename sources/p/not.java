package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class not implements sot {
    public final un90 a;
    public final mml b;
    public final List c;

    public not(un90 un90Var, mml mmlVar, List list) {
        this.a = un90Var;
        this.b = mmlVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof not)) {
            return false;
        }
        not notVar = (not) obj;
        return u890.j(this.a, notVar.a) && u890.j(this.b, notVar.b) && u890.j(this.c, notVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
