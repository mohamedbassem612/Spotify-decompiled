package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vx50 {
    public final v7l a;
    public final ptj b;

    public vx50(v7l v7lVar, ptj ptjVar) {
        this.a = v7lVar;
        this.b = ptjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vx50) {
            vx50 vx50Var = (vx50) obj;
            if (this.a == vx50Var.a && this.b.equals(vx50Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
