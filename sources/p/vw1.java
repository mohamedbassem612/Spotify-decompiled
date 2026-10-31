package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vw1 {
    public final mj11 a;

    public vw1(mj11 mj11Var) {
        this.a = mj11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vw1) && u890.j(this.a, ((vw1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
