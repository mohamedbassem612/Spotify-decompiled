package p;

import androidx.car.app.model.Alert;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sfg1 extends l5t implements mav0, j4k {
    public vxs Q0;
    public p5e1 R0;
    public boolean S0 = true;
    public final w7d1 T0 = new w7d1((Object) this, (byte) 10);
    public final bbc U0 = mno1.a(Alert.DURATION_SHOW_INDEFINITELY, 0, 6);
    public yo31 V0;
    public final j8d1 W0;
    public mav0 X0;

    public sfg1(vxs vxsVar, p5e1 p5e1Var) {
        this.Q0 = vxsVar;
        this.R0 = p5e1Var;
        j8d1 j8d1VarA = f8d1.a(new ae4(this, (byte) 17));
        H1(j8d1VarA);
        this.W0 = j8d1VarA;
    }

    public final void D0(bav0 bav0Var, cav0 cav0Var, long j) {
        yo31 yo31Var = this.V0;
        if (this.S0) {
            List list = bav0Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((hav0) list.get(i)).i == 2) {
                    if (yo31Var == null || this.X0 != null) {
                        break;
                        break;
                    }
                    j8d1 j8d1VarA = f8d1.a(new nrf(this, yo31Var, (byte) 5));
                    H1(j8d1VarA);
                    this.X0 = j8d1VarA;
                    break;
                }
            }
        }
        this.W0.D0(bav0Var, cav0Var, j);
        mav0 mav0Var = this.X0;
        if (mav0Var != null) {
            mav0Var.D0(bav0Var, cav0Var, j);
        }
    }

    public final void K0() {
        this.W0.K0();
        mav0 mav0Var = this.X0;
        if (mav0Var != null) {
            mav0Var.K0();
        }
    }

    public final void z1() {
        this.V0 = vvm1.F(this);
    }
}
