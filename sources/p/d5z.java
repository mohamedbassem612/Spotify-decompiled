package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d5z implements e5z {
    public final ir61 a;

    public d5z(ir61 ir61Var) {
        this.a = ir61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d5z) && u890.j(this.a, ((d5z) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
