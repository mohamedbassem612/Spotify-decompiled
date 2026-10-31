package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class vmo1 extends wan1 {
    public zaa l;

    public vmo1(zaa zaaVar) {
        this.l = zaaVar;
    }

    public final void i1(p331 p331Var) {
        zaa zaaVar = this.l;
        if (zaaVar != null) {
            zaaVar.a(p331Var);
            this.l = null;
        }
    }
}
