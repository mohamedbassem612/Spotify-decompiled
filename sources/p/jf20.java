package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jf20 {
    public final List a;
    public final List b;

    public jf20(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf20)) {
            return false;
        }
        jf20 jf20Var = (jf20) obj;
        return u890.j(this.a, jf20Var.a) && u890.j(this.b, jf20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
