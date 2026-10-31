package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xdb1 {
    public final String a;
    public final boolean b;

    public xdb1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xdb1)) {
            return false;
        }
        xdb1 xdb1Var = (xdb1) obj;
        return u890.j(this.a, xdb1Var.a) && this.b == xdb1Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
