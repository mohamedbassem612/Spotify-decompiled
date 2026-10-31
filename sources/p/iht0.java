package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class iht0 extends lht0 {
    public final String a;
    public final d1z b;
    public final tv80 c;
    public final long d;

    public iht0(String str, d1z d1zVar, tv80 tv80Var, long j) {
        this.a = str;
        this.b = d1zVar;
        this.c = tv80Var;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iht0)) {
            return false;
        }
        iht0 iht0Var = (iht0) obj;
        return this.a.equals(iht0Var.a) && this.b == iht0Var.b && u890.j(this.c, iht0Var.c) && this.d == iht0Var.d;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        tv80 tv80Var = this.c;
        return Long.hashCode(this.d) + ((iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode())) * 31);
    }
}
