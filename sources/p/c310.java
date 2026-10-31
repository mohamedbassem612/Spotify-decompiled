package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c310 implements d310 {
    public final lpl a;

    public c310(lpl lplVar) {
        this.a = lplVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c310) && this.a.equals(((c310) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
