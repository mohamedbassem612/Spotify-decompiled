package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mgk {
    public final j6k a;
    public final lhe0 b;
    public final boolean c;

    public mgk(j6k j6kVar, lhe0 lhe0Var, boolean z) {
        this.a = j6kVar;
        this.b = lhe0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mgk)) {
            return false;
        }
        mgk mgkVar = (mgk) obj;
        return u890.j(this.a, mgkVar.a) && u890.j(this.b, mgkVar.b) && this.c == mgkVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
