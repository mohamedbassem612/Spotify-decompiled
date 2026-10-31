package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class p2x0 extends z2x0 {
    public final q730 a;

    public p2x0(q730 q730Var) {
        this.a = q730Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p2x0) && this.a.equals(((p2x0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
