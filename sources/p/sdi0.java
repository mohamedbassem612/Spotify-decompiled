package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sdi0 {
    public final hwt a;

    public sdi0(hwt hwtVar) {
        this.a = hwtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sdi0) && u890.j(this.a, ((sdi0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
