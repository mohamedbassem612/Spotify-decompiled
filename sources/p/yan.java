package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class yan implements abn {
    public final tan a;

    public yan(tan tanVar) {
        this.a = tanVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yan) && u890.j(this.a, ((yan) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
