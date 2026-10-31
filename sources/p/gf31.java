package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gf31 {
    public final jo70 a;
    public final xkk1 b;
    public final myv0 c;
    public final Boolean d;

    public gf31(jo70 jo70Var, xkk1 xkk1Var, myv0 myv0Var, Boolean bool) {
        this.a = jo70Var;
        this.b = xkk1Var;
        this.c = myv0Var;
        this.d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf31)) {
            return false;
        }
        gf31 gf31Var = (gf31) obj;
        return this.a.equals(gf31Var.a) && u890.j(this.b, gf31Var.b) && u890.j(this.c, gf31Var.c) && u890.j(this.d, gf31Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        xkk1 xkk1Var = this.b;
        int iHashCode2 = (iHashCode + (xkk1Var == null ? 0 : xkk1Var.hashCode())) * 31;
        myv0 myv0Var = this.c;
        int iHashCode3 = (iHashCode2 + (myv0Var == null ? 0 : myv0Var.hashCode())) * 31;
        Boolean bool = this.d;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }
}
