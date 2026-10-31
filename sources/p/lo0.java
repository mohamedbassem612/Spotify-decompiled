package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lo0 {
    public final zp0 a;
    public final xu30 b;

    public lo0(zp0 zp0Var, xu30 xu30Var) {
        this.a = zp0Var;
        this.b = xu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lo0)) {
            return false;
        }
        lo0 lo0Var = (lo0) obj;
        return this.a.equals(lo0Var.a) && u890.j(this.b, lo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
