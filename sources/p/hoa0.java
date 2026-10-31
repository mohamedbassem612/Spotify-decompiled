package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hoa0 implements koa0 {
    public final dts a;
    public final Object b;

    public hoa0(dts dtsVar, Object obj) {
        this.a = dtsVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hoa0)) {
            return false;
        }
        hoa0 hoa0Var = (hoa0) obj;
        return u890.j(this.a, hoa0Var.a) && u890.j(this.b, hoa0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
