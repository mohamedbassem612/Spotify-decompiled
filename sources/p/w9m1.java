package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class w9m1 implements oam1 {
    public final Object a;
    public final tqw b;

    public w9m1(Object obj, tqw tqwVar) {
        this.a = obj;
        this.b = tqwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9m1)) {
            return false;
        }
        w9m1 w9m1Var = (w9m1) obj;
        return u890.j(this.a, w9m1Var.a) && u890.j(this.b, w9m1Var.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        tqw tqwVar = this.b;
        return iHashCode + (tqwVar != null ? tqwVar.hashCode() : 0);
    }
}
