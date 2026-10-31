package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hi81 implements ji81 {
    public final pc81 a;

    public hi81(pc81 pc81Var) {
        this.a = pc81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hi81) && this.a == ((hi81) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
