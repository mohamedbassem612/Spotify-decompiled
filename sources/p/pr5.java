package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class pr5 extends cv5 {
    public static final or5 Companion = new or5();
    public String b;
    public Integer c;
    public Integer d;
    public String e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr5)) {
            return false;
        }
        pr5 pr5Var = (pr5) obj;
        return u890.j(this.b, pr5Var.b) && u890.j(this.c, pr5Var.c) && u890.j(this.d, pr5Var.d) && u890.j(this.e, pr5Var.e);
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}
