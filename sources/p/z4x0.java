package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class z4x0 extends i541 {
    public final a530 d;

    public z4x0(a530 a530Var) {
        this.d = a530Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z4x0) && this.d.equals(((z4x0) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
