package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class epc1 extends wpo1 {
    public final String c;
    public final mae1 d;
    public final iu30 e;

    public epc1(String str, mae1 mae1Var, iu30 iu30Var) {
        this.c = str;
        this.d = mae1Var;
        this.e = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof epc1)) {
            return false;
        }
        epc1 epc1Var = (epc1) obj;
        return u890.j(this.c, epc1Var.c) && this.d.equals(epc1Var.d) && u890.j(this.e, epc1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31);
    }
}
