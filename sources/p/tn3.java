package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tn3 extends qxd0 {
    public final zoc0 d;

    public tn3(zoc0 zoc0Var) {
        this.d = zoc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tn3) && this.d.equals(((tn3) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
