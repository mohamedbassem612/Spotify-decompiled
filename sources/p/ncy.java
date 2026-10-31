package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ncy {
    public final zby a;
    public final zby b;

    public ncy(zby zbyVar, zby zbyVar2) {
        this.a = zbyVar;
        this.b = zbyVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ncy)) {
            return false;
        }
        ncy ncyVar = (ncy) obj;
        return this.a.equals(ncyVar.a) && this.b.equals(ncyVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
