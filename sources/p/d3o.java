package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class d3o {
    public final String a;
    public final z2o b;
    public final b3o c;

    public d3o(String str, z2o z2oVar, b3o b3oVar) {
        this.a = str;
        this.b = z2oVar;
        this.c = b3oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3o)) {
            return false;
        }
        d3o d3oVar = (d3o) obj;
        return u890.j(this.a, d3oVar.a) && u890.j(this.b, d3oVar.b) && u890.j(this.c, d3oVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        z2o z2oVar = this.b;
        int iHashCode2 = (iHashCode + (z2oVar == null ? 0 : z2oVar.hashCode())) * 31;
        b3o b3oVar = this.c;
        return iHashCode2 + (b3oVar != null ? b3oVar.hashCode() : 0);
    }
}
