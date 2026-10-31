package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class awj1 {
    public final List a;
    public final zvj1 b;

    public awj1(List list, zvj1 zvj1Var) {
        this.a = list;
        this.b = zvj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awj1)) {
            return false;
        }
        awj1 awj1Var = (awj1) obj;
        return this.a.equals(awj1Var.a) && this.b.equals(awj1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
