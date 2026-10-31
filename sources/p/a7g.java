package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a7g implements q7g {
    public final tan a;

    public a7g(tan tanVar) {
        this.a = tanVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a7g) && this.a.equals(((a7g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
