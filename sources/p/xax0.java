package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xax0 extends yax0 {
    public final boolean a;
    public final String b;

    public xax0(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xax0)) {
            return false;
        }
        xax0 xax0Var = (xax0) obj;
        return this.a == xax0Var.a && u890.j(this.b, xax0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
