package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jg11 extends q380 {
    public static final jg11 h;
    public final transient gfp0 e;
    public final transient int f;
    public transient hg11 g;

    static {
        gfp0 gfp0Var = new gfp0();
        gfp0Var.d(3);
        h = new jg11(gfp0Var);
    }

    public jg11(gfp0 gfp0Var) {
        this.e = gfp0Var;
        long j = 0;
        int i = 0;
        while (true) {
            int i2 = gfp0Var.c;
            if (i >= i2) {
                this.f = bmq0.Z(j);
                return;
            } else {
                dm5.q(i, i2);
                j += (long) gfp0Var.b[i];
                i++;
            }
        }
    }

    public final boolean i() {
        throw null;
    }

    @Override // p.q380
    public final t380 l() {
        hg11 hg11Var = this.g;
        if (hg11Var != null) {
            return hg11Var;
        }
        hg11 hg11Var2 = new hg11(this);
        this.g = hg11Var2;
        return hg11Var2;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f;
    }

    @Override // p.q380
    public Object writeReplace() {
        return new ig11(this);
    }
}
