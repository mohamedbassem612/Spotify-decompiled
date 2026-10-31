package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class upk {
    public final j6k a;
    public final lhe0 b;
    public final jfk c;

    public upk(j6k j6kVar, lhe0 lhe0Var, jfk jfkVar) {
        this.a = j6kVar;
        this.b = lhe0Var;
        this.c = jfkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof upk)) {
            return false;
        }
        upk upkVar = (upk) obj;
        return u890.j(this.a, upkVar.a) && u890.j(this.b, upkVar.b) && u890.j(this.c, upkVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
