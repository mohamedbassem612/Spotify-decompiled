package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hrw implements irw {
    public final qtw a;
    public final lu8 b;
    public final k7f c;
    public final iu30 d;

    public hrw(qtw qtwVar, lu8 lu8Var, k7f k7fVar, iu30 iu30Var) {
        this.a = qtwVar;
        this.b = lu8Var;
        this.c = k7fVar;
        this.d = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hrw) {
            hrw hrwVar = (hrw) obj;
            if (this.a == hrwVar.a && this.b.equals(hrwVar.b) && this.c == hrwVar.c && u890.j(this.d, hrwVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 961);
    }
}
