package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ihi1 implements khi1 {
    public final String a;
    public final tv80 b;

    public ihi1(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihi1)) {
            return false;
        }
        ihi1 ihi1Var = (ihi1) obj;
        return u890.j(this.a, ihi1Var.a) && this.b.equals(ihi1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
