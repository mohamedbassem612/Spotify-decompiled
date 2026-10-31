package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vqh1 implements xqh1 {
    public final gax a;

    public vqh1(gax gaxVar) {
        this.a = gaxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vqh1) && this.a.equals(((vqh1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
