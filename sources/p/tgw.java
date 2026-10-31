package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tgw extends ugw {
    public final ce21 g;

    public tgw(ce21 ce21Var) {
        this.g = ce21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tgw) && this.g.equals(((tgw) obj).g);
    }

    public final int hashCode() {
        return this.g.a.hashCode();
    }
}
