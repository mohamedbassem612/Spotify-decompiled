package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class j2u0 {
    public static final i2u0 Companion = new i2u0();
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;

    public /* synthetic */ j2u0(int i, Boolean bool, Boolean bool2, Boolean bool3) {
        this.a = (i & 1) == 0 ? Boolean.FALSE : bool;
        if ((i & 2) == 0) {
            this.b = Boolean.FALSE;
        } else {
            this.b = bool2;
        }
        if ((i & 4) == 0) {
            this.c = Boolean.FALSE;
        } else {
            this.c = bool3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2u0)) {
            return false;
        }
        j2u0 j2u0Var = (j2u0) obj;
        return u890.j(this.a, j2u0Var.a) && u890.j(this.b, j2u0Var.b) && u890.j(this.c, j2u0Var.c);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.c;
        return iHashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }
}
