package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ul91 {
    public final nl91 a;
    public final List b;

    public ul91(nl91 nl91Var, List list) {
        this.a = nl91Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul91)) {
            return false;
        }
        ul91 ul91Var = (ul91) obj;
        return this.a.equals(ul91Var.a) && this.b.equals(ul91Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
