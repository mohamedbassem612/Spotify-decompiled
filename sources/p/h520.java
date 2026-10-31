package p;

import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class h520 {
    public final g1r a;
    public final InputStream b;

    public h520(g1r g1rVar) {
        InputStream inputStreamQ = g1rVar.b.q();
        this.a = g1rVar;
        this.b = inputStreamQ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h520)) {
            return false;
        }
        h520 h520Var = (h520) obj;
        return u890.j(this.a, h520Var.a) && this.b.equals(h520Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
