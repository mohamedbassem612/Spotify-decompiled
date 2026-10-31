package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rxt0 implements zxt0 {
    public final y6b1 a;

    public rxt0(y6b1 y6b1Var) {
        this.a = y6b1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rxt0) && this.a.equals(((rxt0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
