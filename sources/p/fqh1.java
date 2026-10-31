package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fqh1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public fqh1(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqh1)) {
            return false;
        }
        fqh1 fqh1Var = (fqh1) obj;
        return this.a.equals(fqh1Var.a) && this.b.equals(fqh1Var.b) && this.c.equals(fqh1Var.c) && this.d.equals(fqh1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
