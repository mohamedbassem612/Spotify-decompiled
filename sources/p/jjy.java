package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jjy extends ljy {
    public final cjy a;

    public jjy(cjy cjyVar) {
        this.a = cjyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jjy) && u890.j(this.a, ((jjy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
