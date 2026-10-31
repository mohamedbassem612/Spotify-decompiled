package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class skw0 extends tkw0 {
    public final String a;
    public final op80 b;
    public final oii0 c;

    public skw0(String str, op80 op80Var, oii0 oii0Var) {
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
        if (!(obj instanceof skw0)) {
            return false;
        }
        skw0 skw0Var = (skw0) obj;
        return this.a.equals(skw0Var.a) && this.b.equals(skw0Var.b) && this.c.equals(skw0Var.c);
    }

    @Override // p.qq60
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + x0d.i(this.b, this.a.hashCode() * 31, 31);
    }
}
