package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ij51 {
    public final int a;
    public final mmn b;
    public final vrv0 c;
    public final boolean d;

    public ij51(int i, mmn mmnVar, vrv0 vrv0Var, boolean z) {
        this.a = i;
        this.b = mmnVar;
        this.c = vrv0Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ij51)) {
            return false;
        }
        ij51 ij51Var = (ij51) obj;
        return this.a == ij51Var.a && this.b.equals(ij51Var.b) && u890.j(this.c, ij51Var.c) && this.d == ij51Var.d;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        vrv0 vrv0Var = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode + (vrv0Var == null ? 0 : vrv0Var.hashCode())) * 31);
    }
}
