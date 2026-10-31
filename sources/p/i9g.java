package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i9g {
    public final boolean a;
    public final f9g b;
    public final h9g c;
    public final g9g d;

    public i9g(f9g f9gVar, h9g h9gVar, g9g g9gVar, int i) {
        boolean z = (i & 1) == 0;
        f9gVar = (i & 2) != 0 ? null : f9gVar;
        h9gVar = (i & 4) != 0 ? null : h9gVar;
        g9gVar = (i & 8) != 0 ? null : g9gVar;
        this.a = z;
        this.b = f9gVar;
        this.c = h9gVar;
        this.d = g9gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9g)) {
            return false;
        }
        i9g i9gVar = (i9g) obj;
        return this.a == i9gVar.a && u890.j(this.b, i9gVar.b) && u890.j(this.c, i9gVar.c) && u890.j(this.d, i9gVar.d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        f9g f9gVar = this.b;
        int iHashCode2 = (iHashCode + (f9gVar == null ? 0 : f9gVar.hashCode())) * 31;
        h9g h9gVar = this.c;
        int iHashCode3 = (iHashCode2 + (h9gVar == null ? 0 : h9gVar.hashCode())) * 31;
        g9g g9gVar = this.d;
        return iHashCode3 + (g9gVar != null ? g9gVar.hashCode() : 0);
    }
}
