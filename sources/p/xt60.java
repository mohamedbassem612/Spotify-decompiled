package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xt60 extends ru60 {
    public final String a;
    public final kb b;

    public xt60(String str, kb kbVar) {
        this.a = str;
        this.b = kbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt60)) {
            return false;
        }
        xt60 xt60Var = (xt60) obj;
        return u890.j(this.a, xt60Var.a) && u890.j(this.b, xt60Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        kb kbVar = this.b;
        return iHashCode + (kbVar == null ? 0 : kbVar.hashCode());
    }
}
