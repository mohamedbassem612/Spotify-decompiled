package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xhm1 {
    public final String a;
    public final hp80 b;

    public xhm1(String str, hp80 hp80Var) {
        this.a = str;
        this.b = hp80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhm1)) {
            return false;
        }
        xhm1 xhm1Var = (xhm1) obj;
        return this.a.equals(xhm1Var.a) && this.b.equals(xhm1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
