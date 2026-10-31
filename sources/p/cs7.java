package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cs7 implements es7 {
    public final js7 a;
    public final llg b;

    public cs7(js7 js7Var, llg llgVar) {
        this.a = js7Var;
        this.b = llgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs7)) {
            return false;
        }
        cs7 cs7Var = (cs7) obj;
        return this.a.equals(cs7Var.a) && u890.j(this.b, cs7Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        llg llgVar = this.b;
        return iHashCode + (llgVar == null ? 0 : llgVar.hashCode());
    }
}
