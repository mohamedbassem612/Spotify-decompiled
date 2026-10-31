package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pqj1 {
    public final String a;
    public final int b;
    public final String c;
    public final String d;

    public pqj1(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
    }

    public final int a() {
        return this.b;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqj1)) {
            return false;
        }
        pqj1 pqj1Var = (pqj1) obj;
        return u890.j(this.a, pqj1Var.a) && this.b == pqj1Var.b && u890.j(this.c, pqj1Var.c) && u890.j(this.d, pqj1Var.d);
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
