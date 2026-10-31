package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pkp0 extends tkp0 {
    public final gbl a;

    public pkp0(gbl gblVar) {
        this.a = gblVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pkp0) && this.a == ((pkp0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
