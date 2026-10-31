package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ev21 extends fv21 {
    public final lzh a;

    public ev21(lzh lzhVar) {
        this.a = lzhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ev21) && this.a.equals(((ev21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
