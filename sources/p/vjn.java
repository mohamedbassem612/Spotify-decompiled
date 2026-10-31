package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vjn {
    public final nvm a;
    public final zgo1 b;

    public vjn(nvm nvmVar, zgo1 zgo1Var) {
        this.a = nvmVar;
        this.b = zgo1Var;
    }

    public final zgo1 a() {
        return this.b;
    }

    public final nvm b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vjn)) {
            return false;
        }
        vjn vjnVar = (vjn) obj;
        return u890.j(this.a, vjnVar.a) && u890.j(this.b, vjnVar.b);
    }

    public final int hashCode() {
        return cvm.a.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
