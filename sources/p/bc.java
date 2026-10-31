package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bc extends dc {
    public final String b;
    public final wb c;
    public final wb d;
    public final xb e;
    public final boolean f;

    public /* synthetic */ bc(String str, wb wbVar, wb wbVar2, xb xbVar, boolean z, int i) {
        this(str, (i & 2) != 0 ? null : wbVar, (i & 4) != 0 ? null : wbVar2, (i & 8) != 0 ? null : xbVar, (i & 16) != 0 ? false : z);
    }

    @Override // p.dc
    public final wb a() {
        return this.c;
    }

    @Override // p.dc
    public final String b() {
        return this.b;
    }

    @Override // p.dc
    public final wb c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc)) {
            return false;
        }
        bc bcVar = (bc) obj;
        return u890.j(this.b, bcVar.b) && u890.j(this.c, bcVar.c) && u890.j(this.d, bcVar.d) && u890.j(this.e, bcVar.e) && this.f == bcVar.f;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        wb wbVar = this.c;
        int iHashCode2 = (iHashCode + (wbVar == null ? 0 : wbVar.hashCode())) * 31;
        wb wbVar2 = this.d;
        int iHashCode3 = (iHashCode2 + (wbVar2 == null ? 0 : wbVar2.hashCode())) * 31;
        xb xbVar = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode3 + (xbVar != null ? xbVar.hashCode() : 0)) * 31);
    }

    public bc(String str, wb wbVar, wb wbVar2, xb xbVar, boolean z) {
        super(xbVar);
        this.b = str;
        this.c = wbVar;
        this.d = wbVar2;
        this.e = xbVar;
        this.f = z;
    }
}
