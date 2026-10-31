package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dyo0 implements eyo0 {
    public final val1 a;

    public dyo0(val1 val1Var) {
        this.a = val1Var;
    }

    public final List a() {
        return z6x.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyo0) || !this.a.equals(((dyo0) obj).a)) {
            return false;
        }
        z6x z6xVar = z6x.a;
        return z6xVar.equals(z6xVar);
    }

    public final int hashCode() {
        return (this.a.a.hashCode() * 31) + 1;
    }
}
