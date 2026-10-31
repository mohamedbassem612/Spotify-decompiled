package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lf00 extends o4o1 {
    public final rod0 e;
    public final String f;

    public lf00(String str, rod0 rod0Var) {
        this.e = rod0Var;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf00)) {
            return false;
        }
        lf00 lf00Var = (lf00) obj;
        return u890.j(this.e, lf00Var.e) && u890.j(this.f, lf00Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + (this.e.hashCode() * 31);
    }
}
