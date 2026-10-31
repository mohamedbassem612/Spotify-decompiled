package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class k680 implements l680 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public k680(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k680)) {
            return false;
        }
        k680 k680Var = (k680) obj;
        return u890.j(this.a, k680Var.a) && u890.j(this.b, k680Var.b) && u890.j(this.c, k680Var.c) && this.d == k680Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public /* synthetic */ k680(String str, String str2, boolean z) {
        this(str, str2, null, z);
    }
}
