package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vp30 {
    public final mp30 a;

    public vp30(mp30 mp30Var) {
        this.a = mp30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vp30) && this.a.equals(((vp30) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
