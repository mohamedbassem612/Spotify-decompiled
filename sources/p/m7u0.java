package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class m7u0 implements nbj1 {
    public final dv0 a;

    public m7u0(dv0 dv0Var) {
        this.a = dv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m7u0) && u890.j(this.a, ((m7u0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
