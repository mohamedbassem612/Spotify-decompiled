package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ijy extends ljy {
    public final cjy a;

    public ijy(cjy cjyVar) {
        this.a = cjyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ijy) && u890.j(this.a, ((ijy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
