package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lwi1 extends vwi1 {
    public final h1a a;

    public lwi1(h1a h1aVar) {
        this.a = h1aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lwi1) && u890.j(this.a, ((lwi1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
