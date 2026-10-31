package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lq51 {
    public final String a;
    public final String b;
    public final int c;

    public lq51(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lq51)) {
            return false;
        }
        lq51 lq51Var = (lq51) obj;
        return this.a.equals(lq51Var.a) && u890.j(this.b, lq51Var.b) && this.c == lq51Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return l1d.C(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
