package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i5p0 implements l5p0 {
    public final hfu0 a;

    public i5p0(hfu0 hfu0Var) {
        this.a = hfu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i5p0) && u890.j(this.a, ((i5p0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
