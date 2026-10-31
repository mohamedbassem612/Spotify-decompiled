package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zxo0 implements eyo0 {
    public final lo91 a;

    public zxo0(lo91 lo91Var) {
        this.a = lo91Var;
    }

    public final List a() {
        return z6x.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zxo0) || !this.a.equals(((zxo0) obj).a)) {
            return false;
        }
        z6x z6xVar = z6x.a;
        return z6xVar.equals(z6xVar);
    }

    public final int hashCode() {
        return (this.a.a.hashCode() * 31) + 1;
    }
}
