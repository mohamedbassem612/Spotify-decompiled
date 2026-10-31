package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mtg {
    public final y1k1 a;
    public final uwj1 b;

    public mtg(y1k1 y1k1Var, uwj1 uwj1Var) {
        this.a = y1k1Var;
        this.b = uwj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mtg)) {
            return false;
        }
        mtg mtgVar = (mtg) obj;
        return this.a.equals(mtgVar.a) && this.b == mtgVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
