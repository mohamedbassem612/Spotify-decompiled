package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ixg0 extends qxg0 {
    public final iug0 a;

    public ixg0(iug0 iug0Var) {
        this.a = iug0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ixg0) && this.a.equals(((ixg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
