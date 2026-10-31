package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ohm {
    public final jhm a;
    public final ihm b;
    public final vrv0 c;

    public ohm(jhm jhmVar, ihm ihmVar, vrv0 vrv0Var) {
        this.a = jhmVar;
        this.b = ihmVar;
        this.c = vrv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ohm)) {
            return false;
        }
        ohm ohmVar = (ohm) obj;
        return this.a.equals(ohmVar.a) && this.b.equals(ohmVar.b) && u890.j(this.c, ohmVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        vrv0 vrv0Var = this.c;
        return iHashCode + (vrv0Var == null ? 0 : vrv0Var.hashCode());
    }
}
