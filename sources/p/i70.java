package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i70 implements l70, egb1 {
    public final iu30 a;
    public final iu30 b;

    public i70(iu30 iu30Var, iu30 iu30Var2) {
        this.a = iu30Var;
        this.b = iu30Var2;
    }

    @Override // p.egb1
    public final iu30 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i70)) {
            return false;
        }
        i70 i70Var = (i70) obj;
        return this.a.equals(i70Var.a) && this.b.equals(i70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
