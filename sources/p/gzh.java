package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gzh extends uzh {
    public final int a;
    public final dka b;
    public final kka c;

    public gzh(int i, dka dkaVar, kka kkaVar) {
        this.a = i;
        this.b = dkaVar;
        this.c = kkaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzh)) {
            return false;
        }
        gzh gzhVar = (gzh) obj;
        return this.a == gzhVar.a && this.b.equals(gzhVar.b) && this.c.equals(gzhVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (l1d.C(this.a) * 31)) * 31);
    }
}
