package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lvy {
    public final String a;
    public final sq51 b;
    public final sq51 c;

    public lvy(String str, sq51 sq51Var, sq51 sq51Var2) {
        this.a = str;
        this.b = sq51Var;
        this.c = sq51Var2;
    }

    public final String a() {
        return this.a;
    }

    public final sq51 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lvy)) {
            return false;
        }
        lvy lvyVar = (lvy) obj;
        return u890.j(this.a, lvyVar.a) && this.b.equals(lvyVar.b) && this.c.equals(lvyVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
