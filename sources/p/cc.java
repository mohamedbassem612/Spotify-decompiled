package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cc extends dc {
    public final String b;
    public final xb c;
    public final wb d;
    public final wb e;

    public cc(String str, xb xbVar, wb wbVar, wb wbVar2) {
        super(xbVar);
        this.b = str;
        this.c = xbVar;
        this.d = wbVar;
        this.e = wbVar2;
    }

    @Override // p.dc
    public final wb a() {
        return this.d;
    }

    @Override // p.dc
    public final String b() {
        return this.b;
    }

    @Override // p.dc
    public final wb c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc)) {
            return false;
        }
        cc ccVar = (cc) obj;
        return u890.j(this.b, ccVar.b) && u890.j(this.c, ccVar.c) && u890.j(this.d, ccVar.d) && u890.j(this.e, ccVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
        wb wbVar = this.d;
        int iHashCode2 = (iHashCode + (wbVar == null ? 0 : wbVar.hashCode())) * 31;
        wb wbVar2 = this.e;
        return iHashCode2 + (wbVar2 != null ? wbVar2.hashCode() : 0);
    }
}
