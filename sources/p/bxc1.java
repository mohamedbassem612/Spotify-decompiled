package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bxc1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public bxc1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxc1)) {
            return false;
        }
        bxc1 bxc1Var = (bxc1) obj;
        return this.a.equals(bxc1Var.a) && this.b.equals(bxc1Var.b) && this.c.equals(bxc1Var.c) && this.d.equals(bxc1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
