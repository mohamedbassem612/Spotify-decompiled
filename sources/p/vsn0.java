package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vsn0 {
    public final List a;
    public final ssn0 b;

    public vsn0(List list, ssn0 ssn0Var) {
        this.a = list;
        this.b = ssn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vsn0)) {
            return false;
        }
        vsn0 vsn0Var = (vsn0) obj;
        return u890.j(this.a, vsn0Var.a) && u890.j(this.b, vsn0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
