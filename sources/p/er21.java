package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class er21 {
    public final m6k a;
    public final jek b;

    public er21(m6k m6kVar, jek jekVar) {
        this.a = m6kVar;
        this.b = jekVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er21)) {
            return false;
        }
        er21 er21Var = (er21) obj;
        return this.a.equals(er21Var.a) && this.b.equals(er21Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
