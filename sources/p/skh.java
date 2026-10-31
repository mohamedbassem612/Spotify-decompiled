package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class skh {
    public final c380 a;
    public final cqs0 b;
    public final cqs0 c;

    public skh(c380 c380Var, cqs0 cqs0Var, cqs0 cqs0Var2) {
        this.a = c380Var;
        this.b = cqs0Var;
        this.c = cqs0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof skh)) {
            return false;
        }
        skh skhVar = (skh) obj;
        return u890.j(this.a, skhVar.a) && u890.j(this.b, skhVar.b) && u890.j(this.c, skhVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
