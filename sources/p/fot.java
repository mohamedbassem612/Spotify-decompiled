package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fot implements hot {
    public final rzl1 a;

    public fot(rzl1 rzl1Var) {
        this.a = rzl1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fot) && u890.j(this.a, ((fot) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
