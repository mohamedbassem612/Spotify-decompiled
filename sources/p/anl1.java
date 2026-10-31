package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class anl1 {
    public final iu30 a;
    public final iu30 b;
    public final Integer c;
    public final boolean d;

    public anl1(iu30 iu30Var, iu30 iu30Var2, Integer num, boolean z) {
        this.a = iu30Var;
        this.b = iu30Var2;
        this.c = num;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anl1)) {
            return false;
        }
        anl1 anl1Var = (anl1) obj;
        return this.a.equals(anl1Var.a) && this.b.equals(anl1Var.b) && u890.j(this.c, anl1Var.c) && this.d == anl1Var.d;
    }

    public final int hashCode() {
        int iG = ktd.g(this.b, ktd.g(this.a, Integer.hashCode(50) * 31, 31), 31);
        Integer num = this.c;
        return Boolean.hashCode(this.d) + ((iG + (num == null ? 0 : num.hashCode())) * 31);
    }
}
