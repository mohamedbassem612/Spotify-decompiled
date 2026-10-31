package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vgk extends a8o {
    public final olo0 d;

    public vgk(olo0 olo0Var) {
        this.d = olo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vgk) && u890.j(this.d, ((vgk) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
