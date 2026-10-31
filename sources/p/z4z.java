package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z4z implements a5z {
    public final ir61 a;

    public z4z(ir61 ir61Var) {
        this.a = ir61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z4z) && u890.j(this.a, ((z4z) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
