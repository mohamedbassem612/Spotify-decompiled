package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ii81 implements ji81 {
    public final pc81 a;

    public ii81(pc81 pc81Var) {
        this.a = pc81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ii81) && this.a == ((ii81) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
