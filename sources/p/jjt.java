package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jjt implements dkt {
    public final String a;
    public final int b;
    public final String c;
    public final boolean d;
    public final String e;

    public jjt(int i, String str, String str2, boolean z, String str3) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = z;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjt)) {
            return false;
        }
        jjt jjtVar = (jjt) obj;
        return u890.j(this.a, jjtVar.a) && this.b == jjtVar.b && u890.j(this.c, jjtVar.c) && this.d == jjtVar.d && u890.j(this.e, jjtVar.e);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int iG = xcg1.g((iF + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        return iG + (str2 != null ? str2.hashCode() : 0);
    }
}
