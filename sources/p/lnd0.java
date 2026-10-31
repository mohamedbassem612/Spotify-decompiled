package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lnd0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final i7r e;

    public lnd0(String str, String str2, String str3, String str4, i7r i7rVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i7rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lnd0)) {
            return false;
        }
        lnd0 lnd0Var = (lnd0) obj;
        return this.a.equals(lnd0Var.a) && this.b.equals(lnd0Var.b) && this.c.equals(lnd0Var.c) && this.d.equals(lnd0Var.d) && this.e.equals(lnd0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
