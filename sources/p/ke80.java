package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ke80 extends me80 {
    public final m6p1 a;

    public ke80(m6p1 m6p1Var) {
        this.a = m6p1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ke80) && this.a.equals(((ke80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
