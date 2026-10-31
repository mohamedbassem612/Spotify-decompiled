package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pjg0 extends yjg0 {
    public final le20 a;
    public final String b;

    public pjg0(le20 le20Var, String str) {
        this.a = le20Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pjg0)) {
            return false;
        }
        pjg0 pjg0Var = (pjg0) obj;
        return this.a.equals(pjg0Var.a) && u890.j(this.b, pjg0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
