package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dtl {
    public final String a;
    public final x360 b;
    public final c380 c;

    public dtl(String str, x360 x360Var, c380 c380Var) {
        this.a = str;
        this.b = x360Var;
        this.c = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtl)) {
            return false;
        }
        dtl dtlVar = (dtl) obj;
        return u890.j(this.a, dtlVar.a) && u890.j(this.b, dtlVar.b) && u890.j(this.c, dtlVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        x360 x360Var = this.b;
        return this.c.hashCode() + ((iHashCode + (x360Var == null ? 0 : x360Var.hashCode())) * 31);
    }
}
