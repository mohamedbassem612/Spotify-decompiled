package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class txi1 {
    public final String a;
    public final String b;
    public final String c;

    public txi1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txi1)) {
            return false;
        }
        txi1 txi1Var = (txi1) obj;
        return this.a.equals(txi1Var.a) && this.b.equals(txi1Var.b) && this.c.equals(txi1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
