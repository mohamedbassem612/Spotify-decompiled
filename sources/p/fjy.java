package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fjy extends ljy {
    public final cjy a;

    public fjy(cjy cjyVar) {
        this.a = cjyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fjy) && u890.j(this.a, ((fjy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
