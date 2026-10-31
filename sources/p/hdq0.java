package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hdq0 {
    public final int a;
    public final fdq0 b;
    public final xbq0 c;
    public final ept d;

    public hdq0(int i, fdq0 fdq0Var, xbq0 xbq0Var, ept eptVar) {
        this.a = i;
        this.b = fdq0Var;
        this.c = xbq0Var;
        this.d = eptVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdq0)) {
            return false;
        }
        hdq0 hdq0Var = (hdq0) obj;
        return this.a == hdq0Var.a && this.b.equals(hdq0Var.b) && this.c.equals(hdq0Var.c) && u890.j(this.d, hdq0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31)) * 31;
        ept eptVar = this.d;
        return iHashCode + (eptVar == null ? 0 : eptVar.hashCode());
    }
}
