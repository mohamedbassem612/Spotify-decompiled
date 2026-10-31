package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ot2 {
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;
    public final Boolean e;
    public final String f;

    public /* synthetic */ ot2(String str, String str2, String str3, Integer num, Boolean bool, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : bool, (String) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ot2)) {
            return false;
        }
        ot2 ot2Var = (ot2) obj;
        return u890.j(this.a, ot2Var.a) && u890.j(this.b, ot2Var.b) && u890.j(this.c, ot2Var.c) && u890.j(this.d, ot2Var.d) && u890.j(this.e, ot2Var.e) && u890.j(this.f, ot2Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.f;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public ot2(String str, String str2, String str3, Integer num, Boolean bool, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
        this.e = bool;
        this.f = str4;
    }
}
