package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gr2 {
    public final xs2 a;
    public final ws2 b;
    public final os2 c;

    public gr2(xs2 xs2Var, ws2 ws2Var, os2 os2Var, int i) {
        xs2Var = (i & 1) != 0 ? null : xs2Var;
        ws2Var = (i & 2) != 0 ? null : ws2Var;
        os2Var = (i & 4) != 0 ? null : os2Var;
        this.a = xs2Var;
        this.b = ws2Var;
        this.c = os2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr2)) {
            return false;
        }
        gr2 gr2Var = (gr2) obj;
        return u890.j(this.a, gr2Var.a) && u890.j(this.b, gr2Var.b) && u890.j(this.c, gr2Var.c);
    }

    public final int hashCode() {
        xs2 xs2Var = this.a;
        int iHashCode = (xs2Var == null ? 0 : xs2Var.hashCode()) * 31;
        ws2 ws2Var = this.b;
        int iHashCode2 = (iHashCode + (ws2Var == null ? 0 : ws2Var.a.hashCode())) * 31;
        os2 os2Var = this.c;
        return iHashCode2 + (os2Var != null ? os2Var.a.hashCode() : 0);
    }
}
