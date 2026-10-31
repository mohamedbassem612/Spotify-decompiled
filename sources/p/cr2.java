package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cr2 implements dr2 {
    public final jx2 a;

    public cr2(jx2 jx2Var) {
        this.a = jx2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cr2) && this.a.equals(((cr2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
