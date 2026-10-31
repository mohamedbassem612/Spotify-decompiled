package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wea0 {
    public final String a;
    public final xea0 b;

    public wea0(String str, xea0 xea0Var) {
        this.a = str;
        this.b = xea0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wea0)) {
            return false;
        }
        wea0 wea0Var = (wea0) obj;
        return u890.j(this.a, wea0Var.a) && this.b == wea0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public wea0(xea0 xea0Var) {
        this(xea0Var.a, xea0Var);
    }
}
