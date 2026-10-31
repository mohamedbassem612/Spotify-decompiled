package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class crv implements irv {
    public final bt31 a;
    public final bt31 b;
    public final tv80 c;

    public crv(bt31 bt31Var, bt31 bt31Var2, tv80 tv80Var) {
        this.a = bt31Var;
        this.b = bt31Var2;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crv)) {
            return false;
        }
        crv crvVar = (crv) obj;
        return this.a.equals(crvVar.a) && this.b.equals(crvVar.b) && this.c.equals(crvVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
