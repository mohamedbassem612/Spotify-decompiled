package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mvc1 implements uvc1 {
    public final String a;
    public final String b;
    public final String c;

    public mvc1(String str, String str2, String str3) {
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
        if (!(obj instanceof mvc1)) {
            return false;
        }
        mvc1 mvc1Var = (mvc1) obj;
        return this.a.equals(mvc1Var.a) && u890.j(this.b, mvc1Var.b) && u890.j(this.c, mvc1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
