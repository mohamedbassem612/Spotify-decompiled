package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vnp0 extends xnp0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final boolean h;
    public final int i;

    public vnp0(String str, String str2, String str3, String str4, String str5, long j, long j2, boolean z, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = j;
        this.g = j2;
        this.h = z;
        this.i = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vnp0)) {
            return false;
        }
        vnp0 vnp0Var = (vnp0) obj;
        return u890.j(this.a, vnp0Var.a) && u890.j(this.b, vnp0Var.b) && u890.j(this.c, vnp0Var.c) && u890.j(this.d, vnp0Var.d) && u890.j(this.e, vnp0Var.e) && this.f == vnp0Var.f && this.g == vnp0Var.g && this.h == vnp0Var.h && this.i == vnp0Var.i;
    }

    public final int hashCode() {
        return l1d.C(this.i) + xcg1.g(cy30.f(cy30.f(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), this.f, 31), this.g, 31), 31, this.h);
    }
}
