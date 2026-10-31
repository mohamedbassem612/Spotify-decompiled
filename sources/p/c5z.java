package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c5z implements e5z {
    public final ir61 a;

    public c5z(ir61 ir61Var) {
        this.a = ir61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c5z) && this.a.equals(((c5z) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
