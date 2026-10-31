package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hul implements cwl {
    public final tf3 a;

    public hul(tf3 tf3Var) {
        this.a = tf3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hul) && this.a.equals(((hul) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
