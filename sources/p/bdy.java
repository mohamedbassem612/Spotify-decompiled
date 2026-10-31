package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bdy {
    public final String a;
    public final ady b;
    public final nmy c;
    public final boolean d;

    public bdy(String str, ady adyVar, nmy nmyVar, boolean z) {
        this.a = str;
        this.b = adyVar;
        this.c = nmyVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bdy)) {
            return false;
        }
        bdy bdyVar = (bdy) obj;
        return u890.j(this.a, bdyVar.a) && u890.j(this.b, bdyVar.b) && u890.j(this.c, bdyVar.c) && this.d == bdyVar.d;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ady adyVar = this.b;
        int iHashCode2 = (iHashCode + (adyVar == null ? 0 : adyVar.hashCode())) * 31;
        nmy nmyVar = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (nmyVar != null ? nmyVar.hashCode() : 0)) * 31);
    }
}
