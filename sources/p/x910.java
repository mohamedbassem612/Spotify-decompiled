package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class x910 {
    public final w19 a;

    public x910(w19 w19Var) {
        this.a = w19Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x910) && this.a.equals(((x910) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
