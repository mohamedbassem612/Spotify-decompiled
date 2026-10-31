package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ult0 implements xlt0 {
    public final yzc0 a;

    public ult0(yzc0 yzc0Var) {
        this.a = yzc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ult0) && u890.j(this.a, ((ult0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
