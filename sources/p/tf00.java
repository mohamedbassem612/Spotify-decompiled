package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tf00 extends o4o1 {
    public final jj40 e;
    public final i5r f;
    public final List g;

    public tf00(jj40 jj40Var, i5r i5rVar, List list) {
        this.e = jj40Var;
        this.f = i5rVar;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf00)) {
            return false;
        }
        tf00 tf00Var = (tf00) obj;
        return u890.j(this.e, tf00Var.e) && u890.j(this.f, tf00Var.f) && u890.j(this.g, tf00Var.g);
    }

    public final int hashCode() {
        jj40 jj40Var = this.e;
        int iHashCode = (jj40Var == null ? 0 : jj40Var.hashCode()) * 31;
        i5r i5rVar = this.f;
        return this.g.hashCode() + ((iHashCode + (i5rVar != null ? i5rVar.hashCode() : 0)) * 31);
    }
}
