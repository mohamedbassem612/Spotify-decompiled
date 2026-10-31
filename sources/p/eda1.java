package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class eda1 {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof eda1) {
            return u890.j(this.a, ((eda1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f4i1.f("SongDnaSearchResultsTabId(value=", this.a, ")");
    }
}
