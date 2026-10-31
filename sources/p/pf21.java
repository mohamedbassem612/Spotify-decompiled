package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pf21 implements e9j1 {
    public final fq0 a;

    public pf21(fq0 fq0Var) {
        this.a = fq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pf21) && u890.j(this.a, ((pf21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
