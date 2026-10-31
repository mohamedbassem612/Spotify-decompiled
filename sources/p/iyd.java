package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class iyd {
    public final tob1 a;
    public final tob1 b;
    public final tob1 c;
    public final tob1 d;
    public final tob1 e;
    public final tob1 f;

    public iyd(ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, ven0 ven0Var4, ven0 ven0Var5, ven0 ven0Var6) {
        this.a = ven0Var;
        this.b = ven0Var2;
        this.c = ven0Var3;
        this.d = ven0Var4;
        this.e = ven0Var5;
        this.f = ven0Var6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iyd)) {
            return false;
        }
        iyd iydVar = (iyd) obj;
        return this.a.equals(iydVar.a) && this.b.equals(iydVar.b) && this.c.equals(iydVar.c) && this.d.equals(iydVar.d) && this.e.equals(iydVar.e) && this.f.equals(iydVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
