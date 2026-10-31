package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fej1 extends iej1 {
    public final int a;
    public final String b;

    public fej1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fej1)) {
            return false;
        }
        fej1 fej1Var = (fej1) obj;
        return this.a == fej1Var.a && u890.j(this.b, fej1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
