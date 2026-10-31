package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fy90 implements gy90 {
    public final gbl a;

    public fy90(gbl gblVar) {
        this.a = gblVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fy90) && this.a == ((fy90) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
