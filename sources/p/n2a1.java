package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class n2a1 implements q2a1 {
    public final m2a1 a;

    public n2a1(m2a1 m2a1Var) {
        this.a = m2a1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n2a1) && this.a.equals(((n2a1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
