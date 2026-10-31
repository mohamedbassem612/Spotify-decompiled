package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class svc1 implements uvc1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public svc1(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
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
        if (!(obj instanceof svc1)) {
            return false;
        }
        svc1 svc1Var = (svc1) obj;
        return u890.j(this.a, svc1Var.a) && u890.j(this.b, svc1Var.b) && u890.j(this.c, svc1Var.c) && this.d.equals(svc1Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
