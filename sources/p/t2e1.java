package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t2e1 extends u2e1 {
    public final String a;
    public final llg b;
    public final s171 c;

    public t2e1(String str, llg llgVar, s171 s171Var) {
        this.a = str;
        this.b = llgVar;
        this.c = s171Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2e1)) {
            return false;
        }
        t2e1 t2e1Var = (t2e1) obj;
        return u890.j(this.a, t2e1Var.a) && u890.j(this.b, t2e1Var.b) && this.c.equals(t2e1Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        llg llgVar = this.b;
        return this.c.hashCode() + ((iHashCode + (llgVar == null ? 0 : llgVar.hashCode())) * 31);
    }
}
