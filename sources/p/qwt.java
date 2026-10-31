package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qwt extends brl {
    public final le20 d;
    public final bnv0 e;

    public qwt(le20 le20Var, bnv0 bnv0Var) {
        this.d = le20Var;
        this.e = bnv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qwt)) {
            return false;
        }
        qwt qwtVar = (qwt) obj;
        return this.d.equals(qwtVar.d) && this.e.equals(qwtVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }
}
