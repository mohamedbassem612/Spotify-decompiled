package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ujk extends jkk {
    public final gx6 a;

    public ujk(gx6 gx6Var) {
        this.a = gx6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ujk) && this.a.equals(((ujk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
