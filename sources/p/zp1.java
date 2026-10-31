package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zp1 implements cq1 {
    public final ak3 a;
    public final String b;
    public final boolean c;

    public zp1(ak3 ak3Var, String str, boolean z) {
        this.a = ak3Var;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zp1)) {
            return false;
        }
        zp1 zp1Var = (zp1) obj;
        return this.a == zp1Var.a && u890.j(this.b, zp1Var.b) && this.c == zp1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
