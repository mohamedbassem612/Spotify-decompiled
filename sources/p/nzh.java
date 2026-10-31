package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nzh extends uzh {
    public final coc1 a;

    public nzh(coc1 coc1Var) {
        this.a = coc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nzh) && this.a.equals(((nzh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
