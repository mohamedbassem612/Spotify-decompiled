package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vqc implements brc {
    public final gax a;

    public vqc(gax gaxVar) {
        this.a = gaxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vqc) && this.a.equals(((vqc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
