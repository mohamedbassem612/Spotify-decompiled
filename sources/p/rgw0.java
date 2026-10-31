package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rgw0 extends wgw0 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final boolean e;
    public final boolean f;

    public rgw0(String str, String str2, String str3, long j, boolean z, boolean z2) {
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
        if (!(obj instanceof rgw0)) {
            return false;
        }
        rgw0 rgw0Var = (rgw0) obj;
        return this.a.equals(rgw0Var.a) && this.b.equals(rgw0Var.b) && u890.j(this.c, rgw0Var.c) && this.d == rgw0Var.d && this.e == rgw0Var.e && this.f == rgw0Var.f;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.f) + xcg1.g(cy30.f((iD + (str == null ? 0 : str.hashCode())) * 31, this.d, 31), 31, this.e);
    }
}
