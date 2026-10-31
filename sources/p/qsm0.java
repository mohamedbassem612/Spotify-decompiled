package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qsm0 implements dbr0 {
    public final ign0 a;

    public qsm0(ign0 ign0Var) {
        this.a = ign0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qsm0) && this.a.equals(((qsm0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
