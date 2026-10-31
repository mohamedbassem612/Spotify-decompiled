package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class y1a extends z1a {
    public final k4m a;

    public y1a(k4m k4mVar) {
        this.a = k4mVar;
    }

    public final int a() {
        return 32;
    }

    public final k4m b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y1a) && this.a == ((y1a) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
