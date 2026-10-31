package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pwt extends brl {
    public final bnv0 d;
    public final String e;
    public final boolean f;

    public pwt(bnv0 bnv0Var, String str, boolean z) {
        this.d = bnv0Var;
        this.e = str;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwt)) {
            return false;
        }
        pwt pwtVar = (pwt) obj;
        return this.d.equals(pwtVar.d) && u890.j(this.e, pwtVar.e) && this.f == pwtVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + cy30.d(this.d.hashCode() * 31, 31, this.e);
    }
}
