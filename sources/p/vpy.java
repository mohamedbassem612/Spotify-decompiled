package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vpy implements xpy {
    public final tpy a;

    public vpy(tpy tpyVar) {
        this.a = tpyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vpy) && u890.j(this.a, ((vpy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
