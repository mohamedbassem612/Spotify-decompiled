package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dzk {
    public final pxk a;

    public dzk(pxk pxkVar) {
        this.a = pxkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dzk) && this.a.equals(((dzk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
