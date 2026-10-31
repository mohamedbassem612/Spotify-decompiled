package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ta0 {
    public final String a;
    public final rrb b;
    public final drb c;

    public ta0(String str, rrb rrbVar, drb drbVar) {
        this.a = str;
        this.b = rrbVar;
        this.c = drbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta0)) {
            return false;
        }
        ta0 ta0Var = (ta0) obj;
        return u890.j(this.a, ta0Var.a) && this.b.equals(ta0Var.b) && u890.j(this.c, ta0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
