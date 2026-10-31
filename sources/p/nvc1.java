package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nvc1 implements uvc1 {
    public final String a;
    public final String b;
    public final String c;

    public nvc1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nvc1)) {
            return false;
        }
        nvc1 nvc1Var = (nvc1) obj;
        return u890.j(this.a, nvc1Var.a) && u890.j(this.b, nvc1Var.b) && u890.j(this.c, nvc1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
