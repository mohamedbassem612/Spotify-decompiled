package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qvc1 implements uvc1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public qvc1(String str, String str2, String str3, String str4) {
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
        if (!(obj instanceof qvc1)) {
            return false;
        }
        qvc1 qvc1Var = (qvc1) obj;
        return u890.j(this.a, qvc1Var.a) && u890.j(this.b, qvc1Var.b) && u890.j(this.c, qvc1Var.c) && this.d.equals(qvc1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
