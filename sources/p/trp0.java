package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class trp0 extends urp0 {
    public final int a;
    public final yap1 b;
    public final String c;
    public final String d;
    public final vrp0 e;
    public final int f;

    public trp0(int i, yap1 yap1Var, String str, String str2, vrp0 vrp0Var, int i2) {
        this.a = i;
        this.b = yap1Var;
        this.c = str;
        this.d = str2;
        this.e = vrp0Var;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof trp0)) {
            return false;
        }
        trp0 trp0Var = (trp0) obj;
        return this.a == trp0Var.a && this.b.equals(trp0Var.b) && this.c.equals(trp0Var.c) && this.d.equals(trp0Var.d) && this.e == trp0Var.e && this.f == trp0Var.f;
    }

    public final int hashCode() {
        return l1d.C(this.f) + ((this.e.hashCode() + cy30.d(cy30.d((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c), 31, this.d)) * 31);
    }
}
