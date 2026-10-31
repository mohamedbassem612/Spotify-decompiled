package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pgj1 {
    public final String a;
    public final ogj1 b;

    public pgj1(String str, ogj1 ogj1Var) {
        this.a = str;
        this.b = ogj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pgj1)) {
            return false;
        }
        pgj1 pgj1Var = (pgj1) obj;
        return this.a.equals(pgj1Var.a) && u890.j(this.b, pgj1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
