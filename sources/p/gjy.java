package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gjy extends ljy {
    public final cjy a;

    public gjy(cjy cjyVar) {
        this.a = cjyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gjy) && u890.j(this.a, ((gjy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
