package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ucm1 {
    public final vcf a;
    public final boolean b;

    public ucm1(vcf vcfVar, boolean z) {
        this.a = vcfVar;
        this.b = z;
    }

    public static ucm1 a(ucm1 ucm1Var, vcf vcfVar, int i) {
        if ((i & 1) != 0) {
            vcfVar = ucm1Var.a;
        }
        return new ucm1(vcfVar, (i & 2) != 0 ? ucm1Var.b : true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ucm1)) {
            return false;
        }
        ucm1 ucm1Var = (ucm1) obj;
        return u890.j(this.a, ucm1Var.a) && this.b == ucm1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
