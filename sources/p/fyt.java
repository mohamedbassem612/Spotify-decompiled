package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fyt implements gyt {
    public final h5u0 a;

    public fyt(h5u0 h5u0Var) {
        this.a = h5u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fyt) && u890.j(this.a, ((fyt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
