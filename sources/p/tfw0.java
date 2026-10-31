package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tfw0 {
    public final List a;
    public final vzn1 b;
    public final List c;

    public tfw0(List list, vzn1 vzn1Var, List list2) {
        this.a = list;
        this.b = vzn1Var;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tfw0)) {
            return false;
        }
        tfw0 tfw0Var = (tfw0) obj;
        return u890.j(this.a, tfw0Var.a) && u890.j(this.b, tfw0Var.b) && u890.j(this.c, tfw0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
