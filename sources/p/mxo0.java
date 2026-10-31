package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mxo0 implements eyo0 {
    public final gef0 a;

    public mxo0(gef0 gef0Var) {
        this.a = gef0Var;
    }

    public final List a() {
        return z6x.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxo0) || !this.a.equals(((mxo0) obj).a)) {
            return false;
        }
        z6x z6xVar = z6x.a;
        return z6xVar.equals(z6xVar);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1;
    }
}
