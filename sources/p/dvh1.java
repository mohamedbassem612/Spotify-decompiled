package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dvh1 {
    public final zl41 a;
    public final yl41 b;
    public final am41 c;

    public dvh1(zl41 zl41Var, yl41 yl41Var, am41 am41Var) {
        this.a = zl41Var;
        this.b = yl41Var;
        this.c = am41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvh1)) {
            return false;
        }
        dvh1 dvh1Var = (dvh1) obj;
        return this.a.equals(dvh1Var.a) && this.b.equals(dvh1Var.b) && this.c.equals(dvh1Var.c);
    }

    public final int hashCode() {
        return (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 961;
    }
}
