package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xq11 implements ar11 {
    public final String a;
    public final jx11 b;
    public final int c;

    public xq11(String str, jx11 jx11Var, int i) {
        this.a = str;
        this.b = jx11Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq11)) {
            return false;
        }
        xq11 xq11Var = (xq11) obj;
        return this.a.equals(xq11Var.a) && this.b == xq11Var.b && this.c == xq11Var.c;
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
