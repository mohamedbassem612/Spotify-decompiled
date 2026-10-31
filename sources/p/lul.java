package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lul implements cwl {
    public final vb8 a;

    public lul(vb8 vb8Var) {
        this.a = vb8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lul) && this.a.equals(((lul) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
