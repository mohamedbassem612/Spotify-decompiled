package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ggf0 extends igf0 {
    public final cay a;

    public ggf0(cay cayVar) {
        this.a = cayVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ggf0) && u890.j(this.a, ((ggf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
