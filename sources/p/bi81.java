package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bi81 {
    public final hh81 a;
    public final vrv0 b;

    public bi81(hh81 hh81Var, vrv0 vrv0Var) {
        this.a = hh81Var;
        this.b = vrv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi81)) {
            return false;
        }
        bi81 bi81Var = (bi81) obj;
        return u890.j(this.a, bi81Var.a) && u890.j(this.b, bi81Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        vrv0 vrv0Var = this.b;
        return iHashCode + (vrv0Var == null ? 0 : vrv0Var.hashCode());
    }
}
