package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rok {
    public final gpk a;

    public rok(gpk gpkVar) {
        this.a = gpkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rok) && this.a.equals(((rok) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
