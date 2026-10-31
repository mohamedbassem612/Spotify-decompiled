package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xyh1 {
    public final String a;
    public final int b;
    public final String c;

    public xyh1(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xyh1)) {
            return false;
        }
        xyh1 xyh1Var = (xyh1) obj;
        return u890.j(this.a, xyh1Var.a) && this.b == xyh1Var.b && u890.j(this.c, xyh1Var.c);
    }

    public final int hashCode() {
        int iK = ab80.k(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return iK + (str == null ? 0 : str.hashCode());
    }
}
