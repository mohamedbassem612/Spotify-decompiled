package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qrp0 extends urp0 {
    public final int a;
    public final String b;
    public final vrp0 c;
    public final int d;

    public qrp0(int i, String str, vrp0 vrp0Var, int i2) {
        this.a = i;
        this.b = str;
        this.c = vrp0Var;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qrp0)) {
            return false;
        }
        qrp0 qrp0Var = (qrp0) obj;
        return this.a == qrp0Var.a && this.b.equals(qrp0Var.b) && this.c == qrp0Var.c && this.d == qrp0Var.d;
    }

    public final int hashCode() {
        return l1d.C(this.d) + ((this.c.hashCode() + cy30.d(Integer.hashCode(this.a) * 31, 31, this.b)) * 31);
    }
}
