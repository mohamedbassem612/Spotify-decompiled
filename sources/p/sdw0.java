package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class sdw0 implements kew0 {
    public final zkm a;

    public sdw0(zkm zkmVar) {
        this.a = zkmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sdw0) && u890.j(this.a, ((sdw0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
