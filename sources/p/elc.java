package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class elc extends jlc {
    public final gmc a;
    public final m6p1 b;
    public final List c;

    public elc(gmc gmcVar, m6p1 m6p1Var, List list) {
        this.a = gmcVar;
        this.b = m6p1Var;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof elc)) {
            return false;
        }
        elc elcVar = (elc) obj;
        return this.a.equals(elcVar.a) && this.b.equals(elcVar.b) && this.c.equals(elcVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
