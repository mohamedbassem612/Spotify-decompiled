package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class eej1 extends iej1 {
    public final int a;
    public final String b;

    public eej1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eej1)) {
            return false;
        }
        eej1 eej1Var = (eej1) obj;
        return this.a == eej1Var.a && u890.j(this.b, eej1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
