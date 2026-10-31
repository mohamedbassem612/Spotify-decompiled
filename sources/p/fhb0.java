package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fhb0 {
    public final qhs0 a;

    public fhb0(qhs0 qhs0Var) {
        this.a = qhs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fhb0) && this.a.equals(((fhb0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
