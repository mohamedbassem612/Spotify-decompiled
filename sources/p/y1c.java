package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class y1c {
    public final int a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final izr0 f;
    public final izr0 g;
    public int h;
    public int i;

    public y1c(izr0 izr0Var, izr0 izr0Var2, boolean z) {
        this.g = izr0Var;
        this.f = izr0Var2;
        this.e = z;
        izr0Var2.R(12);
        this.a = izr0Var2.I();
        izr0Var.R(12);
        this.i = izr0Var.I();
        jto1.q("first_chunk must be 1", izr0Var.q() == 1);
        this.b = -1;
    }

    public final boolean a() {
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            return false;
        }
        boolean z = this.e;
        izr0 izr0Var = this.f;
        this.d = z ? izr0Var.K() : izr0Var.G();
        if (this.b == this.h) {
            izr0 izr0Var2 = this.g;
            this.c = izr0Var2.I();
            izr0Var2.S(4);
            int i2 = this.i - 1;
            this.i = i2;
            this.h = i2 > 0 ? izr0Var2.I() - 1 : -1;
        }
        return true;
    }
}
