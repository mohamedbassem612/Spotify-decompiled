package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class djy extends ljy {
    public final niy a;
    public final cjy b;

    public djy(niy niyVar, cjy cjyVar) {
        this.a = niyVar;
        this.b = cjyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djy)) {
            return false;
        }
        djy djyVar = (djy) obj;
        return this.a.equals(djyVar.a) && u890.j(this.b, djyVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
