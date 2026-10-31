package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class br2 implements dr2 {
    public final ix2 a;

    public br2(ix2 ix2Var) {
        this.a = ix2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof br2) && this.a.equals(((br2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
