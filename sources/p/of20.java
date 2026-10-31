package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class of20 {
    public final List a;
    public final List b;

    public of20(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof of20)) {
            return false;
        }
        of20 of20Var = (of20) obj;
        return u890.j(this.a, of20Var.a) && u890.j(this.b, of20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
