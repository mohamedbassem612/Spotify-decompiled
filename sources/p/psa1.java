package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class psa1 implements dta1 {
    public final fxa1 a;

    public psa1(fxa1 fxa1Var) {
        this.a = fxa1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof psa1) && u890.j(this.a, ((psa1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
