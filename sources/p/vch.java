package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vch implements ga80 {
    public final ga80 a;

    public vch(ga80 ga80Var) {
        this.a = ga80Var;
    }

    @Override // p.ga80
    public final x4t a(idn0 idn0Var) {
        return new uch(this.a.a(idn0Var), jtr.f.a(idn0Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vch) || !this.a.equals(((vch) obj).a)) {
            return false;
        }
        jtr jtrVar = jtr.f;
        return jtrVar.equals(jtrVar);
    }

    @Override // p.ga80
    public final int hashCode() {
        return (this.a.hashCode() * 31) - 1;
    }
}
