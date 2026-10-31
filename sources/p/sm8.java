package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sm8 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;

    public sm8(int i, String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sm8)) {
            return false;
        }
        sm8 sm8Var = (sm8) obj;
        return u890.j(this.a, sm8Var.a) && u890.j(this.b, sm8Var.b) && u890.j(this.c, sm8Var.c) && u890.j(this.d, sm8Var.d) && this.e == sm8Var.e;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        int i = this.e;
        return iHashCode4 + (i != 0 ? l1d.C(i) : 0);
    }
}
