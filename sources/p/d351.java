package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d351 {
    public final qd20 a;

    public d351(qd20 qd20Var) {
        this.a = qd20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d351) && this.a.equals(((d351) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
