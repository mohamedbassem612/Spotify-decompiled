package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class prl implements ez00 {
    public final nrl a;
    public final nrl b;
    public final nrl c;
    public final nrl d;
    public final nrl e;

    public prl(nrl nrlVar, nrl nrlVar2, nrl nrlVar3, nrl nrlVar4, nrl nrlVar5) {
        this.a = nrlVar;
        this.b = nrlVar2;
        this.c = nrlVar3;
        this.d = nrlVar4;
        this.e = nrlVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof prl)) {
            return false;
        }
        prl prlVar = (prl) obj;
        return this.a.equals(prlVar.a) && this.b.equals(prlVar.b) && this.c.equals(prlVar.c) && this.d.equals(prlVar.d) && this.e.equals(prlVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
