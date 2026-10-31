package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gqm0 {
    public final List a;
    public final int b;

    public gqm0(List list, int i) {
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gqm0)) {
            return false;
        }
        gqm0 gqm0Var = (gqm0) obj;
        return u890.j(this.a, gqm0Var.a) && this.b == gqm0Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + xcg1.g(this.a.hashCode() * 31, 31, false);
    }
}
