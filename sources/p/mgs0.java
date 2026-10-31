package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mgs0 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final j16 e;
    public final vr60 f;

    public mgs0(int i, String str, String str2, String str3, j16 j16Var, vr60 vr60Var) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = j16Var;
        this.f = vr60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mgs0)) {
            return false;
        }
        mgs0 mgs0Var = (mgs0) obj;
        return this.a == mgs0Var.a && u890.j(this.b, mgs0Var.b) && this.c.equals(mgs0Var.c) && u890.j(this.d, mgs0Var.d) && this.e == mgs0Var.e && this.f.equals(mgs0Var.f);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return this.f.hashCode() + ((this.e.hashCode() + cy30.d(cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d)) * 31);
    }
}
