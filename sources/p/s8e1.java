package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s8e1 {
    public final boolean a;

    public final boolean equals(Object obj) {
        if (obj instanceof s8e1) {
            return this.a == ((s8e1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a ? 1 : 0);
    }

    public final String toString() {
        return gvg.e(this.a ? 1 : 0, "TextHighlightType(value=", ")");
    }
}
