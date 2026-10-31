package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rkw0 extends tkw0 {
    public final String a;
    public final op80 b;
    public final oii0 c;

    public rkw0(String str, op80 op80Var, oii0 oii0Var) {
        this.a = str;
        this.b = op80Var;
        this.c = oii0Var;
    }

    @Override // p.tkw0
    public final oii0 b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rkw0)) {
            return false;
        }
        rkw0 rkw0Var = (rkw0) obj;
        return this.a.equals(rkw0Var.a) && this.b.equals(rkw0Var.b) && this.c.equals(rkw0Var.c);
    }

    @Override // p.qq60
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + x0d.i(this.b, this.a.hashCode() * 31, 31);
    }
}
