package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v56 {
    public final String a;
    public final nmu0 b;
    public final List c;

    public v56(String str, List list, nmu0 nmu0Var) {
        this.a = str;
        this.b = nmu0Var;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v56)) {
            return false;
        }
        v56 v56Var = (v56) obj;
        return u890.j(this.a, v56Var.a) && this.b == v56Var.b && u890.j(this.c, v56Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
