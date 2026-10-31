package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ojg1 implements qjg1 {
    public final String a;
    public final String b;
    public final String c;

    public ojg1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojg1)) {
            return false;
        }
        ojg1 ojg1Var = (ojg1) obj;
        return u890.j(this.a, ojg1Var.a) && this.b.equals(ojg1Var.b) && this.c.equals(ojg1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
