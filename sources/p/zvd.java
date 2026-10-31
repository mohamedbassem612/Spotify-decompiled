package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zvd {
    public final tob1 a;
    public final tob1 b;

    public zvd(ven0 ven0Var, ven0 ven0Var2) {
        this.a = ven0Var;
        this.b = ven0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zvd)) {
            return false;
        }
        zvd zvdVar = (zvd) obj;
        return this.a.equals(zvdVar.a) && this.b.equals(zvdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
