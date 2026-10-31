package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class cy60 extends pim0 implements dpg1, mav0, j4k {
    public t3v O0;
    public ky4 P0;
    public boolean Q0;

    public cy60(ky4 ky4Var, t3v t3vVar) {
        this.O0 = t3vVar;
        this.P0 = ky4Var;
    }

    public final void A1() {
        L1();
    }

    public final void D0(bav0 bav0Var, cav0 cav0Var, long j) {
        if (cav0Var == cav0.b) {
            List list = bav0Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (K1(((hav0) list.get(i)).i)) {
                    int i2 = bav0Var.f;
                    if (i2 == 4) {
                        this.Q0 = true;
                        J1();
                        return;
                    } else {
                        if (i2 == 5) {
                            L1();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public final void H1() {
        ky4 ky4Var;
        p811 p811Var = new p811();
        don1.F(this, new pv40(p811Var));
        cy60 cy60Var = (cy60) p811Var.a;
        if (cy60Var == null || (ky4Var = cy60Var.P0) == null) {
            ky4Var = this.P0;
        }
        I1(ky4Var);
    }

    public void I1(fav0 fav0Var) {
        ea4 ea4Var = (gav0) lcc.z(this, t4k.w);
        if (ea4Var != null) {
            ea4Var.a = fav0Var;
        }
    }

    public final void J1() {
        l811 l811Var = new l811();
        l811Var.a = true;
        don1.H(this, new gv20((Object) l811Var, (byte) 5));
        if (l811Var.a) {
            H1();
        }
    }

    public final void K0() {
        L1();
    }

    public boolean K1(int i) {
        return (i == 3 || i == 4) ? false : true;
    }

    public final void L1() {
        if (this.Q0) {
            this.Q0 = false;
            if (((pim0) this).N0) {
                p811 p811Var = new p811();
                don1.F(this, new q94(p811Var, (byte) 2));
                cy60 cy60Var = (cy60) p811Var.a;
                if (cy60Var != null) {
                    cy60Var.H1();
                } else {
                    I1(null);
                }
            }
        }
    }

    public final long z0() {
        if (this.O0 == null) {
            return xhf1.a;
        }
        wat watVar = oap1.B(this).Z0;
        int i = xhf1.b;
        return cwl1.S(watVar.i0(10.0f), watVar.i0(40.0f), watVar.i0(10.0f), watVar.i0(40.0f));
    }
}
