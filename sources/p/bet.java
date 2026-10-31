package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bet {
    public final boolean a;

    public final boolean equals(Object obj) {
        if (obj instanceof bet) {
            return this.a == ((bet) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return "DescriptionCollapseExpandState(isExpanded=" + this.a + ")";
    }
}
