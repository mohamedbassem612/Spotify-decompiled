package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wgf {
    public final xgf a;
    public final fhf b;
    public final r771 c;

    public wgf(xgf xgfVar, fhf fhfVar, r771 r771Var) {
        this.a = xgfVar;
        this.b = fhfVar;
        this.c = r771Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wgf)) {
            return false;
        }
        wgf wgfVar = (wgf) obj;
        return u890.j(this.a, wgfVar.a) && u890.j(this.b, wgfVar.b) && u890.j(this.c, wgfVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        fhf fhfVar = this.b;
        return this.c.hashCode() + ((iHashCode + (fhfVar == null ? 0 : fhfVar.b.hashCode())) * 31);
    }
}
