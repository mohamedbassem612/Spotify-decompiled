package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bbh1 implements hbh1 {
    public final String a;
    public final Long b;

    public bbh1(Long l, String str) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbh1)) {
            return false;
        }
        bbh1 bbh1Var = (bbh1) obj;
        return u890.j(this.a, bbh1Var.a) && u890.j(this.b, bbh1Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }
}
