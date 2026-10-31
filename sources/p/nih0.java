package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nih0 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;
    public final q1m f;

    public nih0(String str, String str2, String str3, int i, boolean z, q1m q1mVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = z;
        this.f = q1mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nih0)) {
            return false;
        }
        nih0 nih0Var = (nih0) obj;
        return u890.j(this.a, nih0Var.a) && u890.j(this.b, nih0Var.b) && u890.j(this.c, nih0Var.c) && this.d == nih0Var.d && this.e == nih0Var.e && u890.j(this.f, nih0Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int iD = cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int iG = xcg1.g(kaa0.f(this.d, (iD + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.e);
        q1m q1mVar = this.f;
        return iG + (q1mVar != null ? q1mVar.hashCode() : 0);
    }

    public /* synthetic */ nih0(String str, String str2, String str3, int i, boolean z, q1m q1mVar, int i2) {
        this(str, str2, str3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? false : z, q1mVar);
    }
}
