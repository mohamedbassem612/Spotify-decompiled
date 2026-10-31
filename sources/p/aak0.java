package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class aak0 {
    public final Integer a;
    public final String b;
    public final String c;

    public aak0(String str, String str2, Integer num) {
        this.a = num;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aak0)) {
            return false;
        }
        aak0 aak0Var = (aak0) obj;
        return u890.j(this.a, aak0Var.a) && u890.j(this.b, aak0Var.b) && u890.j(this.c, aak0Var.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
