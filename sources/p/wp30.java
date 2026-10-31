package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wp30 {
    public final jo70 a;
    public final xkk1 b;
    public final hll c;

    public wp30(hll hllVar, jo70 jo70Var, xkk1 xkk1Var) {
        this.a = jo70Var;
        this.b = xkk1Var;
        this.c = hllVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wp30)) {
            return false;
        }
        wp30 wp30Var = (wp30) obj;
        return this.a.equals(wp30Var.a) && this.b.equals(wp30Var.b) && this.c.equals(wp30Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
