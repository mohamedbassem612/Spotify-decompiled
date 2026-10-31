package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ljg0 extends yjg0 {
    public final n560 a;

    public ljg0(n560 n560Var) {
        this.a = n560Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ljg0) && this.a.equals(((ljg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
