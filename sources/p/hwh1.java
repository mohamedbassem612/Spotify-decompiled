package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hwh1 {
    public final b4g a;

    public hwh1(b4g b4gVar) {
        this.a = b4gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hwh1) && this.a == ((hwh1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
