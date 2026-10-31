package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hnm1 implements pnm1 {
    public final String a;
    public final String b;
    public final Integer c;

    public hnm1(String str, String str2, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hnm1)) {
            return false;
        }
        hnm1 hnm1Var = (hnm1) obj;
        return this.a.equals(hnm1Var.a) && this.b.equals(hnm1Var.b) && u890.j(this.c, hnm1Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        return iD + (num == null ? 0 : num.hashCode());
    }
}
