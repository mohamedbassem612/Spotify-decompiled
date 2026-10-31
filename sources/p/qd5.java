package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qd5 implements z0i {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;

    public qd5(int i, String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd5)) {
            return false;
        }
        qd5 qd5Var = (qd5) obj;
        return this.a.equals(qd5Var.a) && this.b.equals(qd5Var.b) && this.c.equals(qd5Var.c) && this.d.equals(qd5Var.d) && this.e == qd5Var.e && this.f.equals(qd5Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + kaa0.f(this.e, cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }
}
