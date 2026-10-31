package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hqb {
    public yk4 a = null;
    public u84 b = null;
    public vid c = null;
    public tw4 d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqb)) {
            return false;
        }
        hqb hqbVar = (hqb) obj;
        return u890.j(this.a, hqbVar.a) && u890.j(this.b, hqbVar.b) && u890.j(this.c, hqbVar.c) && u890.j(this.d, hqbVar.d);
    }

    public final int hashCode() {
        yk4 yk4Var = this.a;
        int iHashCode = (yk4Var == null ? 0 : yk4Var.hashCode()) * 31;
        u84 u84Var = this.b;
        int iHashCode2 = (iHashCode + (u84Var == null ? 0 : u84Var.hashCode())) * 31;
        vid vidVar = this.c;
        int iHashCode3 = (iHashCode2 + (vidVar == null ? 0 : vidVar.hashCode())) * 31;
        tw4 tw4Var = this.d;
        return iHashCode3 + (tw4Var != null ? tw4Var.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ")";
    }
}
