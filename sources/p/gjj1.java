package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gjj1 {
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;

    public /* synthetic */ gjj1(int i, Boolean bool, Boolean bool2, Boolean bool3) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gjj1)) {
            return false;
        }
        gjj1 gjj1Var = (gjj1) obj;
        return u890.j(this.a, gjj1Var.a) && u890.j(this.b, gjj1Var.b) && u890.j(this.c, gjj1Var.c);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.c;
        return iHashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public gjj1(Boolean bool, Boolean bool2, Boolean bool3) {
        this.a = bool;
        this.b = bool2;
        this.c = bool3;
    }
}
