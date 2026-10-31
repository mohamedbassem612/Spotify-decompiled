package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qh51 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public qh51(int i, String str, String str2, String str3, String str4) {
        str2 = (i & 2) != 0 ? null : str2;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh51)) {
            return false;
        }
        qh51 qh51Var = (qh51) obj;
        return u890.j(this.a, qh51Var.a) && u890.j(this.b, qh51Var.b) && u890.j(this.c, qh51Var.c) && u890.j(this.d, qh51Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return Boolean.hashCode(false) + ((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31);
    }
}
