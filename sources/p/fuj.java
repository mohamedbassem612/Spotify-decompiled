package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fuj implements uyl {
    public final maa a;
    public final Object b;
    public final qm70 c;

    public fuj(maa maaVar, Object obj, qm70 qm70Var) {
        this.a = maaVar;
        this.b = obj;
        this.c = qm70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fuj)) {
            return false;
        }
        fuj fujVar = (fuj) obj;
        return u890.j(this.a, fujVar.a) && u890.j(this.b, fujVar.b) && this.c.equals(fujVar.c);
    }

    public final Object getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
