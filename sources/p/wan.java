package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wan {
    public final tan a;

    public wan(tan tanVar) {
        this.a = tanVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wan) && u890.j(this.a, ((wan) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
