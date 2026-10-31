package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ave0 {
    public final String a;
    public final int b;
    public final String c;
    public final String d;

    public ave0(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
    }

    public static ave0 a(ave0 ave0Var, String str) {
        String str2 = ave0Var.a;
        int i = ave0Var.b;
        String str3 = ave0Var.d;
        ave0Var.getClass();
        return new ave0(str2, str, i, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ave0)) {
            return false;
        }
        ave0 ave0Var = (ave0) obj;
        return u890.j(this.a, ave0Var.a) && this.b == ave0Var.b && u890.j(this.c, ave0Var.c) && u890.j(this.d, ave0Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iF = kaa0.f(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.c;
        int iHashCode = (iF + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }
}
