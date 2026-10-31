package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fxg1 {
    public static final a1i c = new a1i(lbg1.Y, gsh.Y);
    public final String a;
    public final boolean b;

    public fxg1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxg1)) {
            return false;
        }
        fxg1 fxg1Var = (fxg1) obj;
        return this.a.equals(fxg1Var.a) && this.b == fxg1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
