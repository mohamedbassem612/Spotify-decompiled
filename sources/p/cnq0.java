package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cnq0 implements dnq0 {
    public final yzd1 a;

    public cnq0(yzd1 yzd1Var) {
        this.a = yzd1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cnq0) && this.a == ((cnq0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
