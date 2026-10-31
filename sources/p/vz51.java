package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vz51 implements yz51 {
    public final ly31 a;

    public vz51(ly31 ly31Var) {
        this.a = ly31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vz51) && this.a.equals(((vz51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
