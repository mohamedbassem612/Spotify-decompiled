package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t051 extends q151 {
    public final m131 a;

    public t051(m131 m131Var) {
        this.a = m131Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t051) && this.a.equals(((t051) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
