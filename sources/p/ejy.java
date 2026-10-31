package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ejy extends ljy {
    public final cjy a;

    public ejy(cjy cjyVar) {
        this.a = cjyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ejy) && u890.j(this.a, ((ejy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
