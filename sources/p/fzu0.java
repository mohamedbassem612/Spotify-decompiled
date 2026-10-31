package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fzu0 {
    public final tzh a;
    public final String b;

    public fzu0(tzh tzhVar, String str) {
        this.a = tzhVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzu0)) {
            return false;
        }
        fzu0 fzu0Var = (fzu0) obj;
        return u890.j(this.a, fzu0Var.a) && this.b.equals(fzu0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
