package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lnm1 implements pnm1 {
    public final String a;
    public final String b;
    public final Integer c;

    public lnm1(String str, String str2, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lnm1)) {
            return false;
        }
        lnm1 lnm1Var = (lnm1) obj;
        return this.a.equals(lnm1Var.a) && this.b.equals(lnm1Var.b) && u890.j(this.c, lnm1Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        return iD + (num == null ? 0 : num.hashCode());
    }
}
