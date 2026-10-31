package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y10 {
    public final boolean a;

    public final boolean equals(Object obj) {
        if (obj instanceof y10) {
            return this.a == ((y10) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return "AddButtonFeature(isAddedToLibrary=" + this.a + ")";
    }
}
