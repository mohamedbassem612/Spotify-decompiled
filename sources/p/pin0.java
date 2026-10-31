package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pin0 {
    public final oin0 a;

    public pin0(oin0 oin0Var) {
        this.a = oin0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pin0) && u890.j(this.a, ((pin0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
