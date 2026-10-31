package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cxb implements dbr0 {
    public final iu30 a;
    public final j2i b;

    public cxb(iu30 iu30Var, j2i j2iVar) {
        this.a = iu30Var;
        this.b = j2iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxb)) {
            return false;
        }
        cxb cxbVar = (cxb) obj;
        return u890.j(this.a, cxbVar.a) && u890.j(this.b, cxbVar.b);
    }

    public final int hashCode() {
        iu30 iu30Var = this.a;
        return this.b.hashCode() + ((iu30Var == null ? 0 : iu30Var.hashCode()) * 31);
    }

    public /* synthetic */ cxb(j2i j2iVar) {
        this(null, j2iVar);
    }
}
