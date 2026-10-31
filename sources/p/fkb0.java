package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fkb0 implements d9j1 {
    public final taj1 a;

    public fkb0(taj1 taj1Var) {
        this.a = taj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fkb0) && u890.j(this.a, ((fkb0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
