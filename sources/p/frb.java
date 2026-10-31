package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class frb implements nrb {
    public final ta0 a;

    public frb(ta0 ta0Var) {
        this.a = ta0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof frb) && this.a.equals(((frb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
