package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uj90 implements wj90 {
    public final qj90 a;

    public uj90(qj90 qj90Var) {
        this.a = qj90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uj90) && this.a.equals(((uj90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
