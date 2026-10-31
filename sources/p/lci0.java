package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lci0 {
    public final t810 a;
    public final hci0 b;
    public final iix0 c;

    public lci0(t810 t810Var, hci0 hci0Var, iix0 iix0Var) {
        this.a = t810Var;
        this.b = hci0Var;
        this.c = iix0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lci0)) {
            return false;
        }
        lci0 lci0Var = (lci0) obj;
        return this.a.equals(lci0Var.a) && u890.j(this.b, lci0Var.b) && u890.j(this.c, lci0Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        iix0 iix0Var = this.c;
        return iHashCode + (iix0Var == null ? 0 : iix0Var.hashCode());
    }
}
