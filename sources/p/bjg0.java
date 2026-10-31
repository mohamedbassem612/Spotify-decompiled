package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bjg0 extends ern1 {
    public final le20 c;
    public final String d;
    public final hpq0 e;
    public final tb0 f;

    public bjg0(le20 le20Var, String str, hpq0 hpq0Var, tb0 tb0Var) {
        this.c = le20Var;
        this.d = str;
        this.e = hpq0Var;
        this.f = tb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bjg0)) {
            return false;
        }
        bjg0 bjg0Var = (bjg0) obj;
        return this.c.equals(bjg0Var.c) && u890.j(this.d, bjg0Var.d) && this.e.equals(bjg0Var.e) && this.f.equals(bjg0Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        String str = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }
}
