package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class msn0 extends oqn1 {
    public final String c;
    public final tv80 d;

    public msn0(String str, tv80 tv80Var) {
        this.c = str;
        this.d = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof msn0)) {
            return false;
        }
        msn0 msn0Var = (msn0) obj;
        return u890.j(this.c, msn0Var.c) && this.d.equals(msn0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
