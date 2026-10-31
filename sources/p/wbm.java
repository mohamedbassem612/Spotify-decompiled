package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wbm {
    public final uhm a;
    public final hd80 b;

    public wbm(uhm uhmVar, hd80 hd80Var) {
        this.a = uhmVar;
        this.b = hd80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wbm)) {
            return false;
        }
        wbm wbmVar = (wbm) obj;
        return this.a == wbmVar.a && this.b.equals(wbmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
