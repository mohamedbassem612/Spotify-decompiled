package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class swz0 implements uwz0 {
    public final fho0 a;

    public swz0(fho0 fho0Var) {
        this.a = fho0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof swz0) && this.a.equals(((swz0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NotReachable(reason=" + this.a + ")";
    }
}
