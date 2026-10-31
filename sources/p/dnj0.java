package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dnj0 extends snj0 {
    public final k4m b;

    public dnj0(k4m k4mVar) {
        super(true);
        this.b = k4mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dnj0) && this.b == ((dnj0) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
