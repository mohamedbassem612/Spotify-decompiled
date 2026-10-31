package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class skm1 {
    public final String a;
    public final String b;
    public final bef0 c;
    public final int d;

    public skm1(String str, String str2, bef0 bef0Var, int i) {
        this.a = str;
        this.b = str2;
        this.c = bef0Var;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof skm1)) {
            return false;
        }
        skm1 skm1Var = (skm1) obj;
        return u890.j(this.a, skm1Var.a) && u890.j(this.b, skm1Var.b) && u890.j(this.c, skm1Var.c) && this.d == skm1Var.d;
    }

    public final int hashCode() {
        return l1d.C(this.d) + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }
}
