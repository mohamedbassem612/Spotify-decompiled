package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vvl implements cwl {
    public final ba81 a;

    public vvl(ba81 ba81Var) {
        this.a = ba81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vvl) && this.a.equals(((vvl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
