package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class e5t0 {
    public final String a;
    public final o4t0 b;
    public final vxx0 c;
    public final yf20 d;

    public e5t0(String str, o4t0 o4t0Var, vxx0 vxx0Var, yf20 yf20Var) {
        this.a = str;
        this.b = o4t0Var;
        this.c = vxx0Var;
        this.d = yf20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5t0)) {
            return false;
        }
        e5t0 e5t0Var = (e5t0) obj;
        return this.a.equals(e5t0Var.a) && this.b.equals(e5t0Var.b) && u890.j(this.c, e5t0Var.c) && u890.j(this.d, e5t0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        vxx0 vxx0Var = this.c;
        int iHashCode2 = (iHashCode + (vxx0Var == null ? 0 : vxx0Var.hashCode())) * 31;
        yf20 yf20Var = this.d;
        return iHashCode2 + (yf20Var != null ? yf20Var.hashCode() : 0);
    }
}
