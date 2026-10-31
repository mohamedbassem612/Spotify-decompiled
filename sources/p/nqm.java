package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nqm {
    public final kpm a;
    public final kpm b;
    public final kpm c;

    public nqm(kpm kpmVar, kpm kpmVar2, kpm kpmVar3) {
        this.a = kpmVar;
        this.b = kpmVar2;
        this.c = kpmVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nqm)) {
            return false;
        }
        nqm nqmVar = (nqm) obj;
        return u890.j(this.a, nqmVar.a) && u890.j(this.b, nqmVar.b) && u890.j(this.c, nqmVar.c);
    }

    public final int hashCode() {
        kpm kpmVar = this.a;
        int iHashCode = (kpmVar == null ? 0 : kpmVar.hashCode()) * 31;
        kpm kpmVar2 = this.b;
        int iHashCode2 = (iHashCode + (kpmVar2 == null ? 0 : kpmVar2.hashCode())) * 31;
        kpm kpmVar3 = this.c;
        return iHashCode2 + (kpmVar3 != null ? kpmVar3.hashCode() : 0);
    }
}
