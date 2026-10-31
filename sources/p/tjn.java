package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class tjn {
    public final nvm a;
    public final zgo1 b;

    public tjn(nvm nvmVar, zgo1 zgo1Var) {
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
        if (!(obj instanceof tjn)) {
            return false;
        }
        tjn tjnVar = (tjn) obj;
        return u890.j(this.a, tjnVar.a) && u890.j(this.b, tjnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
