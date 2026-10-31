package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wwk implements fxk {
    public final sxk a;

    public wwk(sxk sxkVar) {
        this.a = sxkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wwk) && this.a.equals(((wwk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
