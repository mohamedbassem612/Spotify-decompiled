package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class xt5 extends cv5 {
    public static final wt5 Companion = new wt5();
    public static final xt5 e = new xt5("", "", 0);
    public Integer b;
    public String c;
    public String d;

    public xt5(String str, String str2, Integer num) {
        this.b = num;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt5)) {
            return false;
        }
        xt5 xt5Var = (xt5) obj;
        return u890.j(this.b, xt5Var.b) && u890.j(this.c, xt5Var.c) && u890.j(this.d, xt5Var.d);
    }

    public final int hashCode() {
        Integer num = this.b;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
