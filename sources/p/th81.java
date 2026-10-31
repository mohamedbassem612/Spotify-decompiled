package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class th81 {
    public final int a;
    public final sh81 b;
    public final t8p1 c;

    public th81(int i, sh81 sh81Var, t8p1 t8p1Var) {
        this.a = i;
        this.b = sh81Var;
        this.c = t8p1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof th81)) {
            return false;
        }
        th81 th81Var = (th81) obj;
        return this.a == th81Var.a && this.b.equals(th81Var.b) && this.c.equals(th81Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (l1d.C(this.a) * 31)) * 31);
    }
}
