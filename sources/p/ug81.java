package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ug81 {
    public final int a;
    public final kh81 b;
    public final vrv0 c;

    public ug81(int i, kh81 kh81Var, vrv0 vrv0Var) {
        this.a = i;
        this.b = kh81Var;
        this.c = vrv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug81)) {
            return false;
        }
        ug81 ug81Var = (ug81) obj;
        return this.a == ug81Var.a && u890.j(this.b, ug81Var.b) && u890.j(this.c, ug81Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.a.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        vrv0 vrv0Var = this.c;
        return iHashCode + (vrv0Var == null ? 0 : vrv0Var.hashCode());
    }
}
