package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rlk extends vlk {
    public final vqe1 a;

    public rlk(vqe1 vqe1Var) {
        this.a = vqe1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rlk) && u890.j(this.a, ((rlk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
