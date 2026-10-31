package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class aea1 {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof aea1) {
            return u890.j(this.a, ((aea1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f4i1.f("SongDnaSearchTabId(value=", this.a, ")");
    }
}
