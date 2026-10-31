package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xqe0 extends pap1 {
    public final String c;
    public final woe0 d;

    public xqe0(String str, woe0 woe0Var) {
        this.c = str;
        this.d = woe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqe0)) {
            return false;
        }
        xqe0 xqe0Var = (xqe0) obj;
        return this.c.equals(xqe0Var.c) && this.d.equals(xqe0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
