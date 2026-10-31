package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bnm extends dnm {
    public final nma0 a;

    public bnm(nma0 nma0Var) {
        this.a = nma0Var;
    }

    @Override // p.dnm
    public final nma0 a(List list) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bnm) && ((bnm) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
