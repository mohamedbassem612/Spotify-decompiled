package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zmh1 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final boolean e;
    public final boolean f;

    public zmh1(String str, String str2, String str3, long j, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zmh1)) {
            return false;
        }
        zmh1 zmh1Var = (zmh1) obj;
        return this.a.equals(zmh1Var.a) && this.b.equals(zmh1Var.b) && u890.j(this.c, zmh1Var.c) && this.d == zmh1Var.d && this.e == zmh1Var.e && this.f == zmh1Var.f;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.f) + xcg1.g(cy30.f((iD + (str == null ? 0 : str.hashCode())) * 31, this.d, 31), 31, this.e);
    }
}
