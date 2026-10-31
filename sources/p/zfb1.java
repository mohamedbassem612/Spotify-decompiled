package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zfb1 {
    public final Boolean a;
    public final qfd b;
    public final uw9 c;

    public zfb1(Boolean bool, qfd qfdVar, uw9 uw9Var) {
        this.a = bool;
        this.b = qfdVar;
        this.c = uw9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zfb1)) {
            return false;
        }
        zfb1 zfb1Var = (zfb1) obj;
        return u890.j(this.a, zfb1Var.a) && u890.j(this.b, zfb1Var.b) && u890.j(this.c, zfb1Var.c);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        qfd qfdVar = this.b;
        int iHashCode2 = (iHashCode + (qfdVar == null ? 0 : qfdVar.hashCode())) * 31;
        uw9 uw9Var = this.c;
        return iHashCode2 + (uw9Var != null ? uw9Var.hashCode() : 0);
    }
}
