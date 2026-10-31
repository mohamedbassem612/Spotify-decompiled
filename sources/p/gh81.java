package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gh81 implements ih81 {
    public final ng81 a;

    public gh81(ng81 ng81Var) {
        this.a = ng81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gh81) && this.a.equals(((gh81) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
