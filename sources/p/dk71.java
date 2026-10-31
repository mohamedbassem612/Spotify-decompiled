package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dk71 extends jk71 {
    public final int a;
    public final rn71 b;
    public final pn71 c;

    public dk71(int i, rn71 rn71Var, pn71 pn71Var) {
        this.a = i;
        this.b = rn71Var;
        this.c = pn71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk71)) {
            return false;
        }
        dk71 dk71Var = (dk71) obj;
        return this.a == dk71Var.a && u890.j(this.b, dk71Var.b) && u890.j(this.c, dk71Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.a.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }
}
