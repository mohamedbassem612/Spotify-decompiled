package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zqc1 implements drc1 {
    public final xqc1 a;
    public final brc1 b;

    public zqc1(xqc1 xqc1Var, brc1 brc1Var) {
        this.a = xqc1Var;
        this.b = brc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zqc1)) {
            return false;
        }
        zqc1 zqc1Var = (zqc1) obj;
        return this.a.equals(zqc1Var.a) && this.b.equals(zqc1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
