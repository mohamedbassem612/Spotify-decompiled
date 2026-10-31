package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ksn0 extends oqn1 {
    public final String c;
    public final tv80 d;

    public ksn0(String str, tv80 tv80Var) {
        this.c = str;
        this.d = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksn0)) {
            return false;
        }
        ksn0 ksn0Var = (ksn0) obj;
        return u890.j(this.c, ksn0Var.c) && this.d.equals(ksn0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
