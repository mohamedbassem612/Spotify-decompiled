package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gww extends kww {
    public final sf8 a;

    public gww(sf8 sf8Var) {
        this.a = sf8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gww) && this.a.equals(((gww) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
