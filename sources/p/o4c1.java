package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o4c1 extends p4c1 {
    public final m4c1 a;

    public o4c1(m4c1 m4c1Var) {
        this.a = m4c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o4c1) && this.a.equals(((o4c1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
