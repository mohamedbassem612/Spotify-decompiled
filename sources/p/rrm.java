package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rrm extends trm {
    public final nvm a;
    public final String b;
    public final zgo1 c;

    public rrm(nvm nvmVar, String str, zgo1 zgo1Var) {
        this.a = nvmVar;
        this.b = str;
        this.c = zgo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rrm)) {
            return false;
        }
        rrm rrmVar = (rrm) obj;
        return u890.j(this.a, rrmVar.a) && u890.j(this.b, rrmVar.b) && u890.j(this.c, rrmVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
