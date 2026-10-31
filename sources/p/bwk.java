package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bwk implements fxk {
    public final qel a;

    public bwk(qel qelVar) {
        this.a = qelVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bwk) && this.a.equals(((bwk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
