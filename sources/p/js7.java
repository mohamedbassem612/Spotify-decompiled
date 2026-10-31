package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class js7 {
    public final jo70 a;
    public final xkk1 b;
    public final hll c;

    public js7(hll hllVar, jo70 jo70Var, xkk1 xkk1Var) {
        this.a = jo70Var;
        this.b = xkk1Var;
        this.c = hllVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof js7)) {
            return false;
        }
        js7 js7Var = (js7) obj;
        return this.a.equals(js7Var.a) && this.b.equals(js7Var.b) && u890.j(this.c, js7Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        hll hllVar = this.c;
        return iHashCode + (hllVar == null ? 0 : hllVar.hashCode());
    }
}
