package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vbl extends poz0 {
    public final ai8 b;
    public final gg8 c;

    public vbl(ai8 ai8Var, gg8 gg8Var) {
        this.b = ai8Var;
        this.c = gg8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbl)) {
            return false;
        }
        vbl vblVar = (vbl) obj;
        return u890.j(this.b, vblVar.b) && u890.j(this.c, vblVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
