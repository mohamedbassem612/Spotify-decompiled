package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kjy extends ljy {
    public final niy a;
    public final cjy b;

    public kjy(niy niyVar, cjy cjyVar) {
        this.a = niyVar;
        this.b = cjyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjy)) {
            return false;
        }
        kjy kjyVar = (kjy) obj;
        return this.a.equals(kjyVar.a) && u890.j(this.b, kjyVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
