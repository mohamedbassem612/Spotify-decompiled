package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nq50 {
    public final List a;
    public final String b;

    public nq50(List list, String str) {
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nq50)) {
            return false;
        }
        nq50 nq50Var = (nq50) obj;
        return this.a.equals(nq50Var.a) && u890.j(this.b, nq50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
