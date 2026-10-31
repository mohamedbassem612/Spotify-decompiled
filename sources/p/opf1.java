package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class opf1 implements ppf1 {
    public final int a;
    public final String b;

    public opf1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof opf1)) {
            return false;
        }
        opf1 opf1Var = (opf1) obj;
        return this.a == opf1Var.a && this.b.equals(opf1Var.b);
    }

    public final int hashCode() {
        int i = this.a;
        return this.b.hashCode() + ((i == 0 ? 0 : l1d.C(i)) * 31);
    }
}
