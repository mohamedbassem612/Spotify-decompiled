package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g5k1 extends m5k1 {
    public final Object a;
    public final String b;
    public final llg c;
    public final s171 d;

    public g5k1(Object obj, String str, llg llgVar, s171 s171Var) {
        this.a = obj;
        this.b = str;
        this.c = llgVar;
        this.d = s171Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5k1)) {
            return false;
        }
        g5k1 g5k1Var = (g5k1) obj;
        return u890.j(this.a, g5k1Var.a) && u890.j(this.b, g5k1Var.b) && u890.j(this.c, g5k1Var.c) && this.d.equals(g5k1Var.d);
    }

    public final int hashCode() {
        int iB = e331.b(this.a) * 31;
        String str = this.b;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        llg llgVar = this.c;
        return this.d.hashCode() + ((iHashCode + (llgVar != null ? llgVar.hashCode() : 0)) * 31);
    }
}
