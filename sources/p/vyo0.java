package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vyo0 {
    public final xpw a;
    public final Object b;
    public final uyo0 c;

    public vyo0(Object obj, xpw xpwVar) {
        uyo0 uyo0Var = new uyo0();
        this.a = xpwVar;
        this.b = obj;
        this.c = uyo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vyo0)) {
            return false;
        }
        vyo0 vyo0Var = (vyo0) obj;
        return u890.j(this.a, vyo0Var.a) && u890.j(this.b, vyo0Var.b) && this.c.equals(vyo0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return this.c.hashCode() + ((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31);
    }
}
