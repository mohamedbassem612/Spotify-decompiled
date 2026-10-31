package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nfm {
    public final Map a;
    public final bbz0 b;

    public nfm(Map map, bbz0 bbz0Var) {
        this.a = map;
        this.b = bbz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfm)) {
            return false;
        }
        nfm nfmVar = (nfm) obj;
        return u890.j(this.a, nfmVar.a) && u890.j(this.b, nfmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
