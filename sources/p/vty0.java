package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vty0 extends xty0 {
    public final rul1 a;

    public vty0(rul1 rul1Var) {
        this.a = rul1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vty0) && u890.j(this.a, ((vty0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
