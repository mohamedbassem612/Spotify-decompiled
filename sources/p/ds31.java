package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ds31 {
    public final es31 a;
    public final es31 b;
    public final Throwable c;

    public /* synthetic */ ds31(es31 es31Var, Throwable th, int i) {
        this(es31Var, (b5l) null, (i & 4) != 0 ? null : th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ds31)) {
            return false;
        }
        ds31 ds31Var = (ds31) obj;
        return u890.j(this.a, ds31Var.a) && u890.j(this.b, ds31Var.b) && u890.j(this.c, ds31Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        es31 es31Var = this.b;
        int iHashCode2 = (iHashCode + (es31Var == null ? 0 : es31Var.hashCode())) * 31;
        Throwable th = this.c;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.a + ", nextPlan=" + this.b + ", throwable=" + this.c + ')';
    }

    public ds31(es31 es31Var, b5l b5lVar, Throwable th) {
        this.a = es31Var;
        this.b = b5lVar;
        this.c = th;
    }
}
