package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class p7a1 {
    public final jo70 a;
    public final xkk1 b;
    public final f7a1 c;

    public p7a1(jo70 jo70Var, xkk1 xkk1Var, f7a1 f7a1Var) {
        this.a = jo70Var;
        this.b = xkk1Var;
        this.c = f7a1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p7a1)) {
            return false;
        }
        p7a1 p7a1Var = (p7a1) obj;
        return this.a.equals(p7a1Var.a) && this.b.equals(p7a1Var.b) && this.c.equals(p7a1Var.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
