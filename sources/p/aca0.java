package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class aca0 implements cca0 {
    public final wea0 a;
    public final qo90 b;

    public aca0(wea0 wea0Var, qo90 qo90Var) {
        this.a = wea0Var;
        this.b = qo90Var;
    }

    public final wea0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aca0)) {
            return false;
        }
        aca0 aca0Var = (aca0) obj;
        return this.a.equals(aca0Var.a) && u890.j(this.b, aca0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
