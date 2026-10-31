package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vao extends cbo {
    public final efk a;

    public vao(efk efkVar) {
        this.a = efkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vao) && this.a.equals(((vao) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
