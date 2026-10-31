package p;

import androidx.car.app.model.Alert;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s890 extends q890 {
    public int O0;
    public boolean P0;

    public final long H1(afh0 afh0Var, long j) {
        int iW = this.O0 == 1 ? afh0Var.w(hjl.h(j)) : afh0Var.C(hjl.h(j));
        if (iW < 0) {
            iW = 0;
        }
        if (iW < 0) {
            sf80.a("width must be >= 0");
        }
        return jjl.h(iW, iW, 0, Alert.DURATION_SHOW_INDEFINITELY);
    }

    public final boolean I1() {
        return this.P0;
    }

    public final int P0(x5f0 x5f0Var, afh0 afh0Var, int i) {
        return this.O0 == 1 ? afh0Var.w(i) : afh0Var.C(i);
    }

    public final int V0(x5f0 x5f0Var, afh0 afh0Var, int i) {
        return this.O0 == 1 ? afh0Var.w(i) : afh0Var.C(i);
    }
}
