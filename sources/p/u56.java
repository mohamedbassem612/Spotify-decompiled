package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class u56 {
    public final String a;
    public final mvh1 b;
    public final List c;

    public u56(String str, List list, mvh1 mvh1Var) {
        this.a = str;
        this.b = mvh1Var;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u56)) {
            return false;
        }
        u56 u56Var = (u56) obj;
        return u890.j(this.a, u56Var.a) && u890.j(this.b, u56Var.b) && u890.j(this.c, u56Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
