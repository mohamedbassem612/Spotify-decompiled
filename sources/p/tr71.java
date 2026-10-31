package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tr71 {
    public final hr71 a;

    public tr71(hr71 hr71Var) {
        this.a = hr71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tr71) && this.a.equals(((tr71) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
