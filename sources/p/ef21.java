package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ef21 extends wiy0 {
    public int X;
    public final long Y;

    public ef21(ghy0 ghy0Var, yiy0 yiy0Var, long j, h661 h661Var) {
        super(ghy0Var, yiy0Var, h661Var);
        this.X = -1;
        if (j == 19500) {
            int iO = yiy0Var.o();
            if (iO < 0) {
                nkx0.o("Expected positive length for ", h661Var, ", but got ", iO);
                throw null;
            }
            j = -iO;
        }
        this.Y = j;
    }

    @Override // p.wiy0
    public final long e1(h661 h661Var, int i) {
        long j = this.Y;
        if (j > 0) {
            return j;
        }
        return 19500L;
    }

    @Override // p.wiy0, p.x1k
    public final int p(h661 h661Var) {
        long j = this.Y;
        int i = this.X;
        yiy0 yiy0Var = this.d;
        if (j > 0) {
            if ((i == -1 ? yiy0Var.b : yiy0Var.v()) != ((int) (j & 2147483647L))) {
                yiy0Var.g();
                return -1;
            }
            int i2 = this.X + 1;
            this.X = i2;
            return i2;
        }
        long j2 = -j;
        int i3 = i + 1;
        this.X = i3;
        if (i3 == j2 || yiy0Var.d()) {
            return -1;
        }
        return i3;
    }
}
