package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mey0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final x360 e;
    public final String f;
    public final n1x g;
    public final String h;
    public final String i;

    public /* synthetic */ mey0(String str, String str2, String str3, String str4, x360 x360Var, String str5, n1x n1xVar, String str6, String str7, int i) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : x360Var, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : n1xVar, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7);
    }

    public static mey0 a(mey0 mey0Var) {
        String str = mey0Var.a;
        String str2 = mey0Var.b;
        String str3 = mey0Var.c;
        String str4 = mey0Var.d;
        String str5 = mey0Var.f;
        n1x n1xVar = mey0Var.g;
        String str6 = mey0Var.h;
        String str7 = mey0Var.i;
        mey0Var.getClass();
        return new mey0(str, str2, str3, str4, null, str5, n1xVar, str6, str7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mey0)) {
            return false;
        }
        mey0 mey0Var = (mey0) obj;
        return u890.j(this.a, mey0Var.a) && u890.j(this.b, mey0Var.b) && u890.j(this.c, mey0Var.c) && u890.j(this.d, mey0Var.d) && u890.j(this.e, mey0Var.e) && u890.j(this.f, mey0Var.f) && u890.j(this.g, mey0Var.g) && u890.j(this.h, mey0Var.h) && u890.j(this.i, mey0Var.i);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        x360 x360Var = this.e;
        int iHashCode = (iD + (x360Var == null ? 0 : x360Var.hashCode())) * 31;
        String str = this.f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        n1x n1xVar = this.g;
        int iHashCode3 = (iHashCode2 + (n1xVar == null ? 0 : n1xVar.hashCode())) * 31;
        String str2 = this.h;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public mey0(String str, String str2, String str3, String str4, x360 x360Var, String str5, n1x n1xVar, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = x360Var;
        this.f = str5;
        this.g = n1xVar;
        this.h = str6;
        this.i = str7;
    }
}
