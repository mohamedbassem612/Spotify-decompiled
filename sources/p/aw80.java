package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class aw80 extends cw80 {
    public final sq81 a;

    public aw80(sq81 sq81Var) {
        this.a = sq81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aw80) && this.a.equals(((aw80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
