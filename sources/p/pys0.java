package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pys0 {
    public final String a;
    public final kzs0 b;
    public final Integer c;

    public pys0(String str, kzs0 kzs0Var, Integer num) {
        this.a = str;
        this.b = kzs0Var;
        this.c = num;
        if (str.length() <= 4) {
            return;
        }
        hhg1.n("Failed requirement.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pys0)) {
            return false;
        }
        pys0 pys0Var = (pys0) obj;
        return u890.j(this.a, pys0Var.a) && u890.j(this.b, pys0Var.b) && u890.j(this.c, pys0Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Integer num = this.c;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
