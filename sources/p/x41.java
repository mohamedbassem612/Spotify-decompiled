package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class x41 extends c51 {
    public final m41 a;

    public x41(m41 m41Var) {
        this.a = m41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x41) && u890.j(this.a, ((x41) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
