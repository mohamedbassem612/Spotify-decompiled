package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class quc {
    public final String a;
    public final List b;
    public final mvh1 c;

    public quc(String str, List list, mvh1 mvh1Var) {
        this.a = str;
        this.b = list;
        this.c = mvh1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof quc)) {
            return false;
        }
        quc qucVar = (quc) obj;
        return u890.j(this.a, qucVar.a) && u890.j(this.b, qucVar.b) && u890.j(this.c, qucVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }
}
