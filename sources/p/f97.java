package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f97 {
    public final o3w a;
    public final x7i1 b;
    public final String c;

    public f97(o3w o3wVar, x7i1 x7i1Var, String str) {
        this.a = o3wVar;
        this.b = x7i1Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f97)) {
            return false;
        }
        f97 f97Var = (f97) obj;
        return u890.j(this.a, f97Var.a) && this.b.equals(f97Var.b) && this.c.equals(f97Var.c);
    }

    public final int hashCode() {
        o3w o3wVar = this.a;
        int iHashCode = o3wVar == null ? 0 : o3wVar.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (iHashCode * 31)) * 31);
    }
}
