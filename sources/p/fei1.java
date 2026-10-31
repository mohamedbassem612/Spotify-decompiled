package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fei1 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public fei1(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fei1)) {
            return false;
        }
        fei1 fei1Var = (fei1) obj;
        return u890.j(this.a, fei1Var.a) && u890.j(this.b, fei1Var.b) && u890.j(this.c, fei1Var.c) && this.d == fei1Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
