package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kqm1 {
    public final String a;
    public final String b;
    public final String c;

    public kqm1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kqm1)) {
            return false;
        }
        kqm1 kqm1Var = (kqm1) obj;
        return this.a.equals(kqm1Var.a) && this.b.equals(kqm1Var.b) && this.c.equals(kqm1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
