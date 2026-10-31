package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hjy extends ljy {
    public final cjy a;

    public hjy(cjy cjyVar) {
        this.a = cjyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hjy) && u890.j(this.a, ((hjy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
