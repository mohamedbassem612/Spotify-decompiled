package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cpa1 extends n560 {
    public final String a;
    public final String b;
    public final String c;

    public cpa1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpa1)) {
            return false;
        }
        cpa1 cpa1Var = (cpa1) obj;
        return u890.j(this.a, cpa1Var.a) && u890.j(this.b, cpa1Var.b) && u890.j(this.c, cpa1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
