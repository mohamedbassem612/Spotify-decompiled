package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class q2o implements ez00 {
    public final bg51 a;

    public q2o(bg51 bg51Var) {
        this.a = bg51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q2o) && this.a.equals(((q2o) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
